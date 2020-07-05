package day10Stringmethods;

import java.util.Scanner;

public class Odev1002 {

	public static void main(String[] args) {
		
		// Kullanıcıdan ilk ve soy ismini alın 
		// ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		String ad, soyad;
		
		System.out.println("isminizi giriniz");
		ad=scan.next();
		System.out.println("soyisminizi giriniz");
		soyad=scan.next();
		
		
		System.out.println("isminiz "+(ad.length())+" soyisminiz "+
		soyad.length()+" karakterden oluşmaktadır.");
		scan.close();
		
	}

}
