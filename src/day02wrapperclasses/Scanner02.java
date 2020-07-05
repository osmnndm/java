package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		

		// Karenin bir kenar uzunluğunu girsin.
		// Karenin çevresini ve alanını ekrana yazdıralim.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen karenin kenar uzunluğunu giriniz");
		
		int kenarUzunlugu = scan.nextInt();
		
		System.out.println("Karenin çevresi");
		System.out.println(kenarUzunlugu*4);
		System.out.println("Karenin alanı");
		System.out.println(kenarUzunlugu*kenarUzunlugu);
		
		scan.close();
	}

}
