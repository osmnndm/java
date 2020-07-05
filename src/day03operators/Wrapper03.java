package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan ilk ismini alın ekrana yazdırın
		// Kullanıcıdan soyismini alın ekrana ilk isminin altına yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isminizi yazınız");
		String ad=scan.nextLine();
	
		System.out.println("Lütfen soyadınızı giriniz");
		String soyad=scan.next();
		
		System.out.print("Adı: ");
		System.out.println(ad);
		
		System.out.print("Soyadı: ");
		System.out.println(soyad);
		
		scan.close();
		
	}

}
