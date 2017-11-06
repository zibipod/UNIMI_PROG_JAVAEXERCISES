/************************************************* 
 * Scrivete un programma che legga ripetutamente 
 * delle stringhe contenenti un certo numero di
 * asterischi e un solo carattere '/'.
 * Dovete, per ognuna di esse, stampare 1 o 0 
 * a seconda  che  nella  parte  dopo  la '/'
 * compaia  qualche asterisco oppure no.  
 * Il programma termina quando viene inserita la 
 * stringa vuota. Non è necessario che controlliate 
 * che l’utente abbia inserito una stringa nella 
 * forma corretta.
 *************************************************/
public class Main {
	public static void main(String args[]){
		checkStringa();
	}
 
 
	public static void checkStringa(){
		Scanner in = new Scanner(System.in);
		
		while(true){
			String inputStr = in.nextLine();
			if(inputStr.equals("")){
				break;
			}
			else{
				if(inputStr.contains("/")){
					String rightpart = inputStr.split("/",2)[1];
					if(rightpart.contains("*")){
						System.out.println("1");
					} else {
						System.out.println("0");
					}
				}
			}
		}
		in.close();
	}
	
	//Smart Way
	public static void checkStringaBoldi(){
		Scanner in = new Scanner(System.in);
		
		while(true){
			String inputStr = in.nextLine();
			if(inputStr.equals("")){
				break;
			}
			else{
				int pos = inputStr.indexOf('/');
				int k = inputStr.indexOf('*',pos);
				System.out.println(k < 0 ? "0" : "1");
			}
		}
		in.close();
	}
}
