package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan integer aldıktan sonra String alamıyoruz.
		// Javadaki bir sorunun çözümü
		
		// Scanner scan=new Scanner(System.in);
		//System.out.println("Yaşınınız giriniz");
		//int yas=scan.nextInt();
	//	System.out.println(yas);
		
	//	System.out.println("Adınızı ve Soyadınızı giriniz");
	//	String isim= scan.nextLine();
	//	System.out.println(isim);
		
		// isim yazdırmıyor, sorun çıkıyor
		// " " içine koyduktan sonra her şey String olabilir
		// int ve String beraber kullanılınca mı sorun çıkıyor.
		//
		
		// Javada nextInt kullandıktan sonra nextLine kullanırsak kod çalışmıyor.
		// çözüm: nextInt yerine nextLine kullan sonra elde edilen String'i 
		// Integer.parsentInt kullanarak integer'a çevir.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yaşınınız giriniz");
		String yas=scan.nextLine();
		int yeniYas=Integer.parseInt(yas);
		
		
		System.out.println("Adınızı ve Soyadınızı giriniz");
		String isim= scan.nextLine();
		System.out.println();
		System.out.println(isim);
		System.out.println(yeniYas+" yaşında");
		
		scan.close();
	}

}
