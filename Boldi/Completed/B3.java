////////////////////////////////////////////////////
//Leggere un BigInteger e convertirlo in binario //
//////////////////////////////////////////////////

import java.util.*;
import java.math.*;

public class B3{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci un numero : ");
		BigInteger bi = in.nextBigInteger();
		String s = bi.toString(2);
		System.out.println("il tuo numero in binario è : " + s);
	}
}
