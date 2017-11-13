//////////////////////////////////
//Stabilire se un numero è pari//
////////////////////////////////

import java.util.*;
import java.math.*;

public class B7{

		public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Inserire un numero : ");
		int n = in.nextInt();
	
		if(n%2 == 1){
		System.out.println("Il numero è dispari");
		}else{
		System.out.println("Il numero è pari");
		}
	
	}
}
