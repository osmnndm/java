package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		/*
	     Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve 
	     cevresini hesaplayıp ekrana yazdıran bir program yazınız. 
	     Not: Alan: Boy x En
	     Not: Çevre: 2x (Boy + En)
	*/

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Dikdörtgenin en ve boyunu giriniz");
		
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
	
		System.out.println("Dikdörtgenin alanı:");
		System.out.println(sayi1*sayi2);
		System.out.println("Dikdörtgenin çevresi");
		System.out.println(sayi1*2+sayi2*2);
		
		scan.close();
	}

}
