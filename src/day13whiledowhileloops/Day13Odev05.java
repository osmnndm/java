package day13whiledowhileloops;

import java.util.Scanner;

public class Day13Odev05 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları String methodlarını kullanarak çözünüz.
		// Kullanıcıdan bir String alın 
		// ve bu String’in ilk harfi ile son harfinin yerlerini değiştirerek
		// ekrana yazdırın.
		// Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.

		Scanner scan=new Scanner(System.in);
		System.out.println("bir kelime giriniz: ");
		String kel=scan.nextLine();
		int leng=(kel.length()-1);
		char harfilk=kel.charAt(0);
		char harfson=kel.charAt(leng);
		
		System.out.print(kel+" kelimesinin ilk ve son harflerinin yerlerinin değişmiş"+
		" şekilde yazılımı: ");
		System.out.println(harfson+kel.substring(1, leng)+harfilk);
		
		scan.close();
		
		
		
	}

}
