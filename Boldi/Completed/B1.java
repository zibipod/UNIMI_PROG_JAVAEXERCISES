/////////////////////////////////////////////
//Leggere un BigInteger e stampare l'unità//
///////////////////////////////////////////

import java.util.*;
import java.math.*;

public class B1{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.print("inserisci un numero : ");     
		BigInteger bi = in.nextBigInteger();
		
		System.out.println("l'unità è : " + bi.intValue()%10);
	}
}
