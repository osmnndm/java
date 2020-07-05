package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopinterview01 {

	public static void main(String[] args) {
	
		// INTERVİEWLERDE ÇOK SORULAN BİR SORU
		// Kullanıcıdan bir string alın ve bu stringi ekrana tersten yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle veya kelime giriniz");
		
		String str=scan.nextLine();
		
		for(int i=str.length()-1; i>=0;i--) {
		System.out.print(str.charAt(i));
		

	}
scan.close();
}
}
