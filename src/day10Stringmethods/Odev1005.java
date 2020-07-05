package day10Stringmethods;

import java.util.Scanner;

public class Odev1005 {

	public static void main(String[] args) {
		
		// Kullanıcıdan yaşadığı ülkenin ismini alın 
		// bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yaşadığınız ülkenin ismini yazınız");
		String ulke=scan.next();
		ulke=ulke.toUpperCase();
		
		System.out.println(ulke.substring(0,2));
		scan.close();
	}

}
