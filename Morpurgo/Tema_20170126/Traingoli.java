/***************************************************************************************************************************
* 
* Vogliamo calcolare il numero triangolare di un triangolo di dimensione n
* (detto anche numero triangolare n-esimo) così definito:
* #per un triangolo di dimensione 0 il numero triangolare è 0
* #per un triangolo di dimensione n il numero triangolare è 
* n+il numero triangolare (n−1)-esimo.
* 
* Implementare una classe Triangolo che riceve da linea di comando la dimensione n, e calcola
* il numero triangolare n-esimo (secondo la definizione data sopra) in modo ricorsivo, 
* cioè considerando il numero triangolare (n−1)-esimo.
*
***************************************************************************************************************************/

import java.util.*;
import java.io.*;

public class Triangoli {
        public static void main(String args[]){
                if(args.length!=1){
                        System.out.println("Please Insert the right number of arguments: arg[0] - Value of N.");
                } else {
                        try {
                                long n = Long.parseLong(args[0]);
                                if(n>=0){
                                        System.out.println(numeroTriangolare(n));
                                } else {
                                        System.out.println("Please Insert a number >= 0!");
                                }
                        } catch (NumberFormatException e){
                                System.out.println("Please Insert a valid number value!");
                        }
                }
        }

        public static long numeroTriangolare(long n){
                long acc=0;
                while(n>0){
                        acc=acc+n;
                        n--;
                }

                return acc;
        }

/*---------------------------------------------------------------       
 *      Basical example with recursion,
 *      for exercise purpose only. This
 *      doesn't manage the 'StackOverflowError'
 *      and could be implemented in a simpler
 *      and safer way (see numeroTriangolare).
 *--------------------------------------------------------------*/
        public static int numeroTriangolareRecursive (int n){
                if(n==0){
                        return 0;
                } else{
                        return n + numeroTriangolareRecursive(n-1);
                }
        }
}
