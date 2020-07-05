package day09switchoperator;

import java.util.Scanner;

public class Odev0901 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir gun alın eğer 
		// gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın.
		// “Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın. 
		// “Pazar” ise ekrana“Hıristiyanlar için kutsal gün” yazdırın. 
		// Diğer günler icin “Kutsal gün değil” yazdırın.

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir gün giriniz");
		String tag=scan.next();
		tag=tag.toLowerCase();
		
		
		switch(tag) {
		case "cuma":
			System.out.println("Müslümanlar için Kutsal gün");
			break;
		case "cumartesi":
			System.out.println("Yahudiler için Kutsal gün");
			break;
		case "pazar":
			System.out.println("Hristiyanlar için Kutsal gün");
			break;
			default:
				System.out.println("Kutsal gün değil");
		}
		scan.close();
	}

}
