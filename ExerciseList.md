# Lista Esercizi Assegnati dal Prof.Boldi

+ B1    Leggere un BigInteger e stampare l'unità
+ B2    Leggere un BigInteger e stampare le decine
+ B3    Leggere un BigInteger e convertirlo in binario
+ B4    Stampare la prima metà di una stringa
+ B5    Stampare la seconda metà di una stringa
+ B6    Dati gli anni di nascita di due utenti, visualizzare chi è più vecchio
+ B7    Stabilire se un numero è pari
+ B8    Stabilire se un numero è multiplo di 100
+ B9    Leggo il nome e cognome di una persona e devo stabilire in modo approssimativo se è uomo o donna (se finisce con A è donna se con O uomo, altrimenti non lo so)
+ B10   Acquisire numero in binario e visualizzarlo in decimale
+ B11   Soluzione di un equazione di secondo grado
+ B12   Chiedere due numeri n1,n2 in base b1, b2 e decidere se è più grande n1 o n2.
+ B13   Controllo del codice fiscale (6char,2num,1char,2num,1char,3num,1char) (usare Character.isLetter(c)) e capire se è maschio o femmina (giorno di nascita + 40)
+ B14   Dato un anno vedere se è bisestile
+ B15   Scrivete un programma che legga una sequenza di interi, terminata dall’intero 1, e stampi quanti sono gli interi che hanno due cifre di cui la prima è un 5
+ B16   Scrivete un programma che legga ripetutamente delle stringhe contenenti un certo numero di ∗ e un solo carattere /.  Dovete, per ognuna di esse, stampare
        1  o  0  a  seconda  che  nella  parte  dopo  la / compaia  qualche ∗ oppure no.  Il programma termina quando viene inserita la stringa vuota
+ B17   Scrivete  un  programma  che  legga  una  stringa  e  la  ristampi  sostituendo a  ogni  carattere  il  numero  di  occorrenze  complessive  di  quel  carattere
        nella stringa.  Ad esempio, se la stringa fosse “cartamusica” il programma dovrebbe stampare “23113111123”.  (Infatti la ’c’ è ripetuta 2 volte, 
        la ’a’ è ripetuta 3 volte, tutte le altre lettere sono ripetute 1 volta)
+ B18   Scrivete un programma che legga un certo numero di interi (al massimo 100), terminati dall’intero -1, e che alla fine ristampi la cifra delle unità di ciascuno.
+ B19   Scrivete un metodo statico di nome f che data come argomenti una stringa restituisca come risultato la sua prima metà (arrotondata per difetto se la stringa ha
        lunghezza dispari).  Ad esempio, se la stringa `e “ciao” il metodo deve restituire “ci”, mentre se la stringa `e “ritardo” deve restituire “rit”.
+ B20   Scrivete un metodo statico di nome salta che data una stringa x e dato un intero r , restituisca la stringa ottenuta prendendo un carattere ogni r
        (a partire dal primo). Ad esempio salta( "tartassare" , 3) deve restituire “ttsr”, mentre salta("barzelletta",2) deve restituire “brelta”


# Lista Esercizi Assegnati dalla Prof.Morpurgo

### Parte 1 : Il tipo int e i 5 operatori aritmetici (+, -, *, /, %). La classe String e i metodi length, substring, indexOf e charAt.

+ M1_1  Scrivere un programma che legge da standard input un numero intero >= 1 e <= 99, (il programma non deve fare controlli sull'input) e stampa il numero di 
        monete di ogni taglio che corrisponde a quella cifra. La combinazione di monete deve essere quella con il minor numero totale di monete.
+ M1_2  Scrivere un programma che legge da standard input una stringa e ne stampa la lunghezza, i primi 2 caratteri, dal secondo carattere in poi, la posizione della 
        prima 'a'.
+ M1_3  Scrivere un programma che legge da standard input una stringa e una sua sottostringa e stampa la posizione della sottostringa nella 
        stringa (cioe` la posizione a partire dalla quale si trova la sottostringa).
+ M1_4  Scrivere un programma che legge da standard input una riga di parole e stampa la prima parola.
+ M1_5  Scrivere un programma che legge da standard input due numeri interi, li salva in due variabili e stampa il contenuto delle due variabili, 
        poi scambia il contenuto della prima variabile con il contenuto della seconda variabile e di nuovo stampa.
+ M1_6  Scrivere un programma che, utilizzando solo il tipo int e i cinque operatori aritmetici (+, -, *, /, %), legge da standard input un numero di quattro cifre
        e lo visualizza una cifra per riga.
+ M1_7  Scrivere un programma che legge da standard input come stringa un numero di quattro cifre, per esempio 2016, e lo visualizza una cifra per riga. 
+ M1_8  Scrivere un programma che legge da standard input un numero binario di quattro cifre, per esempio 1100, e lo converte nel corrispondente numero decimale.  
+ M1_9  Scrivere un programma che legge da standard input tre numeri interi e ne visualizza la media.

### Parte 2 : operatori di confronto (==, !=, >, >=, ...), operatori booleani (!, &&, ||), metodi equals e compareTo , if e switch.

+ M2_1  Scrivere un programma che chiede all'utente il nome. Poi, se il nome e` "Gianni", stampa "Ciao, Gianni!", altrimenti stampa "non ti conosco".
+ M2_2  Scrivere un programma che controlla la validita` dei dati di inizio e fine di un impegno e stampa un messaggio solo nel caso la fine preceda l'inizio. A fine 
        esecuzione il programma deve stampare "STOP".
+ M2_3  Scrivere un programma che legge una parola e, a seconda della sua lunghezza dice se ha : piu , meno o esattamente x caratteri.
+ M2_4  Scrivere un programma che legge una parola e, a seconda della lettera con cui finisce dice se è maschile e femminile , plurale o singolare.
+ M2_5  Scrivere un programma che legge una parola e la  stampa in maiuscolo. Inoltre, se viene letta una delle parole : asino cane gatto , stampa : hai indovinato.
+ M2_6  Scrivere un programma che chiede reddito e stato civile e calcola le tasse da pagare secondo questa regola : 
        se non coniugato (0 - 32000 10%, > 32000 25%) , se coniugato (0 - 64000 10%, > 64000 25%)
        Scrivere una seconda soluzione utilizzando un if solo (quindi senza annidamenti) e gli operatori logici.
+ M2_7  Scrivere un programma che associa voti in lettere a punteggi secondo la seguente tabella:
                90 - 100 A
                80 - 89	 B
                70 - 79	 C
                60 - 69	 D
                0 - 59	 F
+ M2_8  Scrivere un programma che riceve in ingresso un numero intero e stampa "Fizz" se il numero e' multiplo di 3, "Buzz" se il numero e' multiplo di 5, altrimenti 
        stampa il numero stesso.
+ M2_9  Scrivere un programma che chiede all'utente due interi corrispondenti al giorno e mese di una data e calcola il numero del giorno dell'anno (cioè il numero di
        giorni dall'inizio dell'anno). Utilizzare il costrutto switch.
+ M2_10 Scrivere un programma che mostra un menu con quattro scelte indicate con le lettere dalla a alla d. L'utente scrive la lettera corrispondente alla sua scelta
        e il programma mostra un messaggio che indica la scelta effettuata. Chiamare scelta la variabile in cui salvare l'opzione.
+ M2_11 Scrivere un programma che legge un intero n>=0  e, a seconda del valore di n, stampa se è pari o dispari.
+ M2_12 Scrivere un programma che legge  due parole e stampa la seconda in ordine lessicografico.
+ M2_13 Scrivere un programma che legge un intero n>=0, rappresentante l'eta' di una persona,  e stampa il punteggio associato.
  	                                ETA             PUNTI
  	                                0 ..  15   --->    20      
  	                                16 .. 35   --->    10      
  	                                36 .. 48   --->    30      
  	                                49 .. 59   --->    10      
  	                                60 .. 75   --->    20       
  	                                76 ...80   --->    30      
 	                                81 ....    --->    20      
+ M2_14 Scrivere un programma che legge una parola e la stampa in maisucolo, sostituendo il primo e l'ultimo carattere con il carattere '*'.
+ M2_15 Scrivere un programma che legge una parola, la trasforma in maiuscola e la scrive su due righe dividendola a metà se la parola ha lunghezza dispari, la parola
        sulla prima riga deve  essere piu' lunga di un carattere di quella sulla seconda riga.
+ M2_16 Scrivere un programma che legge da tastiera una parola, ne estrae la stringa contenente il carattere centrale e la stampa su monitor. Se la stringa ha un numero
        pari di caratteri, la stringa estratta deve contenere i due caratteri centrali.
  
### Parte 3 : I costrutti di iterazione: for, while, do.

+ M3_1  Scrivere un programma che legge una sequenza di parole, una per riga, e restituisce la lunghezza minima, media e massima delle parole lette.
        Il programma termina con EOF (invio e ctrl D da tastiera).
+ M3_2  Scrivere un programma che legge una stringa composta di soli 0 e 1 e fa la conversione da binario a decimale del numero binario rappresentato dalla stringa. Il
        programma stampa il risultato.
+ M3_3  Scrivere un programma che legge un intero; se il numero è una potenza di 2, stampa che potenza e', altrimenti stampa il messaggio "non e' una potenza di due".
+ M3_4  Scrivere un programma che legge una stringa e controlla se è composta tutta di 0; stampa "tutti zeri" o "non tutti zeri", a seconda del caso.
+ M3_5  Scrivere un programma che legge un intero positivo n e stampa n asterischi.
+ M3_6  Scrivere un programma che somma i numeri in input da tastiera e stampa il risultato. Il programma si ferma quando il numero in ingresso e` zero (valore
        sentinella).
+ M3_7  Scrivere un programma che somma i numeri in input da tastiera e stampa il numero di numeri letti e la somma. Il programma si ferma quando la somma raggiunge o
        supera 100
+ M3_8  Scrivere un programma che, dato un capitale iniziale e un tasso di interesse annuo, accredita con scadenza annuale gli interessi e si ferma quando il capitale
        raggiunge un certo ammontare (ad esempio il doppio del capitale iniziale), il programma stampa il capitale raggiunto ogni anno e poi il numero
        di anni occorrenti.
+ M3_9  Scrivere un programma che legge una parola e compie le seguenti operazioni: stampa la parola sostituendo tutti i caratteri con  il carattere '*', 
        stampa la parola in minuscolo sostituendo tutte le "a" con asterischi, stampa la parola in minuscolo eliminando le "a", Stampa la parola in minuscolo sostituendo tutte le vocali
        con il carattere '*', stampa la parola in minuscolo eliminando le vocali.
+ M3_10 Scrivere un programma che per i numeri da 1 a 10 stampa : Il quadrato di x è x*x ovvero : (risultato).
+ M3_11 Scrivere un programma che legge un intero positivo k e stampa somma e prodotto dei primi k interi.
+ M3_12 Scrivere un programma che legge un intero positivo n e stampa un quadrato di asterischi di lato n.
+ M3_13 Scrivere un programma che legge un intero positivo n e stampa un triangolo di asterischi di cateto n.
+ M3_14 Scrivere un programma che legge un intero positivo n e stampa un triangolo rovesciato di asterischi di cateto n.

### Parte 4 : I metodi statici, la classe Math, le classi involucro.

+ M4_1  Scrivere una classe Es1 che contenga un metodo statico saluto() che stampa un saluto (es. Buongiorno, amico) e un metodo main che invoca tale metodo.
+ M4_2  Scrivere una classe Es2 che contenga un metodo statico saluto(String nome, int n) che stampa n volte il saluto "Buongiorno, ..." mettendo il nome passato come 
        parametro, e un metodo main che chiede all'utente un nome e un numero e invoca tale metodo passandogli come argomenti i valori letti.
+ M4_3  Scrivere una classe Es3 che contenga un metodo statico int areaRettangolo(int base, int altezza) che restituisce l'area di un rettangolo con quelle 
        dimensioni e un metodo main che chiede all'utente due interi, invoca tale metodo passandogli come argomenti i valori letti, visualizza il risultato restituito 
        dal metodo. Aggiungere alla classe Es3 un metodo int areaQuadrato(int lato) che usa il metodo areaRettangolo per calcolare l'area di un quadrato. 
        Aggiungere al main anche un'invocazione di questo metodo.
+ M4_4  Scrivere una classe Es4 che contenga un metodo statico int rapporto(int base, int altezza) che restituisce n/m se n e' maggiore di m, e m/n altrimenti, e un 
        metodo main che chiede all'utente due interi, invoca tale metodo passandogli come argomenti i valori letti, visualizza il risultato restituito dal metodo.
+ M4_5  Implementare una classe StampaEuro che disponga di : un metodo statico int euro(double valore) che restituisce la parte in euro di un importo 
        espresso come double , un metodo statico int cent(double valore) che restituisce la parte in centesimi (troncata) di un importo espresso come double , un metodo
        stampaEuro(int euro, int cent) che visualizza l'importo preceduto da "Eu" e rappresentato come euro.cent, un metodo main che chiede all'utente un valore double,
        invoca i tre metodi per stampare l'importo corrispondente.
+ M4_6  Assumendo che una data venga espressa nel formato gg/mm/aaaa, implementare una classe CheckData che disponga di : un metodo statico int giorno(String data) che
        restituisce il giorno, un metodo statico int mese(String data) che restituisce il mese, un metodo statico int anno(String data) che restituisce l'anno, 
        un metodo statico boolean isBisestile(int anno) che restituisce true se l'intero corrisponde a un anno bisestile e false altrimenti, un medoto boolean 
        giornoOk(int giorno, int mese, int anno) che restituisce true se il giorno è valido per il mese e l'anno considerati, un metodo main che chiede all'utente 
        una data nel formato gg/mm/aaaa e controlla se la data è valida e visualizza un messaggio corrispondente (es. "Data valida" / "Data non valida").
+ M4_7  Implementare una classe StatisticheTesto che disponga di un metodo int numVocali(String testo) che restituisce il numero di vocali (a,e, i, o u) contenute 
        in testo, un metodo int numConsonanti(String testo) che restituisce il numero di consonanti (assumiamo non ci siano lettere accentate) contenute in testo, un
        metodo main che legge del testo (più parole o più righe, si ferma a EOF) e visualizza le seguenti statistiche:
        numero totale di vocali
        numero totale di consonanti
        numero totale di altri caratteri (punteggiatura, spazi, ecc)
        percentuale vocali sul totale
        percentuale consonanti sul totale
        percentuale altro sul totale
+ M4_7  Implementare una classe Conversioni che disponga di un metodo double celsiusToFahrenheit(double gradi), un metodo double fahrenheitToCelsius(double gradi),
        un metodo double cmToInch(double misura), un metodo double inchToCm(double misura), un metodo main che chiede all'utente un valore double e gli propone un menu 
        di quattro opzioni di conversione, invoca il metodo opportuno e visualizza il risultato.
+ M4_8  Implementare una classe AlfabetoFarfallino che disponga di un metodo int nextVowel(String testo) che restituisce la posizione della prima vocale e -1 se non ci
        sono vocali, un metodo String farfalla(String testo) che restituisce il testo tradotto in farfallino (es. casa -> cafasafa), un metodo main che legge del testo
        (una o più righe, si ferma a EOF) e visualizza il testo in farfallino.
+ M4_9  Implementare una classe CodiceFiscale che disponga di un metodo String CFcognome(String testo) che restituisce la parte di codice fiscale relativa al cognome,
        un metodo String CFcnome(String testo) che restituisce la parte di codice fiscale relativa al nome, un metodo main che chiede nome e cognome e visualizza 
        la prima parte del codice fiscale. 


# Link utili

+ http://boldi.di.unimi.it/Corsi/Inf2016/
+ http://morpurgo.di.unimi.it/didattica/labprog/
