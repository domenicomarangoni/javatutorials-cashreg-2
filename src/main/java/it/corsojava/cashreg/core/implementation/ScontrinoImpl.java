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

import org.hibernate.annotations.Type;

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
    
    @Column(name="tipo")
    @Type(type = "it.corsojava.cashreg.core.implementation.storeengine.TipoScontrinoUserType")
    private TipiScontrino tipo;
    
    @Column(name="stato")
    @Type(type = "it.corsojava.cashreg.core.implementation.storeengine.StatoScontrinoUserType")    
    private StatoScontrino stato;
        
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idScontrino")
    Set<RigaImpl> righe;

    protected ScontrinoImpl(){
        tipo=TipiScontrino.VENDITA;
        intestazione="";
        pieDiPagina="";
        data=LocalDate.now();
        ora=LocalTime.now();
        righe = new HashSet<RigaImpl>();
        stato= StatoScontrino.NUOVO;
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
    
	@Override
    public TipiScontrino getTipo() {
		return this.tipo;
    }

    @Override
    public void setTipo(TipiScontrino tipo) {
        this.tipo=tipo;
    }

    @Override
    public StatoScontrino getStato() {
        return this.stato;
    }

    @Override
    public void setStato(StatoScontrino stato) {
        this.stato=stato;
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
                .append(tipo.toString())
                .append(" ")
                .append(getTotaleComplessivo());
        return sb.toString();
    }
}
