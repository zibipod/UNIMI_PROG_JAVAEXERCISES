/***********************************************************************************************************************************
* 
* Una palestra ha deciso di applicare le seguenti tariffe per l’abbonamento mensile, differenziate
* per età e sesso:
* MASCHI:
* # fino a 10 anni(compresi):  gratis
* # da 11 a 25 anni:  10 euro
* # da 26 a 64 anni:  18.50 euro
* # da 65 a 75 anni:  10 euro
* # oltre i 75 anni:  gratis
* FEMMINE:
* # fino a 14 anni(compresi):  gratis
* # da 15 a 30 anni:  10 euro
* # da 31 a 64 anni:  18.50 euro
* # da 65 a 75 anni:  10 euro
* # oltre i 75 anni:  gratis
* 
* Scrivere un programma CostoAbbonamento che legge da linea di comando sesso e eta di una
* persona e calcola il costo dell’abbonamento.
* Per quanto riguarda il sesso, se viene inserito "m" oppure "M" significa che la persona è un
* maschio; se viene inserito "f" oppure "F" significa che la persona é una femmina.
* Il programma deve controllare che gli argomenti passati da linea di comando siano nella forma
* prevista producendo un messaggio di errore in caso contrario.
* Normalmente il programma deve produrre un output della seguente forma:
* - se la persona ha diritto a un abbonamento gratis, il messaggio da stampare é:
* Per te abbonamento gratis
* - altrimenti il messaggio da stampare é:
* Costo abbonamento: 18,50 euro
* 
* Esempi di esecuzione
* $ java CostoAbbonamento m 11
* Costo abbonamento: 10,00 euro
* $ java CostoAbbonamento F 60
* Costo abbonamento: 18,50 euro
* $ java CostoAbbonamento M 5
* Per te abbonamento gratis
* 
***********************************************************************************************************************************/

import java.util.*;
import java.io.*;

public class CostoAbbonamento {

        public static void main (String args[]){
                if(args.length!=2){
                        help();
                } else {
                        String gender = args[0].toUpperCase();
                        try {
                                int age = Integer.parseInt(args[1]);
                                if(age>0){
                                        if(gender.equals("M")){
                                                if(age>0 && age<11)     System.out.println("Per te abbonamento gratis");
                                                if(age>10 && age<26)    System.out.println("Costo abbonamento: 10,00 euro");
                                                if(age>25 && age<65)    System.out.println("Costo abbonamento: 18,50 euro");
                                                if(age>64 && age<76)    System.out.println("Costo abbonamento: 10,00 euro");
                                                if(age>75)              System.out.println("Per te abbonamento gratis");
                                        } else if(gender.equals("F")){
                                                if(age>0 && age<15)     System.out.println("Per te abbonamento gratis");
                                                if(age>14 && age<31)    System.out.println("Costo abbonamento: 10,00 euro");
                                                if(age>30 && age<65)    System.out.println("Costo abbonamento: 18,50 euro");
                                                if(age>64 && age<76)    System.out.println("Costo abbonamento: 10,00 euro");
                                                if(age>75)              System.out.println("Per te abbonamento gratis");
                                        } else {
                                                System.out.println("Please Insert a correct gender value!!");
                                        }
                                } else {
                                        System.out.println("Please Insert a correct age value!");
                                }
                        } catch (NumberFormatException e){
                                System.out.println("Please Insert a correct age value!");
                        }
                }
        }

        public static void help (){
                System.out.println("Please Insert the right number of arguments");
                System.out.println("Arg[0] - M/F, Arg[1] - Age");
        }
}
