package it.corsojava.cashreg.core.implementation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import it.corsojava.cashreg.core.Riga;
import it.corsojava.cashreg.core.Scontrino;
import it.corsojava.cashreg.core.StatoScontrino;
import it.corsojava.cashreg.core.TipiScontrino;

@Entity
@Table(name="scontrini")
public class ScontrinoImpl implements Scontrino {

	@Id
	@Column(name="id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idScontrino;
	
    private String intestazione;
    private String pieDiPagina;
    private LocalDate data;
    private LocalTime ora;
    
    private String tipoScontrino;
    private String statoScontrino;
        
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idScontrino")
    Set<RigaImpl> righe;

    protected ScontrinoImpl(){
        tipoScontrino=TipiScontrino.VENDITA.toString();
        intestazione="";
        pieDiPagina="";
        data=LocalDate.now();
        ora=LocalTime.now();
        righe = new HashSet<RigaImpl>();
    }

    @Override
    public String getId() {
        return this.idScontrino+"";
    }

    protected void setId(String id){
        try {
        	this.idScontrino=Integer.parseInt(id);
        }catch(IllegalArgumentException iea) {
        	iea.printStackTrace();
        }
    }
    
    public String getTipoScontrino() {
		return tipoScontrino;
	}

	public void setTipoScontrino(String tipoScontrino) {
		this.tipoScontrino = tipoScontrino;
	}

	public String getStatoScontrino() {
		return statoScontrino;
	}

	public void setStatoScontrino(String statoScontrino) {
		this.statoScontrino = statoScontrino;
	}

	@Override
    public TipiScontrino getTipo() {
		return TipiScontrino.valueOf(this.tipoScontrino);
    }

    @Override
    public void setTipo(TipiScontrino tipo) {
        this.tipoScontrino=tipo.toString();
    }

    @Override
    public StatoScontrino getStato() {
        return StatoScontrino.valueOf(this.statoScontrino);
    }

    @Override
    public void setStato(StatoScontrino stato) {
        this.statoScontrino=stato.toString();
    }

    @Override
    public String getIntestazione() {
        return intestazione;
    }

    @Override
    public void setIntestazione(String intestazione) {
        this.intestazione = intestazione;
    }

    @Override
    public String getPieDiPagina() {
        return pieDiPagina;
    }

    @Override
    public void setPieDiPagina(String pieDiPagina) {
        this.pieDiPagina = pieDiPagina;
    }

    @Override
    public LocalDate getData() {
        return this.data;
    }

    @Override
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public LocalTime getOra() {
        return this.ora;
    }

    @Override
    public void setOra(LocalTime ora) {
        this.ora=ora;
    }

    @Override
    public Set<Riga> getRighe() {
    	Set<Riga> result=new HashSet<Riga>();
    	this.righe.forEach(r -> result.add(r));
        return result;
    }

    @Override
    public void setRighe(Set<Riga> righe) {
        this.righe = new HashSet<RigaImpl>();
        righe.forEach(r -> {
        	righe.add((RigaImpl)r);
        });
    }

    @Override
    public double getTotaleComplessivo() {
        double temp=0;
        for(Riga r : righe){
            temp += r.getPrezzoTotale();
        }
        return temp;
    }

    @Override
    public Riga creaNuovaRiga() {
        Riga r = new RigaImpl();
        this.righe.add((RigaImpl)r);
        return r;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb      .append(idScontrino)
                .append(" - ")
                .append(getData())
                .append(" - ")
                .append(getOra())
                .append(" - ")
                .append(tipoScontrino)
                .append(" ")
                .append(getTotaleComplessivo());
        return sb.toString();
    }

    public Properties toProperties(){
        Properties sProp=new Properties();
        sProp.setProperty("id",getId()!=null? getId() :"");
        sProp.setProperty("data", data!=null ?data.format(DateTimeFormatter.ISO_LOCAL_DATE):"");
        sProp.setProperty("ora", ora!=null ? ora.format(DateTimeFormatter.ISO_LOCAL_TIME):"");
        sProp.setProperty("intestazione",intestazione!=null?intestazione:"");
        sProp.setProperty("pieDiPagaina",pieDiPagina!=null ? pieDiPagina : "");
        sProp.setProperty("stato",""+getStato());
        sProp.setProperty("tipo",""+getTipo());
        return sProp;
    }

    public static Scontrino fromProperties(Properties p) {
        if(p!=null){
            try {
                ScontrinoImpl s = new ScontrinoImpl();
                s.setId(p.getProperty("id"));
                s.setData(LocalDate.parse(p.getProperty("data"), DateTimeFormatter.ISO_LOCAL_DATE));
                s.setOra(LocalTime.parse(p.getProperty("ora"), DateTimeFormatter.ISO_LOCAL_TIME));
                s.setIntestazione(p.getProperty("intestazione"));
                s.setPieDiPagina(p.getProperty("pieDiPagaina"));
                s.setStato(StatoScontrino.valueOf(p.getProperty("stato")));
                s.setTipo(TipiScontrino.valueOf(p.getProperty("tipo")));
                return s;
            }catch (Exception ex){
                throw new UnsupportedOperationException("Unable to convert properties to instance",ex);
            }
        }else throw new IllegalArgumentException();
    }


}
