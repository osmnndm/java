package day13whiledowhileloops;

import java.util.Scanner;

public class Day13Odev04 {

	public static void main(String[] args) {
		// Aşağıdaki soruları String methodlarını kullanarak çözünüz.
		// Kullanıcıdan uzunluğu çift sayı olan bir String alın 
		// ve bu String’in ilk yarısını ekrana yazdırın.
		// Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir kelime giriniz: ");
		String kel=scan.nextLine();
		int leng=(kel.length())/2;
		
		System.out.println(kel+" kelimesinin ilk yarısı: "+kel.substring(0, leng));
scan.close();
	}

}
