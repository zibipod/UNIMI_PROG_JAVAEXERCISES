/*********************************************************************************
 * Scrivete un programma che legga una stringa e la ristampi sostituendo
 * a ogni carattere il numero di occorrenze complessive di quel carattere
 * nella stringa. Ad esempio, se la stringa fosse “cartamusica” il programma
 * dovrebbe stampare “23113111123”. (Infatti la 'c' è ripetuta 2 volte, la 'a'
 * è ripetuta 3 volte, tutte le altre lettere sono ripetute 1 volta.
 *********************************************************************************/

import java.util.*;
import java.io.*;

public class Main {
	public static void main (String args[]){
		occurrenceMyString();
	}
	
	public static void occurrenceMyString(){
		Scanner in = new Scanner(System.in);
		
		String inputStr = in.nextLine();
		int counter,
			lenght=inputStr.length();
		
		for(int i=0;i<lenght;i++){
			counter=0;
			for(int j=0; j<lenght; j++){
				if(inputStr.charAt(i)==inputStr.charAt(j))
					counter++;
			}
			System.out.print(counter);
		}
		in.close();
	}
}
