package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopinterview02 {

	public static void main(String[] args) {
		
		// INTERVİEWLERDE ÇOK SORULAN BİR SORU
		// Kullanıcıdan bir string alın ve bu stringi ekrana tersten yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle veya kelime giriniz");
		
		String str=scan.nextLine();
		
	
	int length= str.length()-1;
	while(length>=0) {
		System.out.print(str.charAt(length));
		length--;
	}
		
		scan.close();

	}

}
