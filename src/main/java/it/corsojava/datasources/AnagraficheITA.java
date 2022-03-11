package it.corsojava.datasources;

class AnagraficheITA {

    public static String getAnagrafiche(){
        return anagrafiche;
    }

    private static String anagrafiche = """
Cognome;Nome;Indirizzo;Cap;Citta;Provincia;Codice Comune;Data nascita
Bruno;Rita;Viale Primo Maggio, 30;71047;STORNARA;FG;I962;25/09/1960
Ferretti;Rita;Viale XX Settembre, 125;41031;CAMPOSANTO;MO;B566;24/09/1961
Bernardi;Aldo;Vicolo Rossini, 105;13026;RIMA SAN GIUSEPPE;VC;H291;30/11/1946
Ruggiero;Vincenzo;Vicolo Vittorio Veneto, 130;25040;LOZIO;BS;E706;27/10/1954
Martinelli;Luciano;Piazza Raffaello, 105;86072;CERRO AL VOLTURNO;IS;C534;15/12/1943
Leone;Margherita;Viale Risorgimento, 128;23100;SONDRIO;SO;I829;06/06/1985
Rizzi;Sergio;Largo Bellini, 90;15023;FELIZZANO;AL;D528;17/12/1943
Villa;Carla;Via Tasso, 40;13019;VARALLO;VC;L669;25/06/1981
Longo;Luigi;Via Nazario Sauro, 92;33051;AQUILEIA;UD;A346;23/01/2014
Martino;Anna;Viale Galilei, 59;30025;FOSSALTA DI PORTOGRUARO;VE;D741;11/12/1944
Sorrentino;Salvatore;Piazza Alfieri, 44;93010;MONTEDORO;CL;F489;19/02/2008
Moretti;Mario;Piazza Risorgimento, 109;10060;PINASCA;TO;G672;24/02/2007
Pagano;Giovanna;Via Dante, 31;36020;CAMPIGLIA DEI BERICI;VI;B511;19/09/1962
Benedetti;Anna;Via Volta, 30;26010;CASALETTO VAPRIO;CR;B891;03/11/1952
Galli;Pietro;Via Oberdan, 126;34070;TURRIACO;GO;L474;14/03/2003
Bellini;Elena;Viale Verdi, 99;71040;ORDONA;FG;M266;07/11/1951
Lombardi;Antonio;Vicolo Regina Margherita, 3;97019;VITTORIA;RG;M088;30/10/1953
Morelli;Luigi;Via Vittorio Veneto, 115;19020;BORGHETTO DI VARA;SP;A992;01/01/2019
Gatti;Antonio;Via Foscolo, 66;9041;DOLIANOVA;CA;D323;12/11/1950
Ferri;Pietro;Piazza San Francesco, 42;30025;FOSSALTA DI PORTOGRUARO;VE;D741;17/06/1983
Pellegrini;Giuseppe;Vicolo Fermi, 34;4026;MINTURNO;LT;F224;24/06/1981
Martino;Rita;Via Risorgimento, 132;38079;PELUGO;TN;G429;01/12/1946
De Santis;Giorgio;Corso Bellini, 147;61039;SAN COSTANZO;PU;H809;08/10/1958
Ferri;Francesca;Vicolo Foscolo, 143;15020;SOLONGHELLO;AL;I808;26/09/1960
Marchetti;Elena;Corso Vittorio Emanuele, 129;64012;CAMPLI;TE;B515;09/11/1951
Neri;Caterina;Piazza Fermi, 75;90010;FICARAZZI;PA;D567;27/12/1940
Monti;Franco;Piazza Leonardo Da Vinci, 75;8046;PERDASDEFOGU;OG;G445;13/09/1963
Martino;Lucia;Viale Fermi, 131;32041;AURONZO DI CADORE;BL;A501;02/03/2006
Caputo;Margherita;Vicolo San Rocco, 114;83040;CARIFE;AV;B776;05/03/2005
Moretti;Lucia;Vicolo Oberdan, 49;26030;CAPPELLA DE' PICENARDI;CR;B680;12/02/2010
Longo;Salvatore;Piazza Raffaello, 92;51100;PISTOIA;PT;G713;18/09/1962
Barbieri;Carlo;Vicolo Alfieri, 73;22010;DOSSO DEL LIRO;CO;D355;02/12/1946
Testa;Pietro;Viale Volta, 107;21013;GALLARATE;VA;D869;10/07/1977
Grassi;Paola;Corso Bellini, 85;90020;SCILLATO;PA;I538;26/12/1940
Barone;Antonio;Vicolo Oberdan, 86;14042;CALAMANDRANA;AT;B376;12/09/1963
Rossetti;Giuseppe;Corso San Giovanni, 109;9010;DOMUS DE MARIA;CA;D333;13/10/1957
Russo;Domenico;Vicolo Volta, 63;52017;STIA;AR;I952;07/11/1951
Palmieri;Angela;Viale Silvio Pellico, 68;97011;ACATE;RG;A014;11/02/2010
Messina;Anna;Piazza XXIV Maggio, 101;10030;VISCHE;TO;M071;29/10/1953
Rossi;Caterina;Vicolo Donizetti, 12;24050;CORTENUOVA;BG;D066;15/12/1943
Pagano;Domenico;Piazza Piave, 126;65010;VICOLI;PE;L846;30/11/1946
Caruso;Luciano;Piazza Michelangelo Buonarroti, 96;23885;CALCO;LC;B396;10/11/1951
Lombardo;Bruno;Via Kennedy, 13;70013;CASTELLANA GROTTE;BA;C134;02/01/2019
Grassi;Franco;Corso XXV Aprile, 63;89868;ZAMBRONE;VV;M143;30/03/2000
Caputo;Rosa;Corso Galilei, 84;24040;LALLIO;BG;E422;15/01/2016
Sorrentino;Vincenzo;Viale XXIV Maggio, 96;21059;VIGGIU';VA;L876;08/08/1971
Benedetti;Luigi;Piazza Risorgimento, 127;12080;SAN MICHELE MONDOVI';CN;I037;28/11/1947
Morelli;Michele;Viale Foscolo, 92;2010;CITTAREALE;RI;C749;17/07/1976
Milani;Francesco;Corso Carducci, 61;39050;TIRES;BZ;L176;16/10/1956
Piras;Carmela;Largo Rossini, 47;26811;BOFFALORA D'ADDA;LO;A919;04/08/1972
Bianco;Vincenzo;Corso Goffredo Mameli, 116;80040;SAN GENNARO VESUVIANO;NA;H860;15/08/1970
Gatti;Michele;Vicolo Mascagni, 17;39020;SENALES;BZ;I604;07/03/2005
Giordano;Anna;Largo Verdi, 31;2042;COLLEVECCHIO;RI;C876;22/05/1988
Costantini;Antonietta;Viale Tasso, 93;12070;PERLO;CN;G458;29/01/2013
Mancini;Pietro;Largo XXIV Maggio, 72;14050;MOMBALDONE;AT;F308;18/01/2016
Mazza;Carmela;Viale Raffaello, 129;22020;VELESO;CO;L715;30/05/1986
Colombo;Pietro;Corso Nazario Sauro, 139;3044;CERVARO;FR;C545;16/08/1969
Bernardi;Franca;Vicolo Primo Maggio, 139;46026;QUISTELLO;MN;H143;27/11/1947
Coppola;Francesco;Corso San Francesco, 63;89851;SAN COSTANTINO CALABRO;VV;H807;08/05/1991
Marino;Concetta;Via Kennedy, 54;74012;CRISPIANO;TA;D171;01/02/2012
Rossetti;Anna;Piazza Alfieri, 135;28804;SAN BERNARDINO VERBANO;VB;H777;13/06/1983
Mariani;Salvatore;Largo Primo Maggio, 66;12040;CERVERE;CN;C550;10/01/2017
Pellegrini;Giovanni;Viale Silvio Pellico, 127;56022;CASTELFRANCO DI SOTTO;PI;C113;21/07/1975
Silvestri;Giuseppina;Piazza Monte Grappa, 4;89040;RIACE;RC;H265;07/06/1985
De Santis;Paolo;Via Raffaello, 94;9080;ULA' TIRSO;OR;L488;11/02/2010
Caputo;Rita;Piazza Sant'Antonio, 114;86040;CAMPOLIETO;CB;B544;18/02/2009
Orlando;Angelo;Viale Foscolo, 8;3010;TREVI NEL LAZIO;FR;L398;11/03/2004
Silvestri;Domenico;Largo Nazario Sauro, 90;39043;CHIUSA;BZ;C652;15/11/1949
Fontana;Maria;Via Bellini, 141;86100;CAMPOBASSO;CB;B519;25/08/1967
Lombardi;Carla;Vicolo Alfieri, 131;3100;FROSINONE;FR;D810;29/01/2013
Mazza;Angela;Vicolo Pascoli, 20;15056;GREMIASCO;AL;E164;21/06/1982
Giuliani;Luigi;Largo Tasso, 126;39030;VALDAORA;BZ;L552;30/11/1946
Costantini;Concetta;Viale Monte Grappa, 137;90033;CHIUSA SCLAFANI;PA;C654;09/01/2018
Caruso;Caterina;Viale Vittorio Veneto, 94;30037;SCORZE';VE;I551;31/08/1966
Marino;Pietro;Via Risorgimento, 45;16045;LORSICA;GE;E695;13/10/1957
Moretti;Lucia;Via Gorizia, 118;95030;NICOLOSI;CT;F890;16/03/2003
Parisi;Angela;Corso Fiume, 89;2018;POGGIO BUSTONE;RI;G756;03/12/1946
Colombo;Giuseppe;Via Isonzo, 16;67020;SANT'EUSANIO FORCONESE;AQ;I336;05/02/2012
Galli;Mario;Viale Piave, 84;67054;CIVITELLA ROVETO;AQ;C783;04/11/1952
Santoro;Francesca;Piazza Primo Maggio, 19;23010;DAZIO;SO;D258;07/04/1998
Caputo;Giorgio;Viale Monte Grappa, 22;30020;GRUARO;VE;E215;16/03/2003
Guerra;Margherita;Via Fermi, 55;22070;CAGNO;CO;B359;07/06/1985
Rinaldi;Luciano;Viale Gorizia, 23;70021;ACQUAVIVA DELLE FONTI;BA;A048;04/08/1972
Marchetti;Mario;Viale Fermi, 116;38055;GRIGNO;TN;E178;07/08/1971
Testa;Franco;Piazza Monte Grappa, 46;8025;OLIENA;NU;G031;29/06/1980
Sartori;Carmela;Via Fiume, 84;66010;MONTENERODOMO;CH;F578;12/04/1997
Farina;Michele;Piazza San Martino, 46;63836;MONTE VIDON CORRADO;FM;F665;05/03/2005
Bellini;Domenico;Largo Risorgimento, 26;9078;SENNARIOLO;OR;I613;30/06/1980
Marini;Margherita;Vicolo Volta, 39;87064;CORIGLIANO CALABRO;CS;D005;14/02/2010
Benedetti;Paolo;Via Umberto I, 84;87020;PAPASIDERO;CS;G320;26/03/2000
Martini;Pietro;Corso Verdi, 59;89831;SORIANO CALABRO;VV;I854;06/01/2018
Sala;Franco;Largo Volta, 46;21020;CASCIAGO;VA;B949;02/04/1999
Conti;Sergio;Vicolo Donizetti, 148;85043;LATRONICO;PZ;E474;24/09/1961
Mazza;Rita;Corso Galilei, 10;27016;LARDIRAGO;PV;E454;04/09/1965
Grassi;Vincenzo;Corso Leonardo Da Vinci, 52;84055;FELITTO;SA;D527;01/09/1966
Ferrara;Carlo;Vicolo IV Novembre, 62;12020;STROPPO;CN;I985;25/03/2001
Bianchi;Domenico;Largo Puccini, 15;23804;MONTE MARENZO;LC;F561;21/04/1995
Caruso;Rita;Piazza Monte Grappa, 75;15060;TASSAROLO;AL;L059;16/11/1949
Montanari;Margherita;Viale Petrarca, 52;15050;COSTA VESCOVATO;AL;D102;28/07/1974
Rizzi;Caterina;Largo Alfieri, 116;20089;ROZZANO;MI;H623;19/12/1942
Bernardi;Rita;Via Sant'Antonio, 124;82019;SANT'AGATA DE' GOTI;BN;I197;21/02/2008
Barone;Angela;Corso Fermi, 130;33099;VIVARO;PN;M096;14/10/1956
Sartori;Carla;Largo Manzoni, 52;10080;TRAVERSELLA;TO;L345;14/04/1996
Bruno;Carlo;Viale Goffredo Mameli, 19;86077;POZZILLI;IS;G954;11/03/2004
Ferrari;Anna Maria;Vicolo IV Novembre, 58;84075;STIO;SA;I960;27/06/1980
Greco;Salvatore;Viale Donizetti, 64;17041;ALTARE;SV;A226;28/05/1987
Silvestri;Francesco;Vicolo Tasso, 118;29019;SAN GIORGIO PIACENTINO;PC;H887;21/10/1955
Villa;Sergio;Corso Alfieri, 20;14011;BALDICHIERI D'ASTI;AT;A588;08/10/1958
Fabbri;Anna Maria;Corso Isonzo, 49;66010;CANOSA SANNITA;CH;B620;29/11/1946
Martinelli;Maria;Via Sant'Antonio, 16;35040;MEGLIADINO SAN FIDENZIO;PD;F091;27/01/2013
Farina;Maria;Vicolo Santa Maria, 17;24010;VALLEVE;BG;L623;11/09/1964
Gatti;Rosa;Largo Vittorio Emanuele, 34;30023;CONCORDIA SAGITTARIA;VE;C950;18/05/1989
Montanari;Giuseppina;Vicolo Petrarca, 114;46047;PORTO MANTOVANO;MN;G917;07/06/1984
Lombardo;Giuseppe;Via Leonardo Da Vinci, 40;71039;ROSETO VALFORTORE;FG;H568;19/12/1942
Leone;Maria;Vicolo Vittorio Veneto, 20;24060;TELGATE;BG;L087;21/08/1968
Neri;Margherita;Vicolo Michelangelo Buonarroti, 97;25087;SALO';BS;H717;26/12/1941
De Angelis;Giorgio;Largo Kennedy, 62;92021;ARAGONA;AG;A351;14/07/1977
Greco;Anna Maria;Corso Gorizia, 122;50022;GREVE IN CHIANTI;FI;E169;26/07/1974
Barone;Maria;Vicolo San Giovanni, 50;15058;VIGUZZOLO;AL;L904;25/07/1974
Santoro;Francesco;Vicolo Rossini, 55;21040;GORNATE-OLONA;VA;E104;01/05/1993
Barbieri;Luciano;Viale Puccini, 48;87050;SERRA PEDACE;CS;I650;09/08/1971
Battaglia;Antonietta;Corso Mascagni, 91;12073;CEVA;CN;C589;03/01/2019
Leone;Franco;Vicolo Mascagni, 33;89851;SAN COSTANTINO CALABRO;VV;H807;16/04/1996
Gallo;Aldo;Viale Gorizia, 35;46041;ASOLA;MN;A470;22/11/1948
Neri;Franco;Viale Mascagni, 134;3014;FIUGGI;FR;A310;06/06/1985
Donati;Giovanni;Via Volta, 74;6014;MONTONE;PG;F685;10/12/1944
Lombardi;Antonietta;Viale Manzoni, 89;88823;UMBRIATICO;KR;L492;07/11/1951
Sanna;Carlo;Piazza San Giovanni, 134;23897;VIGANO';LC;L866;06/04/1998
Mariani;Salvatore;Largo Gorizia, 78;76123;ANDRIA;BT;A285;27/03/2001
De Santis;Caterina;Piazza Gorizia, 86;9017;SANT'ANTIOCO;CI;I294;14/11/1950
Carbone;Angelo;Via Isonzo, 53;19011;BONASSOLA;SP;A961;09/12/1944
Ferretti;Anna Maria;Corso Carducci, 105;33010;VENZONE;UD;L743;13/04/1997
Marini;Pietro;Via Raffaello, 79;83017;ROTONDI;AV;H592;21/08/1968
Silvestri;Rita;Viale Umberto I, 128;39030;PREDOI;BZ;H019;14/09/1963
Martinelli;Angelo;Piazza Leonardo Da Vinci, 132;2011;ACCUMOLI;RI;A019;22/01/2015
Vitale;Vincenzo;Via Rossini, 61;28060;GRANOZZO CON MONTICELLO;NO;E143;29/11/1946
Palumbo;Angela;Corso San Giovanni, 61;13;FONTE NUOVA;RM;M309;29/06/1980
Bellini;Angelo;Vicolo Fermi, 123;18017;CIVEZZA;IM;C755;08/01/2018
D'amico;Antonio;Via Risorgimento, 62;1017;TUSCANIA;VT;L310;21/10/1955
Silvestri;Elena;Largo Tasso, 19;38060;TIARNO DI SOPRA;TN;L162;09/06/1984
Longo;Concetta;Piazza Mascagni, 83;25080;PAITONE;BS;G248;20/12/1942
Mariani;Anna Maria;Piazza IV Novembre, 53;12030;MURELLO;CN;F811;27/04/1994
Bianchi;Bruno;Largo Silvio Pellico, 12;10073;CIRIE';TO;C722;17/07/1976
Ferretti;Aldo;Via Oberdan, 138;10010;SETTIMO VITTONE;TO;I702;27/05/1987
Grassi;Carla;Largo Dante, 90;83014;OSPEDALETTO D'ALPINOLO;AV;G165;01/10/1959
Sala;Giorgio;Vicolo Cristoforo Colombo, 126;80012;CALVIZZANO;NA;B452;09/06/1984
Silvestri;Carmela;Corso Gorizia, 24;1030;VALLERANO;VT;L612;02/05/1993
Orlando;Franco;Piazza XXIV Maggio, 20;84044;ALBANELLA;SA;A128;22/06/1981
Ricci;Sergio;Largo Petrarca, 64;2030;CASAPROTA;RI;B934;22/02/2008
Donati;Mario;Corso Alfieri, 70;33080;FIUME VENETO;PN;D621;18/07/1976
Rossetti;Carlo;Piazza Isonzo, 27;27040;ROCCA DE' GIORGI;PV;H396;15/05/1990
Ruggiero;Concetta;Largo XXV Aprile, 133;17010;OSIGLIA;SV;G155;04/07/1979
Martino;Pietro;Piazza Raffaello, 60;11020;POLLEIN;AO;G794;10/02/2010
Cattaneo;Concetta;Corso San Francesco, 40;39010;AVELENGO;BZ;A507;28/11/1947
Greco;Anna;Vicolo Oberdan, 12;92023;CAMPOBELLO DI LICATA;AG;B520;09/08/1971
Rinaldi;Paola;Largo Isonzo, 120;3030;VILLA SANTA LUCIA;FR;L905;13/12/1943
Sala;Lucia;Via Verdi, 11;9010;FLUMINIMAGGIORE;CI;D639;22/11/1948
Palmieri;Giovanni;Largo Sant'Antonio, 138;10070;CANTOIRA;TO;B637;22/03/2002
Monti;Carlo;Vicolo Michelangelo Buonarroti, 27;36030;SAN VITO DI LEGUZZANO;VI;I401;21/04/1995
Guerra;Paolo;Largo Leonardo Da Vinci, 98;32037;SOSPIROLO;BL;I866;09/01/2018
Giordano;Giovanni;Piazza Foscolo, 144;71028;SANT'AGATA DI PUGLIA;FG;I193;19/10/1955
Fiore;Giuseppina;Via Vittorio Emanuele, 135;22045;LAMBRUGO;CO;E428;29/03/2000
Marini;Teresa;Viale Pascoli, 59;27010;SANTA CRISTINA E BISSONE;PV;I175;14/03/2003
Bruno;Carmela;Corso Foscolo, 83;37010;PASTRENGO;VR;G365;29/03/2000
Esposito;Margherita;Via Donizetti, 147;28070;GARBAGNA NOVARESE;NO;D911;09/01/2017
Neri;Margherita;Vicolo Pascoli, 51;37010;AFFI;VR;A061;19/03/2002
Villa;Teresa;Piazza Leonardo Da Vinci, 133;29010;MONTICELLI D'ONGINA;PC;F671;17/12/1942
Gatti;Rita;Largo Carducci, 1;17020;MAGLIOLO;SV;E816;26/03/2001
Grasso;Margherita;Vicolo Umberto I, 78;95030;SANT'AGATA LI BATTIATI;CT;I202;06/01/2018
Caputo;Domenico;Via Isonzo, 97;21022;AZZATE;VA;A531;10/09/1964
Ferri;Anna Maria;Piazza Pascoli, 9;87010;TERRANOVA DA SIBARI;CS;L124;07/02/2011
Costantini;Angela;Corso Mascagni, 29;41053;MARANELLO;MO;E904;24/02/2007
Pellegrino;Luigi;Viale Goffredo Mameli, 122;27030;SUARDI;PV;B014;01/11/1952
Basile;Rita;Piazza Risorgimento, 149;9095;MOGORO;OR;F272;02/06/1986
Gatti;Angelo;Viale Umberto I, 21;86024;PETRELLA TIFERNINA;CB;G512;08/03/2005
Caruso;Elena;Viale San Francesco, 140;9040;CASTIADAS;CA;M288;11/08/1970
Galli;Angelo;Corso Nazario Sauro, 137;10010;FIORANO CANAVESE;TO;D608;01/05/1993
Rinaldi;Giovanna;Corso Volta, 83;8028;OROSEI;NU;G119;23/01/2014
Bruno;Paolo;Vicolo Santa Lucia, 132;22070;CASTELNUOVO BOZZENTE;CO;C220;07/06/1985
Marchetti;Anna;Corso XXIV Maggio, 132;21030;DUNO;VA;D385;25/07/1974
Ferrari;Paola;Via Goffredo Mameli, 83;23835;INTROZZO;LC;E308;14/07/1977
Carbone;Anna;Vicolo Gorizia, 88;36071;ARZIGNANO;VI;A459;08/12/1944
Palmieri;Angelo;Largo IV Novembre, 27;73030;GIUGGIANELLO;LE;E053;06/02/2011
Moretti;Giuseppina;Viale Gorizia, 113;83015;PIETRASTORNINA;AV;G629;06/04/1998
De Angelis;Carlo;Largo Bellini, 5;20;ARCINAZZO ROMANO;RM;A370;19/10/1955
Gentile;Giuseppe;Viale Oberdan, 96;38040;FORNACE;TN;D714;07/04/1998
Guerra;Salvatore;Viale Silvio Pellico, 17;40020;CASALFIUMANESE;BO;B892;06/01/2018
Santoro;Aldo;Viale Vittorio Emanuele, 127;28843;MONTESCHENO;VB;F639;02/05/1992
Basile;Concetta;Piazza XX Settembre, 28;89822;SPADOLA;VV;I884;04/06/1985
Montanari;Teresa;Largo Risorgimento, 44;23886;COLLE BRIANZA;LC;C851;13/10/1957
Farina;Caterina;Vicolo Goffredo Mameli, 15;20088;GUDO VISCONTI;MI;E258;23/07/1975
Sartori;Giuseppina;Piazza Foscolo, 35;12017;ROBILANTE;CN;H377;07/10/1958
Donati;Margherita;Via Donizetti, 141;38049;VATTARO;TN;L697;16/04/1996
Amato;Sergio;Corso Michelangelo Buonarroti, 46;81057;TEANO;CE;L083;21/05/1988
Caputo;Carla;Corso Risorgimento, 14;27020;ALBONESE;PV;A171;23/02/2008
Galli;Aldo;Viale Michelangelo Buonarroti, 8;67020;CASTEL DI IERI;AQ;C090;11/08/1971
Ferraro;Teresa;Via Carducci, 77;93010;BOMPENSIERE;CL;A957;23/01/2014
Pagano;Anna;Via Fermi, 78;15016;CASSINE;AL;C027;26/10/1954
Pellegrini;Margherita;Vicolo Tasso, 101;17057;BARDINETO;SV;A647;28/10/1954
Piras;Pietro;Vicolo Isonzo, 52;63069;MONTEDINOVE;AP;F487;21/05/1988
Sorrentino;Anna Maria;Largo Puccini, 104;39040;CORTACCIA SULLA STRADA DEL VINO;BZ;D048;14/10/1956
Ferrari;Carmela;Viale Leopardi, 47;7021;ARZACHENA;OT;A453;10/06/1984
D'amico;Michele;Largo Oberdan, 128;66033;CASTIGLIONE MESSER MARINO;CH;C298;02/01/2019
Martinelli;Giovanni;Largo XXIV Maggio, 18;25080;POLPENAZZE DEL GARDA;BS;G801;11/03/2004
Giordano;Mario;Vicolo XXV Aprile, 85;23826;MANDELLO DEL LARIO;LC;E879;31/08/1966
Coppola;Rita;Via XXV Aprile, 7;92020;CAMASTRA;AG;B460;03/10/1959
Conti;Giuseppina;Vicolo Oberdan, 146;24050;GRASSOBBIO;BG;E148;12/09/1963
Rizzi;Pietro;Largo San Giovanni, 118;35040;CARCERI;PD;B749;08/11/1951
Lombardi;Luciano;Viale Rossini, 33;1022;BAGNOREGIO;VT;A577;22/07/1975
Gallo;Vincenzo;Via Pascoli, 123;42010;TOANO;RE;L184;30/05/1987
Riva;Margherita;Vicolo Vittorio Emanuele, 107;71100;FOGGIA;FG;D643;09/08/1971
Neri;Caterina;Viale IV Novembre, 28;41045;MONTEFIORINO;MO;F503;07/11/1951
Grasso;Domenico;Vicolo Dante, 117;27040;ARENA PO;PV;A387;31/05/1986
Pellegrino;Concetta;Largo San Francesco, 73;24060;GRONE;BG;E192;21/05/1988
Bruno;Carla;Largo Bellini, 85;26020;BORDOLANO;CR;A986;12/07/1977
Fiore;Francesca;Viale Raffaello, 61;24020;GROMO;BG;E189;19/02/2008
Farina;Francesca;Piazza Bellini, 106;10093;COLLEGNO;TO;C860;12/07/1977
D'amico;Maria;Largo Santa Maria, 136;16016;COGOLETO;GE;C823;03/04/1999
Marchetti;Carla;Corso Rossini, 48;61034;FOSSOMBRONE;PU;D749;01/04/1999
Martini;Francesco;Piazza Tasso, 88;89031;ARDORE;RC;A385;09/07/1978
Villa;Vincenzo;Vicolo XXIV Maggio, 131;65020;PIETRANICO;PE;G621;26/06/1980
Donati;Giorgio;Viale Kennedy, 59;87020;GUARDIA PIEMONTESE;CS;E242;06/06/1985
Serra;Franco;Corso Goffredo Mameli, 38;24060;GRONE;BG;E192;15/09/1963
Conti;Lucia;Largo Fermi, 29;98020;PAGLIARA;ME;G234;16/12/1943
Sala;Caterina;Piazza Kennedy, 56;24020;PEIA;BG;G418;23/04/1995
Cattaneo;Concetta;Largo Foscolo, 72;1030;VASANELLO;VT;A701;25/12/1941
Esposito;Aldo;Largo IV Novembre, 91;66032;CASTEL FRENTANO;CH;C114;29/10/1953
Donati;Rita;Vicolo Gorizia, 76;14030;CASTAGNOLE MONFERRATO;AT;C047;24/10/1954
Ferraro;Carlo;Viale Donizetti, 147;55021;FABBRICHE DI VERGEMOLI;LU;M319;16/12/1943
Pellegrino;Franca;Via Fiume, 33;83020;MOSCHIANO;AV;F762;01/08/1973
Barone;Concetta;Piazza Tasso, 81;10082;CUORGNE';TO;D208;19/08/1969
De Angelis;Anna;Piazza Mascagni, 60;41016;NOVI DI MODENA;MO;F966;09/12/1944
Sorrentino;Giuseppina;Via Foscolo, 94;2040;MONTENERO SABINO;RI;F579;08/07/1978
Bernardi;Aldo;Piazza IV Novembre, 92;89065;MOTTA SAN GIOVANNI;RC;F779;22/12/1941
Villa;Caterina;Piazza Puccini, 103;25061;IRMA;BS;E325;25/06/1981
Sala;Carmela;Piazza Alfieri, 143;85020;GINESTRA;PZ;E033;26/05/1987
Gallo;Antonio;Viale Rossini, 98;33020;SOCCHIEVE;UD;I777;17/11/1949
Bruno;Lucia;Via Alfieri, 18;26010;CASTELVISCONTI;CR;C290;04/10/1959
Costa;Angela;Vicolo Risorgimento, 61;87013;FAGNANO CASTELLO;CS;D464;14/04/1997
Bianchi;Giuseppe;Vicolo Sant'Antonio, 6;66036;ORSOGNA;CH;G128;20/08/1968
Donati;Paolo;Corso Sant'Antonio, 135;35040;SANT'URBANO;PD;I375;10/07/1978
Colombo;Teresa;Vicolo XXIV Maggio, 101;16042;CARASCO;GE;B726;03/02/2012
Orlando;Domenico;Viale XXV Aprile, 97;21047;SARONNO;VA;I441;05/06/1985
Rizzi;Rosa;Vicolo Dante, 107;24020;CASNIGO;BG;B978;07/01/2018
Ricci;Giovanna;Piazza Umberto I, 101;31023;RESANA;TV;H238;09/03/2005
Barbieri;Francesco;Via Nazario Sauro, 41;60010;OSTRA;AN;F401;17/07/1976
Sala;Franco;Piazza Piave, 147;33010;REANA DEL ROIALE;UD;H206;23/10/1955
Orlando;Mario;Piazza Primo Maggio, 118;2041;CASPERIA;RI;A472;07/11/1951
Rinaldi;Michele;Corso Leopardi, 108;15074;MOLARE;AL;F281;20/09/1962
Sanna;Franco;Largo San Martino, 110;33095;SAN GIORGIO DELLA RICHINVELDA;PN;H891;20/05/1989
Galli;Pietro;Vicolo Petrarca, 99;10060;PANCALIERI;TO;G303;28/12/1940
Testa;Michele;Piazza Goffredo Mameli, 26;12060;NIELLA TANARO;CN;F895;17/04/1996
Milani;Concetta;Vicolo Primo Maggio, 127;13047;OLCENENGO;VC;G016;26/03/2000
Lombardo;Vincenzo;Corso XXIV Maggio, 22;19037;SANTO STEFANO DI MAGRA;SP;I363;09/05/1991
Marini;Rita;Via Santa Lucia, 36;22010;SANT'ABBONDIO;CO;I167;28/10/1953
Vitale;Salvatore;Vicolo Volta, 149;60030;MONSANO;AN;F381;24/12/1941
Rizzo;Carla;Corso Rossini, 123;98060;PIRAINO;ME;G699;21/11/1948
Villa;Luciano;Via Fiume, 35;86010;BUSSO;CB;B295;17/04/1996
Leone;Antonietta;Largo San Martino, 2;11020;MONTJOVET;AO;F367;23/02/2008
Gallo;Rosa;Largo Nazario Sauro, 22;89020;SAN PROCOPIO;RC;I132;04/08/1972
De Santis;Carmela;Vicolo Fermi, 24;26018;TRIGOLO;CR;L426;28/02/2007
Vitali;Elena;Piazza San Francesco, 149;5022;AMELIA;TR;A262;25/10/1954
Morelli;Francesca;Vicolo Manzoni, 133;20861;BRUGHERIO;MB;B212;24/04/1994
Fontana;Pietro;Viale Petrarca, 64;81030;CASALUCE;CE;B916;23/04/1995
Martini;Antonio;Via Goffredo Mameli, 41;12021;ACCEGLIO;CN;A016;06/05/1992
De Luca;Rita;Piazza Monte Grappa, 117;26834;CORTE PALASIO;LO;D068;10/10/1957
Ferrara;Maria;Largo Raffaello, 142;89030;SAMO;RC;H013;28/01/2013
Ferraro;Paolo;Vicolo Vittorio Emanuele, 17;20068;PESCHIERA BORROMEO;MI;G488;22/07/1975
Caputo;Domenico;Vicolo Verdi, 0;73020;MARTIGNANO;LE;E984;17/04/1996
Bianco;Bruno;Via Carducci, 55;44;FRASCATI;RM;D773;31/05/1986
Farina;Giovanna;Piazza Puccini, 124;94010;CATENANUOVA;EN;C353;30/04/1993
Farina;Domenico;Via Leopardi, 130;20831;SEREGNO;MB;I625;17/06/1982
Donati;Paola;Vicolo XXIV Maggio, 7;9088;SIMAXIS;OR;I743;29/10/1953
Fabbri;Bruno;Piazza Volta, 87;85058;VIETRI DI POTENZA;PZ;L859;29/08/1967
Rizzi;Francesca;Piazza Manzoni, 45;25020;MILZANO;BS;F216;05/08/1972
Ferri;Maria;Vicolo Raffaello, 60;38047;SEGONZANO;TN;I576;27/01/2014
De Santis;Vincenzo;Viale Petrarca, 56;38010;CONTA';TN;M356;13/05/1990
Fiore;Francesco;Piazza Goffredo Mameli, 84;33030;TALMASSONS;UD;L039;15/05/1990
Piras;Luciano;Via Puccini, 23;40;LANUVIO;RM;C767;16/11/1949
Longo;Angelo;Via XXV Aprile, 106;85029;VENOSA;PZ;L738;17/06/1983
Cattaneo;Concetta;Largo Foscolo, 57;84069;ROCCADASPIDE;SA;H394;02/06/1986
Esposito;Rosa;Piazza Rossini, 148;81010;AILANO;CE;A106;16/03/2003
Romano;Luigi;Viale Vittorio Veneto, 66;25020;PRALBOINO;BS;G977;09/06/1984
Esposito;Giuseppe;Via Vittorio Veneto, 59;12070;SALE DELLE LANGHE;CN;H695;09/11/1951
Milani;Franco;Corso Pascoli, 34;65020;SANT'EUFEMIA A MAIELLA;PE;I332;01/04/1999
Villa;Vincenzo;Vicolo XXIV Maggio, 34;95049;VIZZINI;CT;M100;09/04/1998
Grassi;Mario;Largo XXIV Maggio, 60;42040;CAMPEGINE;RE;B502;04/09/1965
Vitali;Rosa;Viale Manzoni, 29;64024;NOTARESCO;TE;F942;04/02/2012
Sanna;Elena;Largo Vittorio Veneto, 142;10040;DRUENTO;TO;D373;10/12/1944
D'angelo;Salvatore;Largo Vittorio Veneto, 148;5031;ARRONE;TR;A439;10/09/1964
Martinelli;Giuseppe;Viale Leopardi, 7;88050;AMARONI;CZ;A255;19/09/1962
Mariani;Salvatore;Viale Mascagni, 104;20017;RHO;MI;H264;05/11/1952
Santoro;Margherita;Corso XXIV Maggio, 54;37064;POVEGLIANO VERONESE;VR;G945;06/06/1985
Pellegrino;Maria;Corso Foscolo, 82;33080;VAJONT;PN;M265;07/01/2018
Palmieri;Franco;Largo San Martino, 78;85050;MARSICOVETERE;PZ;E977;16/09/1963
Caputo;Concetta;Largo Nazario Sauro, 140;46031;BAGNOLO SAN VITO;MN;A575;13/07/1977
Rossetti;Caterina;Corso Santa Maria, 99;65012;CEPAGATTI;PE;C474;27/07/1974
Bellini;Francesco;Viale San Giovanni, 115;33030;DIGNANO;UD;D300;18/06/1982
Bianco;Bruno;Viale Foscolo, 76;19028;VARESE LIGURE;SP;L681;29/01/2013
Ferraro;Elena;Via Gorizia, 117;67020;NAVELLI;AQ;F852;29/01/2013
Parisi;Antonio;Piazza Raffaello, 83;35010;SANTA GIUSTINA IN COLLE;PD;I207;28/06/1980
D'angelo;Caterina;Viale Piave, 103;38032;CANAZEI;TN;B579;07/01/2018
Fabbri;Bruno;Via Puccini, 124;6040;SCHEGGINO;PG;I523;18/09/1962
Rinaldi;Giuseppina;Via Fiume, 120;35029;PONTELONGO;PD;G850;23/05/1988
Coppola;Luigi;Via Leopardi, 89;36071;ARZIGNANO;VI;A459;02/08/1972
Leone;Lucia;Corso Umberto I, 87;8020;LODE';NU;E647;04/10/1959
Pagano;Lucia;Viale Risorgimento, 32;14058;MONASTERO BORMIDA;AT;F325;02/06/1986
Santoro;Mario;Viale Umberto I, 104;25049;ISEO;BS;E333;29/10/1953
Palumbo;Carla;Vicolo Leopardi, 126;2044;FORANO;RI;D689;11/04/1997
De Santis;Aldo;Vicolo Galilei, 82;26817;SAN MARTINO IN STRADA;LO;I012;10/09/1964
Negri;Bruno;Vicolo Monte Grappa, 131;37015;SANT'AMBROGIO DI VALPOLICELLA;VR;I259;24/01/2014
Rossi;Anna;Corso Galilei, 64;62028;SARNANO;MC;I436;27/09/1960
Galli;Mario;Largo Galilei, 65;36020;ALBETTONE;VI;A154;26/08/1967
Martini;Concetta;Vicolo Goffredo Mameli, 90;67041;AIELLI;AQ;A100;18/04/1996
Longo;Mario;Via San Francesco, 140;83050;ROCCA SAN FELICE;AV;H438;31/01/2013
Rinaldi;Antonio;Piazza Oberdan, 109;90025;LERCARA FRIDDI;PA;E541;31/01/2012
De Rosa;Luigi;Piazza Primo Maggio, 13;98023;FURCI SICULO;ME;D824;08/07/1978
De Luca;Mario;Vicolo Santa Maria, 132;39055;LAIVES;BZ;E421;20/10/1955
Romano;Bruno;Vicolo Goffredo Mameli, 8;86020;CAMPOCHIARO;CB;B522;04/09/1965
Barone;Salvatore;Viale Raffaello, 124;30020;MARCON;VE;E936;20/08/1968
Caruso;Giorgio;Corso Santa Lucia, 42;83030;MONTEFUSCO;AV;F512;15/11/1949
Vitale;Caterina;Piazza Isonzo, 74;89861;PARGHELIA;VV;G335;15/06/1983
Benedetti;Angela;Vicolo Galilei, 146;12022;BUSCA;CN;B285;18/12/1942
Bellini;Margherita;Vicolo San Martino, 24;83040;FONTANAROSA;AV;D671;26/09/1960
Vitali;Franca;Vicolo Petrarca, 49;84060;ORRIA;SA;G121;18/02/2009
De Santis;Salvatore;Vicolo Isonzo, 55;28010;FONTANETO D'AGOGNA;NO;D675;27/01/2014
Gallo;Salvatore;Piazza Kennedy, 40;18018;TAGGIA;IM;L024;17/11/1949
Basile;Luigi;Vicolo XXV Aprile, 134;44047;SANT'AGOSTINO;FE;I209;14/04/1997
Messina;Bruno;Corso Goffredo Mameli, 135;20;SARACINESCO;RM;I424;03/08/1972
Fiore;Michele;Corso Risorgimento, 123;42037;COLLAGNA;RE;C840;18/05/1989
Pellegrino;Mario;Corso Fiume, 149;6081;ASSISI;PG;A475;08/12/1944
Sala;Rosa;Via Carducci, 78;82030;APOLLOSA;BN;A330;13/12/1943
Serra;Vincenzo;Viale Sant'Antonio, 72;13030;RIVE;VC;H346;10/06/1984
Pagano;Salvatore;Viale Gorizia, 28;86036;MONTENERO DI BISACCIA;CB;F576;05/03/2005
Bellini;Luigi;Via XXIV Maggio, 15;24010;VALLEVE;BG;L623;04/06/1985
Sorrentino;Anna;Viale Alfieri, 119;35020;CANDIANA;PD;B589;29/11/1946
Ruggiero;Giovanna;Corso Tasso, 98;85010;PIGNOLA;PZ;G663;23/09/1961
Bernardi;Giuseppina;Corso Verdi, 98;25081;BEDIZZOLE;BS;A729;15/07/1976
Pagano;Concetta;Via Regina Margherita, 67;12060;CASTELLINO TANARO;CN;C176;12/07/1977
Palumbo;Francesca;Via Fiume, 142;36030;CALTRANO;VI;B433;21/08/1968
Lombardo;Concetta;Largo Tasso, 57;2014;CANTALICE;RI;B627;21/12/1942
Silvestri;Michele;Via Santa Maria, 36;20060;BASIANO;MI;A697;22/01/2015
Piras;Teresa;Via Piave, 34;38010;CAMPODENNO;TN;B525;06/01/2018
Conte;Mario;Via Bellini, 77;67013;CAMPOTOSTO;AQ;B569;03/11/1952
Gatti;Francesco;Via Rossini, 105;21012;CASSANO MAGNAGO;VA;C004;05/01/2018
Palumbo;Pietro;Largo Raffaello, 124;96016;LENTINI;SR;E532;25/06/1981
Martinelli;Franco;Viale Regina Margherita, 32;81033;CASAL DI PRINCIPE;CE;B872;29/09/1960
Marino;Carmela;Vicolo Piave, 82;41057;SPILAMBERTO;MO;I903;06/02/2011
Romano;Mario;Largo Oberdan, 45;67020;CASTEL DI IERI;AQ;C090;13/09/1963
Bernardi;Luciano;Piazza Volta, 0;56046;RIPARBELLA;PI;H319;06/02/2011
Monti;Pietro;Corso Bellini, 8;75013;FERRANDINA;MT;D547;23/01/2014
Grassi;Anna;Largo Regina Margherita, 13;95100;CATANIA;CT;C351;25/06/1980
Romano;Giuseppe;Largo Fermi, 25;8016;BORORE;NU;B056;28/06/1980
Palmieri;Anna Maria;Largo IV Novembre, 124;8020;OLZAI;NU;G058;11/10/1957
Riva;Domenico;Viale Kennedy, 123;84083;CASTEL SAN GIORGIO;SA;C259;26/06/1981
Morelli;Paolo;Viale Goffredo Mameli, 137;40020;CASALFIUMANESE;BO;B892;27/01/2013
Mazza;Paolo;Largo Kennedy, 57;3040;CASTELNUOVO PARANO;FR;C223;23/10/1954
Marini;Salvatore;Via Alfieri, 93;81030;TEVEROLA;CE;L155;03/09/1966
Benedetti;Luigi;Via Mascagni, 123;16039;SESTRI LEVANTE;GE;I693;29/07/1973
Marchetti;Giorgio;Largo Fermi, 36;14049;VAGLIO SERRA;AT;L531;27/02/2007
Russo;Caterina;Viale Vittorio Veneto, 75;10070;LEVONE;TO;E566;22/02/2008
Lombardi;Francesco;Via XXIV Maggio, 39;22020;TORNO;CO;L228;08/06/1984
Palumbo;Angela;Viale Pascoli, 36;35010;CURTAROLO;PD;D226;07/12/1945
Donati;Luigi;Vicolo Umberto I, 25;80050;CASOLA DI NAPOLI;NA;B980;18/11/1949
Fabbri;Carmela;Corso Oberdan, 94;62022;CASTELRAIMONDO;MC;C251;13/05/1990
Giordano;Anna Maria;Vicolo Nazario Sauro, 133;46010;MARIANA MANTOVANA;MN;E949;18/01/2015
Caputo;Aldo;Piazza Manzoni, 90;60019;SENIGALLIA;AN;I608;02/05/1993
De Santis;Giovanna;Vicolo San Francesco, 74;40;ARDEA;RM;M213;19/12/1942
Pellegrini;Antonio;Viale Pascoli, 18;24040;CASTEL ROZZONE;BG;C255;28/06/1980
Esposito;Vincenzo;Corso XXIV Maggio, 43;39043;CHIUSA;BZ;C652;29/04/1993
Bellini;Antonio;Largo Manzoni, 52;61037;MONDOLFO;PU;F348;19/11/1949
Caruso;Rosa;Vicolo Risorgimento, 21;66022;FOSSACESIA;CH;D738;01/06/1986
Costa;Mario;Viale Pascoli, 63;9040;BURCEI;CA;B274;06/06/1985
Caputo;Sergio;Viale Nazario Sauro, 1;63838;BELMONTE PICENO;FM;A760;30/09/1959
Vitali;Angela;Corso Cristoforo Colombo, 2;28891;CESARA;VB;C567;16/10/1956
Martino;Luciano;Largo San Francesco, 139;50019;SESTO FIORENTINO;FI;I684;03/03/2006
Monti;Carla;Largo Piave, 1;88040;MIGLIERINA;CZ;F200;28/06/1980
Orlando;Carmela;Corso IV Novembre, 87;10010;SAMONE;TO;H753;16/04/1996
Bruno;Franca;Corso Donizetti, 51;82030;TORRECUSO;BN;L254;20/11/1948
Farina;Maria;Corso Leonardo Da Vinci, 101;15018;SPIGNO MONFERRATO;AL;I901;22/01/2015
Barone;Anna Maria;Viale Primo Maggio, 91;63067;COSSIGNANO;AP;D096;12/08/1970
Moretti;Anna;Piazza Vittorio Emanuele, 69;12040;PIOBESI D'ALBA;CN;G683;21/09/1962
Rossetti;Sergio;Viale Alfieri, 83;84047;CAPACCIO;SA;B644;17/05/1989
Bianchi;Maria;Via Petrarca, 31;16041;BORZONASCA;GE;B067;04/10/1959
Amato;Aldo;Largo Fiume, 2;40045;GRANAGLIONE;BO;E135;05/03/2005
Santoro;Angelo;Vicolo XXV Aprile, 97;87050;BIANCHI;CS;A842;29/01/2013
Vitale;Vincenzo;Via Bellini, 116;94015;PIAZZA ARMERINA;EN;G580;25/08/1967
Parisi;Bruno;Vicolo Goffredo Mameli, 5;74012;CRISPIANO;TA;D171;25/11/1947
Mancini;Rita;Vicolo Leopardi, 117;10083;FAVRIA;TO;D520;24/12/1941
Rossi;Maria;Largo Mascagni, 46;35010;SAN GIORGIO IN BOSCO;PD;H897;12/01/2017
Barone;Pietro;Viale Sant'Antonio, 118;13028;SCOPELLO;VC;I545;09/01/2017
Montanari;Giorgio;Vicolo Donizetti, 85;71030;CARLANTINO;FG;B784;02/03/2006
Barone;Margherita;Vicolo Fermi, 138;36040;GRISIGNANO DI ZOCCO;VI;E184;05/10/1959
Farina;Luigi;Corso Michelangelo Buonarroti, 83;92015;RAFFADALI;AG;H159;24/03/2001
De Angelis;Giovanna;Viale Foscolo, 12;50018;SCANDICCI;FI;B962;01/02/2012
Amato;Concetta;Corso Cristoforo Colombo, 141;98030;MALVAGNA;ME;E869;27/09/1960
Vitale;Giuseppe;Via Silvio Pellico, 31;87050;CARPANZANO;CS;B813;07/11/1951
Fontana;Salvatore;Viale Kennedy, 99;85050;SANT'ANGELO LE FRATTE;PZ;I288;16/11/1949
Sala;Concetta;Largo Vittorio Emanuele, 140;36040;VALDASTICO;VI;L554;20/04/1995
De Luca;Carlo;Viale Bellini, 117;41030;BASTIGLIA;MO;A713;30/04/1993
Bernardi;Maria;Corso Fiume, 79;89029;TAURIANOVA;RC;L063;25/03/2001
Lombardi;Lucia;Piazza Gorizia, 61;80061;MASSA LUBRENSE;NA;F030;07/07/1978
Lombardi;Luciano;Vicolo Donizetti, 93;13887;MAGNANO;BI;E821;24/12/1941
D'amico;Anna;Piazza San Martino, 121;74020;TORRICELLA;TA;L294;25/10/1954
Messina;Margherita;Vicolo Piave, 72;39040;VARNA;BZ;L687;22/12/1941
Barbieri;Franca;Vicolo Cristoforo Colombo, 47;27050;SANTA MARGHERITA DI STAFFORA;PV;I230;16/02/2009
Gatti;Michele;Piazza IV Novembre, 76;36055;NOVE;VI;F957;15/04/1996
Fontana;Francesco;Corso Leopardi, 57;29010;BESENZONE;PC;A823;14/07/1977
Santoro;Sergio;Vicolo Santa Lucia, 55;18024;PORNASSIO;IM;G890;30/07/1973
Marchetti;Bruno;Viale Manzoni, 27;14048;MONTEGROSSO D'ASTI;AT;F527;12/09/1963
Testa;Carla;Viale Fiume, 98;45017;LOREO;RO;E689;20/02/2008
Leone;Rita;Via Oberdan, 12;54100;MASSA;MS;F023;19/03/2002
Gallo;Lucia;Largo Isonzo, 140;86092;CANTALUPO NEL SANNIO;IS;B630;21/12/1941
Pellegrino;Elena;Corso Alfieri, 106;24060;TAVERNOLA BERGAMASCA;BG;L073;06/10/1958
Lombardo;Giorgio;Vicolo Risorgimento, 5;76015;TRINITAPOLI;BT;B915;13/02/2010
Villa;Giuseppe;Vicolo Dante, 96;36040;SOSSANO;VI;I867;09/10/1958
D'angelo;Mario;Piazza Petrarca, 114;73010;CAPRARICA DI LECCE;LE;B690;02/04/1999
Ruggiero;Anna Maria;Viale Risorgimento, 97;16016;COGOLETO;GE;C823;11/07/1977
De Angelis;Franca;Vicolo Goffredo Mameli, 133;27020;SCALDASOLE;PV;I487;15/06/1983
Coppola;Rosa;Piazza XXIV Maggio, 121;89064;MONTEBELLO IONICO;RC;D746;18/05/1989
Caruso;Giorgio;Vicolo Michelangelo Buonarroti, 59;56034;CHIANNI;PI;C609;10/03/2004
Ricci;Giovanni;Vicolo Risorgimento, 95;20;JENNE;RM;E382;23/10/1955
Giuliani;Carmela;Via XXIV Maggio, 12;62020;CESSAPALOMBO;MC;C582;06/12/1945
Lombardo;Pietro;Via XXIV Maggio, 14;63095;ACQUASANTA TERME;AP;A044;08/07/1978
De Santis;Michele;Corso Manzoni, 47;12070;CASTELLETTO UZZONE;CN;C167;19/06/1982
De Santis;Caterina;Vicolo Silvio Pellico, 86;38030;ZIANO DI FIEMME;TN;M173;03/05/1992
Farina;Anna Maria;Corso Kennedy, 47;21035;CUNARDO;VA;D204;01/05/1993
Negri;Giorgio;Vicolo Tasso, 124;84020;ROSCIGNO;SA;H564;25/03/2001
Palmieri;Anna Maria;Piazza Manzoni, 114;28836;GIGNESE;VB;E028;02/04/1999
Benedetti;Antonietta;Via San Francesco, 70;98030;GAGGI;ME;D844;13/09/1963
Parisi;Antonio;Corso Silvio Pellico, 4;10060;PANCALIERI;TO;G303;25/06/1981
Rinaldi;Francesca;Vicolo XXIV Maggio, 81;10;GALLICANO NEL LAZIO;RM;D875;02/03/2006
Marchetti;Carmela;Vicolo Primo Maggio, 22;27020;SAN GIORGIO DI LOMELLINA;PV;H885;31/05/1986
Farina;Anna Maria;Corso Cristoforo Colombo, 64;20090;OPERA;MI;G078;25/09/1960
Gallo;Margherita;Corso Carducci, 96;62035;ACQUACANINA;MC;A031;04/05/1992
Ruggiero;Carla;Vicolo Kennedy, 33;86080;MIRANDA;IS;F239;09/10/1958
Giuliani;Vincenzo;Corso XX Settembre, 71;9040;BURCEI;CA;B274;17/12/1943
Costa;Francesca;Via Alfieri, 115;16023;FONTANIGORDA;GE;D677;14/03/2003
Longo;Rita;Corso IV Novembre, 58;89822;SERRA SAN BRUNO;VV;I639;01/11/1953
D'amico;Mario;Via Piave, 140;66010;MONTENERODOMO;CH;F578;20/07/1975
Palumbo;Giuseppina;Via Mascagni, 56;58034;CASTELL'AZZARA;GR;C147;02/08/1973
Valentini;Concetta;Viale Isonzo, 34;65010;BRITTOLI;PE;B193;28/01/2013
Gatti;Elena;Via XXV Aprile, 71;31020;SAN ZENONE DEGLI EZZELINI;TV;I417;03/02/2012
Colombo;Elena;Viale Fermi, 139;81049;SAN PIETRO INFINE;CE;I113;12/03/2004
Riva;Angela;Largo Manzoni, 146;37018;MALCESINE;VR;E848;27/05/1987
Bellini;Francesca;Piazza XXV Aprile, 85;9080;NUGHEDU SANTA VITTORIA;OR;F974;25/03/2001
D'amico;Caterina;Corso XXIV Maggio, 87;33050;PRECENICCO;UD;H014;01/10/1959
Grassi;Paola;Viale XXV Aprile, 73;84040;CASAL VELINO;SA;B895;01/04/1999
Amato;Margherita;Largo XXV Aprile, 91;91028;PARTANNA;TP;G347;31/08/1966
Guerra;Paola;Via Bellini, 48;38020;COMMEZZADURA;TN;C931;26/10/1954
D'angelo;Rosa;Piazza Umberto I, 0;47020;RONCOFREDDO;FC;H542;18/08/1969
Conte;Caterina;Piazza Fermi, 91;87050;PIETRAFITTA;CS;G615;19/11/1948
Conte;Giuseppe;Corso Gorizia, 82;32030;CESIOMAGGIORE;BL;C577;04/05/1992
Mazza;Paolo;Piazza XXV Aprile, 100;84034;PADULA;SA;G226;22/04/1995
Bianchi;Bruno;Viale Isonzo, 70;23844;SIRONE;LC;I759;25/09/1960
Mazza;Francesco;Viale Vittorio Emanuele, 137;25085;GAVARDO;BS;D940;19/08/1968
Grasso;Rosa;Piazza Oberdan, 94;27030;MEZZANA BIGLI;PV;F170;05/10/1959
Monti;Francesca;Viale San Martino, 30;98060;BASICO';ME;A698;27/12/1940
Grasso;Angelo;Largo Silvio Pellico, 144;20060;POZZUOLO MARTESANA;MI;G965;07/12/1945
Ferraro;Giovanna;Piazza Piave, 33;38060;RONZO CHIENIS;TN;H551;23/10/1955
Mariani;Antonietta;Largo Vittorio Emanuele, 48;10070;USSEGLIO;TO;L516;08/04/1998
Vitale;Franca;Corso San Rocco, 119;40050;LOIANO;BO;E655;27/05/1987
Longo;Elena;Via Regina Margherita, 2;25060;LODRINO;BS;E652;01/12/1946
Bellini;Pietro;Largo XXV Aprile, 107;97011;ACATE;RG;A014;14/11/1950
Marino;Luciano;Vicolo Silvio Pellico, 55;37035;SAN GIOVANNI ILARIONE;VR;H916;07/12/1945
Leone;Antonietta;Vicolo Umberto I, 98;75021;COLOBRARO;MT;C888;09/04/1998
Barone;Paola;Corso Sant'Antonio, 2;71020;ANZANO DI PUGLIA;FG;A320;30/03/2000
Mariani;Giovanna;Viale Silvio Pellico, 128;63092;PALMIANO;AP;G289;17/03/2003
Guerra;Angela;Largo XXIV Maggio, 29;42033;CARPINETI;RE;B825;16/09/1963
Carbone;Aldo;Viale Tasso, 57;33010;REANA DEL ROIALE;UD;H206;05/06/1985
Benedetti;Antonio;Largo Bellini, 146;64010;VALLE CASTELLANA;TE;L597;09/02/2011
Pagano;Michele;Viale Volta, 123;24037;ROTA D'IMAGNA;BG;H584;09/04/1998
Conti;Franco;Piazza Dante, 131;1030;VALLERANO;VT;L612;03/04/1999
Ricci;Carlo;Piazza XXIV Maggio, 120;23898;IMBERSAGO;LC;E287;07/06/1985
Farina;Bruno;Piazza Cristoforo Colombo, 134;65023;CARAMANICO TERME;PE;B722;05/05/1992
Battaglia;Carla;Corso Leopardi, 119;46029;SUZZARA;MN;L020;02/08/1972
Negri;Angelo;Piazza Dante, 149;52032;BADIA TEDALDA;AR;A541;30/08/1966
Vitali;Giuseppina;Via Carducci, 53;27010;MIRADOLO TERME;PV;F238;04/09/1965
Costa;Carlo;Piazza Petrarca, 63;3010;FILETTINO;FR;D591;02/11/1952
Coppola;Carlo;Largo Mascagni, 14;66050;LENTELLA;CH;E531;09/10/1958
Costantini;Bruno;Corso Puccini, 1;61048;SANT'ANGELO IN VADO;PU;I287;14/11/1950
Santoro;Giuseppe;Vicolo Goffredo Mameli, 139;98070;FRAZZANO';ME;D793;22/03/2002
Farina;Giovanni;Corso Isonzo, 139;83040;MONTEMARANO;AV;F559;28/12/1940
Esposito;Giovanna;Vicolo San Giovanni, 138;26030;MALAGNINO;CR;E843;23/05/1988
Rinaldi;Aldo;Corso Kennedy, 29;21013;GALLARATE;VA;D869;23/03/2001
Cattaneo;Carlo;Corso Mascagni, 35;24060;RANZANICO;BG;H177;28/11/1947
Bernardi;Giuseppe;Via Vittorio Emanuele, 64;87070;CERCHIARA DI CALABRIA;CS;C489;20/02/2008
Lombardi;Lucia;Piazza Risorgimento, 67;27020;TRAVACO' SICCOMARIO;PV;I236;05/06/1985
Damico;Concetta;Via XXIV Maggio, 128;28053;CASTELLETTO SOPRA TICINO;NO;C166;30/10/1953
Palmieri;Luigi;Viale Petrarca, 13;13876;SANDIGLIANO;BI;H821;07/11/1951
Rizzo;Carla;Largo Rossini, 111;22022;CASASCO D'INTELVI;CO;B942;23/02/2008
Mariani;Aldo;Viale Tasso, 117;88040;SAN MANGO D'AQUINO;CZ;H976;14/11/1950
De Rosa;Bruno;Largo Pascoli, 138;2047;POGGIO MIRTETO;RI;G763;03/11/1952
Barone;Paolo;Vicolo Fermi, 54;41042;FIORANO MODENESE;MO;D607;04/12/1945
Vitali;Francesco;Largo Santa Lucia, 59;82021;SANT'ARCANGELO TRIMONTE;BN;F557;02/05/1993
Ferrari;Anna Maria;Viale Volta, 86;84030;MONTE SAN GIACOMO;SA;F618;21/02/2008
Ferri;Michele;Piazza San Francesco, 38;10050;MATTIE;TO;F058;08/08/1971
Orlando;Anna Maria;Vicolo XXIV Maggio, 131;24060;VIGOLO;BG;L894;09/09/1964
Fiore;Paolo;Piazza Risorgimento, 55;87074;ROCCA IMPERIALE;CS;H416;12/09/1963
Sorrentino;Concetta;Piazza Goffredo Mameli, 6;33010;DOGNA;UD;D316;11/01/2017
            """;
}
