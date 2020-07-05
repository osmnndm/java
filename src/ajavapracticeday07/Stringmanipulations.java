package ajavapracticeday07;

import java.util.Scanner;

public class Stringmanipulations {
	
	public static void main(String[] args) {
		
//		Kullanıcıdan isim ve soyisim isteyiniz ve ba harfleri büyük
//		geri kalan harfleri küçük yazdırınız.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen adınızı giriniz");
//		String ad = scan.nextLine();
//		System.out.println("Lütfen soyadınız girinz");
//		String soyad = scan.nextLine();
//		
//		String ad1 = ad.substring(0,1).toUpperCase()+ad.substring(1);
//		String soyad1 = soyad.substring(0,1).toUpperCase()+soyad.substring(1);
//		
//		System.out.println("Ad Soyad: "+ ad1+" "+soyad1);
		
		
//		II.YOL
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen adınızı ve Soyadınız giriniz");
//		String ad = scan.nextLine();
//		
//		int ikinciBasNok = ad.indexOf(" ");
//		System.out.print(ad.substring(0,1).toUpperCase());
//		System.out.print(ad.substring(1,ikinciBasNok+1).toLowerCase());
//		System.out.print(ad.substring(ikinciBasNok+1,ikinciBasNok+2).toUpperCase());
//		System.out.println(ad.substring(ikinciBasNok+2).toLowerCase());
		
//		III. YOL
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen adınızı ve Soyadınız giriniz");
		String ad = scan.nextLine();
		
		String isimler [] = ad.split(" ");
		for (int i = 0; i < isimler.length; i++) {
			isimler[i] = isimler[i].toLowerCase();
			if(isimler.length-1 != i)
			System.out.print(isimler[i].substring(0,1).toUpperCase()+isimler[i].substring(1)+" ");
			else
				System.out.print(isimler[i].substring(0,1).toUpperCase()+isimler[i].substring(1));
		}
		
		
		
		scan.close();
	}

}
