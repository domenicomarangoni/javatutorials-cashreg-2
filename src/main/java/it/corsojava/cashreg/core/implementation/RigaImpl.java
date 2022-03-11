package it.corsojava.cashreg.core.implementation;

import java.util.Properties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import it.corsojava.cashreg.core.Riga;
import it.corsojava.cashreg.core.datatypes.base.PercOutOfRangeException;
import it.corsojava.cashreg.core.datatypes.specifici.Iva;
import it.corsojava.cashreg.core.datatypes.specifici.Sconto;

@Entity
@Table(name="righe")
public class RigaImpl implements Riga {

	@Id
	@Column(name="idRiga")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idRiga;
	
    private double prezzoUnitario;

    private double quantita;
    private String descrizione;
    
    private double scontoValue;
    private String ivaValue;
    
    protected RigaImpl(){

    }
    
    public int getIdRiga() {
		return idRiga;
	}

	public void setIdRiga(int idRiga) {
		this.idRiga = idRiga;
	}

	public double getScontoValue() {
		return scontoValue;
	}

	public void setScontoValue(double scontoValue) {
		this.scontoValue = scontoValue;
	}

	public String getIvaValue() {
		return ivaValue;
	}


	public void setIvaValue(String ivaValue) {
		this.ivaValue = ivaValue;
	}



	@Override
    public void setPrezzoUnitario(double prezzoUnitario){
        this.prezzoUnitario=prezzoUnitario;
    }
    @Override
    public double getPrezzoUnitario(){
        return this.prezzoUnitario;
    }
    @Override
    public void setSconto(Sconto sconto){
    	this.scontoValue=sconto.getValue();
    }
    @Override
    public Sconto getSconto(){
        try {
			return new Sconto(this.scontoValue);
		} catch (PercOutOfRangeException e) {
			return null;
		}
    }
    @Override
    public void setIva(Iva iva){
    	this.ivaValue=iva.toString();
    }
    @Override
    public Iva getIva(){
        return Iva.valueOf(this.ivaValue);
    }
    @Override
    public void setQuantita(double quantita){
        this.quantita=quantita;
    }
    @Override
    public double getQuantita(){
        return this.quantita;
    }
    @Override
    public String getDescrizione() {
        return this.descrizione;
    }
    @Override
    public void setDescrizione(String descrizione) {
        this.descrizione=descrizione;
    }

    @Override
    public double getPrezzoTotale() {
        double temp=0.0;
        temp=prezzoUnitario * quantita;
        if(this.getSconto() !=null){
            temp -= this.getSconto().calcolaValore(temp);
        }
        if(this.getIva()!=null){
            temp += this.getIva().calcolaValore(temp);
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(quantita);
        sb.append(" X ");
        sb.append(prezzoUnitario);
        sb.append(" - ");
        sb.append(getSconto() != null ? getSconto().getValue() : 0);
        sb.append("% ");
        if(getIva()!=Iva.IVA_0){
            sb.append(" + ");
            sb.append(getIva());
            sb.append("% ");
        }
        sb.append(" = ");
        sb.append(getPrezzoTotale());
        return sb.toString();
    }

    public Properties toProperties(){
        Properties rProp=new Properties();
        rProp.setProperty("descrizione",descrizione!=null ? descrizione : "");
        rProp.setProperty("prezzoUnitario",prezzoUnitario+"");
        rProp.setProperty("quantita", quantita+"");
        rProp.setProperty("sconto", getSconto() != null ? getSconto().getValue()+"" : "0.0");
        rProp.setProperty("iva",getIva()+"");
        return rProp;
    }

    public static Riga fromProperties(Properties p) {
        if(p!=null){
            try {
                RigaImpl r = new RigaImpl();
                r.setPrezzoUnitario(Double.parseDouble(p.getProperty("prezzoUnitario")));
                r.setQuantita(Double.parseDouble(p.getProperty("quantita")));
                r.setSconto(new Sconto(Double.parseDouble(p.getProperty("sconto"))));
                r.setIva(Iva.valueOf(p.getProperty("iva")));
                r.setDescrizione(p.getProperty("descrizione"));
                return r;
            }catch (Exception ex){
                throw new UnsupportedOperationException("Unable to convert properties to instance",ex);
            }
        }else throw new IllegalArgumentException();
    }



}
