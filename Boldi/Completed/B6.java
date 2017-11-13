///////////////////////////////////////////////////////////////////////////
//Dati gli anni di nascita di due utenti, visualizzare chi è più vecchio//
/////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.math.*;

public class B6{
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		System.out.print("Inserire la data di nascita del primo utente : ");
		int s1 = in.nextInt();
		System.out.print("Inserire la data di nascita del secondo utente : ");
		int s2 = in.nextInt();
	
		if(s1>s2){
			System.out.print("il primo utente è piu giovane del secondo di " + (s1-s2) + " anni");
		}else if(s1<s2){
			System.out.print("il primo utente è piu vecchio del secondo di " + (s2-s1) + " anni");
		}else{
			System.out.print("il primo e il secondo utente hanno la stessa età");
		}
		
		System.out.println();
	}
}
