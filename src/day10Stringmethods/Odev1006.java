package day10Stringmethods;

import java.util.Scanner;

public class Odev1006 {

	public static void main(String[] args) {
		
		// Kullanıcıdan yaşadığı ülkenin ismini alın 
		// bu ülkenin bastan ikinci harfi ile sondan ikinci harfini
		// büyük harf olarak ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yaşadığınız ülkenin ismini yazınız");
		String ulke=scan.nextLine();
	//	ulke=ulke.toUpperCase();
		
	//	System.out.println(ulke.substring(1,2)+ulke.substring((ulke.length()-2),ulke.length()-1));
		scan.close();
		
		// DİĞER YOL
		
		System.out.println(ulke.toUpperCase().charAt(1));
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));
		
		

	}

}
