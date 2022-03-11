package it.corsojava.datasources;

public class StringDataSources {

    /**
     * <p>Elenco di anagrafiche in formato csv che utilizza ";" come separatore di colonna e invio
     * come separatore di riga, senza qualificatore di testo</p>
     * <p><b>Intestazioni</b> (prima riga)</p>
     * <p>Cognome;Nome;Indirizzo;Cap;Citta;Provincia;Codice Comune;Data nascita</p>
     * @return
     */
    public static String getAnagrafiche(){
        return AnagraficheITA.getAnagrafiche();
    }

    /**
     * <p>Elenco di anagrafiche in formato csv che utilizza ";" come separatore di colonna e invio
     * come separatore di riga, con qualificatore di testo doppi-apici</p>
     * <p><b>Intestazioni</b> (prima riga)</p>
     * <p>"first_name";"last_name";"company_name";"address";"city";"county";"state";"zip";"phone1";"phone2";"email";"web"</p>
     * @return
     */
    public static String getContacts(){
        return ContactsUSA.getContacts();
    }

    /**
     * <p>Elenco dei comuni italiani in formato csv che utilizza "tab" come separatore di colonna e invio
     * come separatore di riga, senza qualificatore di testo</p>
     * <p><b>Intestazioni</b> (prima riga)</p>
     * cod_comune   cap denominazione   provincia   cod_istat
     * @return
     */
    public static String getComuni(){
        return Comuni.getComuni();
    }


    /**
     * <p>Elenco dei articoli di esempio in formato csv con ";" come separatore di colonna e invio
     * come separatore di riga, senza qualificatore di testo</p>
     * <p><b>Intestazioni</b> (prima riga)</p>
     * <p>codArticolo;barcode;denominazione;descrizione;prezzoUnitario;aliquotaIva</p>
     * @return
     */
    public static String getArticoli(){
        return Articoli.getArticoli();
    }

}
