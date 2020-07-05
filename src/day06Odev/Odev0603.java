package day06Odev;

import java.util.Scanner;

public class Odev0603 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
		// “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. “Pazar” ise ekrana
		// “Hıristiyanlar icin kutsal gün” yazdırın
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir gün ismi giriniz");
		String gun=sc.next();
		
		if(gun.equalsIgnoreCase("Cuma")) {
			System.out.println("\"Müslümanlar için kutsal gün\"");
		}else if(gun.equalsIgnoreCase("Cumartesi")) {
			System.out.println("\"Yahudiler için kutsal gün\"");
		}else if(gun.equalsIgnoreCase("Pazar")) {
			System.out.println("\"Hristiyanlar için kutsal gün\"");
		}else {
			System.out.println("\""+ gun +"\" kutsal bir gün değil.");
		}
	sc.close();
		
	}

}
