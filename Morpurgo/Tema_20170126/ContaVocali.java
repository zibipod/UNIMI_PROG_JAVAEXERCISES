/********************************************************************************************************
*
*	Scrivere  una  applicazione  (una  classe  “ContaVocali”  dotata  del  metodo  main)  che,  dato  un
*	elenco  di  parole  da  standard  input,  stampi  su  standard  output  il  numero  medio  (troncato
*	all’intero) e massimo di vocali (eventualmente ripetute) presenti nelle parole in ingresso.
*	
*	Ad esempio se l’input fosse
*	-------------------------------------
*	dfgr  ciao aiuola
*	aaa   paolo     dinosauro
*	-------------------------------------
*	l’output dovrebbe essere il seguente
*	media:3
*	max:5
*	
*	E null’altro! La correzione avviene in automatico mediante script che verifica la forma dell’output.
*	Aggiungere messaggistica ulteriore significa invalidare l’elaborato.
*	
*	Avvertenze
*	Il numero di parole (stringhe separate da caratteri di spaziatura) presenti nel flusso di input è
*	arbitrario e può essere disposto su più righe.
*	Si ricorda che la fine del flusso di input standard (in sistemi Linux) è segnalata dalla pressione
*	simultanea dei tasti Ctrl D.
*
*********************************************************************************************************/
import java.util.*;

public class ContaVocali {
        public static void main(String args[]){
                Scanner in = new Scanner(System.in);
                StringBuilder sb = new StringBuilder();
                /* Reading Input until CTRL-D is pressed */
                while(in.hasNext())
                {       String line = in.nextLine();
                        sb.append(line+" ");
                }
                in.close();
                String input=sb.toString();
                int counter=0, sum=0, words=0, max=0;
                for(int i=0; i<input.length(); i++){
                        if(input.charAt(i)==' ' || i==(input.length()-1)){
                                if(counter!=0){
                                        if(counter > max) max=counter;
                                        sum+=counter;
                                        words++;
                                }
                                counter=0;
                        }
                        counter = counter + isVocale(input.charAt(i));
                }
                if(sum!=0 && words!=0)
                        System.out.println("media:"+(sum/words));
                else
                        System.out.println("media:0");
                System.out.println("max:"+max);
        }

        public static int isVocale(char x){
                return (("aeiouAEIOU".indexOf(x)) < 0) ? 0 : 1;
        }
}
