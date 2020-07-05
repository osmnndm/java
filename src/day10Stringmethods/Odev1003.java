package day10Stringmethods;

import java.util.Scanner;

public class Odev1003 {

	public static void main(String[] args) {
		
		// Kullanıcıdan ilk ve soy ismini alın 
		// ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		String ad, soyad;
		
		System.out.println("isminizi giriniz");
		ad=scan.next();
		System.out.println("soyisminizi giriniz");
		soyad=scan.next();
		
		System.out.println("Adınız: "+(ad.toUpperCase().charAt(0))+
				(ad.substring(1).toLowerCase()));
		System.out.println("Soyadınız: "+(soyad.toUpperCase().charAt(0))+
				(soyad.substring(1).toLowerCase()));
		scan.close();
	}

}
