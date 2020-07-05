package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan ad ve soyadını alalım
		// ekrana yazdıralım
		// kullanıcıdan adresi alıp ekrana yazdıralım
		// kullanıcıdan yaşını alıp ekrana yazdıralım
		// kullanıcıya türkiye yaşıyorum doğru/yanlış diye sorup cevabını ekrana yazdıralım
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Adı Soyadı:");
		String ad=scan.nextLine();
		System.out.println(ad);
		
		System.out.println("Lütfen adresinizi giriniz");
		String adres=scan.nextLine();
		System.out.print("Adres:");
		System.out.println(adres);
		
		System.out.println("Yaşınızı giriniz");
		int yas=scan.nextInt();
		System.out.println(yas);
		
		
		System.out.println("Türkiye'demi oturuyorsunuz true/false?");
		boolean blTr=scan.nextBoolean();
		System.out.println(blTr);
		
		scan.close();
		
	}

}
