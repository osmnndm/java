package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {
	
	public static void main(String[] args) {
		
		// kullanıcıdan adını ve soyadını alınız
		// 1) ad ve soyadını konsola yazdırınız
		// 2) sadece adını konsola yazdırın
		// 3) ad ve soyadının ilk harflerini consola yazdırın
		// 4) ad ve soyadını consola tersten yazdırın
		// 5) ad ve soyadında kullanılan tüm karakterleri alfabetik sırada konsola yazdırın
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen adınız giriniz");
		String ad = scan.nextLine();
		System.out.println("Lütfen soyadınızı giriniz");
		String soyad = scan.nextLine();
		
		adSoyad(ad,soyad);
		ad(ad);
		ilkHarf(ad,soyad);
		ters(ad,soyad);
		sira(ad,soyad);
		
		scan.close();
		
	}
	
	public static void adSoyad (String ad, String soyad) {
		System.out.println(ad+" "+ soyad);
	}
	
	
	public static void ad (String ad) {
		System.out.println(ad);
	}
	
	public static void ilkHarf (String ad, String soyad) {
		System.out.println("adın ilk harfi: "+ ad.charAt(0));
		System.out.println("soyadın ilk harfi: "+ soyad.charAt(0));
	}
	public static void ters (String ad, String soyad) {
		StringBuilder strB = new StringBuilder(ad+" "+soyad);
		System.out.println("İsim tersten yazıldı: "+ strB.reverse());
	}

	public static void sira(String ad, String soyad) {
		
		String tamAd = ad+soyad;
		String harfArr[] = tamAd.split("");
		Arrays.sort(harfArr);
		for(String w:harfArr) {
			System.out.print(w+" ");
		}
}
			
}
