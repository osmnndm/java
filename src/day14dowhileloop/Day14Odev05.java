package day14dowhileloop;

import java.util.Scanner;

public class Day14Odev05 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları do-while loop kullanarak çözünüz.
		// Kullanıcıya bir String girmesini söyleyin 
		// ve bu String’in ilk harfi ile son harfi aynı ise
		// ekrana “Simetrik” yazdırın. 
		// Aynı değilse tekrar bir String girmesini isteyin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime yazınız");
		
		String wort = "";
		char ilk,son;
		
		do {
			wort=scan.next();
			ilk=wort.charAt(0);
			son=wort.charAt(wort.length()-(1));
			if(ilk!=son) {
				System.out.println("Yeni bir kelime daha yazınız");
				
			}
		}while(ilk!=son);
		System.out.println("Simetrik");
		scan.close();
	}

}
