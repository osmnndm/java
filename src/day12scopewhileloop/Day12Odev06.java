package day12scopewhileloop;

import java.util.Scanner;

public class Day12Odev06 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş harflerini alın 
		// ve başlangıç harfinden başlayıp bitiş harfinde biten 
		// tüm harfleri büyük harf olarak ekrana yazdırın. 
		// Kullanıcının hata yapmadığını farz edin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir başlangıç harfi giriniz");
		char bas=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen bir bitiş harfi giriniz");
		char bit=scan.next().toUpperCase().charAt(0);
		
		
			while(bas<=bit) {
				System.out.print(bas+" ");
				bas++;
		
		}
		
scan.close();
	}

}
