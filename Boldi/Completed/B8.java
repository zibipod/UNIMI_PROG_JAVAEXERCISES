/////////////////////////////////////////////
//Stabilire se un numero è multiplo di 100//
///////////////////////////////////////////

import java.util.*;
import java.math.*;

public class B8 {
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci un numero : ");
		int n = in.nextInt();
		
		if(n == 0 || n%100 != 0 || n == 100){
			System.out.println("il numero non è un multiplo di 100");
		}else if(n%100 == 0){
			System.out.println("il numero è un multiplo di 100");
		}
	}
}
