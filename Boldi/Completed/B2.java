///////////////////////////////////////////////
//Leggere un BigInteger e stampare le decine//
/////////////////////////////////////////////

import java.util.*;
import java.math.*;

public class B2{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.print("inserisci un numero : ");     
		BigInteger bi = in.nextBigInteger();
		
		System.out.println("le decine sono : " + (bi.intValue()%100)/10);
	}
}
