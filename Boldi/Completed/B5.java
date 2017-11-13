////////////////////////////////////////////
//Stampare la seconda metà di una stringa//
//////////////////////////////////////////

import java.util.*;
import java.math.*;

public class B5{
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci una stringa : ");
		String s = in.nextLine();
	
		System.out.println("la seconda metà della stringa è : " + s.substring(s.length()/2,s.length()));
	}
}
