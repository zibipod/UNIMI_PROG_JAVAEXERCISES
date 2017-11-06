/*************************************************************************************************************************
* 
* Scrivere  un  programma  TrovaParole  che  legge  da  linea  di  comando  una  serie  di  parole  e  da
* standard input una seconda serie di parole.  Per ogni parola sulla linea di comando, stampa ‘+’
* o ‘0’ a seconda che nella seconda serie siano o meno presenti parole della stessa lunghezza. 
* Si considerino come separatori solo gli spazi bianchi (spazio, tab, a capo).
* 
* Esempio di esecuzione
* 
* Per il seguente input
* ---------------------------------------
* I am the master of my fate
* I am the captain of my soul
* ---------------------------------------
* 
* il comando
* 
* ---------------------------------------
* $ java TrovaParole ciao amico mio
* ---------------------------------------
* 
* deve produrre il seguente output
* 
* ciao:+
* amico:0
* mio:+
*
*************************************************************************************************************************/

import java.util.*;
import java.io.*;

public class TrovaParole {

        public static void main(String args[]) {
                Scanner in = new Scanner(System.in);
                StringBuilder sb = new StringBuilder();
                /* Reading Input until CTRL-D is pressed */
                while(in.hasNext())
                {       String line = in.nextLine();
                        sb.append(line+" ");
                }
                in.close();
                String input=sb.toString();
                /* Converting tabs and newline to spaces
                 * in order to have a single separator.*/
                input = new String(input.replaceAll("\t"," "));
                input = new String(input.replaceAll("$"," "));
                String[] words = input.split(" ");
                for(String s : args){
                        boolean match=false;
                        for(String word : words){
                                if(s.length()==word.length()){
                                        System.out.println(s+":+");
                                        match=true;
                                        break;
                                }
                        }
                        if(match==false){
                                System.out.println(s+":0");
                        }
                }
        }


}
