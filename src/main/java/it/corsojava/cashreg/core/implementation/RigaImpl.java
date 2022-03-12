package it.corsojava.cashreg.core.implementation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import it.corsojava.cashreg.core.Riga;
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
    
    @Column(name="sconto")
    @Type(type = "it.corsojava.cashreg.core.implementation.storeengine.ScontoUserType")
    private Sconto sconto;
    
    @Column(name="iva")
    @Type(type = "it.corsojava.cashreg.core.implementation.storeengine.IvaUserType")
    private Iva iva;
    
    protected RigaImpl(){

    }
    
    public int getIdRiga() {
		return idRiga;
	}

	public void setIdRiga(int idRiga) {
		this.idRiga = idRiga;
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
    	this.sconto=sconto;
    }
    @Override
    public Sconto getSconto(){
    	return this.sconto;
    }
    
    @Override
    public void setIva(Iva iva){
    	this.iva=iva;
    }
    @Override
    public Iva getIva(){
        return this.iva;
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
}
