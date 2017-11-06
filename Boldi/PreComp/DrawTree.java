/*************************************************
 * Scrivete un programma che dato in input un 
 * valore intero n dispari disegni la forma 
 * indicata (n è il numero di asterischi sulla 
 * prima riga). 
 * 
 * Intero: 9
 *           *********
 *           ****.****
 *           ***...***
 *           **.....**
 *           *.......*
 *************************************************/

import java.util.*;

public class Main {

	public static void main(String args[]){
		drawTree();
	}

	public static void drawTree(){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int i,dim,pcount;
		if(size%2!=0){
			for(i=0;i<size;i++){
				System.out.print("*");
			} System.out.println();
			
			pcount=1;
			while(size!=pcount){
				dim = (size-pcount)/2;
				StringBuilder sb = new StringBuilder();
				for(i=0;i<dim;i++){
					sb.append("*");
				}
				System.out.print(sb.toString());
				for(i=0;i<pcount;i++){
					System.out.print(".");
				}
				System.out.print(sb.toString());
				System.out.println();
				pcount+=2;
			}
		}
		in.close();
	}
}

