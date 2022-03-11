package it.corsojava.datasources;

class Articoli {

    public static String getArticoli(){
        return articoli;
    }

    private static String articoli = """
        codArticolo;barcode;denominazione;descrizione;prezzoUnitario;aliquotaIva
        E71U10U;1;CJL Smart TV 55" Ultra HD 4K, Wi-Fi;Tipologia: qled smart TV da 55";540;22
        O86P70P;2;Scaldavivande Elettrico 2 in 1 per Auto/Camion e Ufficio;Doppio voltaggio, scalda velocemente, facile pulizia;31;22
        D65M58M;3;Miele grezzo bio  400g;Miele puro e biologico in confezione di vetro;14;10
        Q17X42D;4;Olio Extravergine di oliva 1Lt;100% italiano;8;10
        A79S01Q;5;Portapenne in plastica decorato a mano;Prodotto artigianale;16;22
        H54A36A;6;Felpa Ragazzo con Cappuccio Tinta Unita taglia M;Puro cotone, design elegante;38;22
        J47Q87A;7;Set chiavi a brugola ;;16;22
        R88E29H;8;DIFFUSORE IN CRISTALLO;30 x 25 cm;71;22
        U26O14J;9;TRASFORMATORE 6VA 120V/12V;con protezione termica, cavettatura e dischi;28;22
        P11D64R;10;Monitor Samsung 40";Monitor Samsung 40" LH40DBDPLGC/EN;261;22
        M67Q71U;11;Monitor Samsung 55";Monitor Samsung 55" LH55DBDPLGC/EN;418;22
        X55A87P;12;Consegna a domicilio;;10;4
        S74H75M;13;Conf 100 capsule Oro/Arabica;Compatibili Nespresso;20;22
        A98J94M;14;SAMSUNG CLX-3305;Laser a colori - Formato A4  Vel max: 18ppm b/n, 4ppm colori;185;22
        Q4247X;15;NIKON Borsa;Borsa per fotocamera;72;22
        """;


}
