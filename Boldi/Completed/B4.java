//////////////////////////////////////////
//Stampare la prima metà di una stringa//
////////////////////////////////////////

import java.util.*;
import java.math.*;

public class B4 {
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci una stringa : ");
		String s = in.nextLine();
	
		System.out.println("la prima metà della stringa è : " + s.substring(0,s.length()/2));
	}
}
