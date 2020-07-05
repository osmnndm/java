package day03operators;

import java.util.Scanner;

public class IsimAdres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kullanıcıdan ad, soyad ve adresini alıp ekrana yazdıran bir program yazınız. 
		// Ad ve soyad ilk satırda, adres ikinci satırda olsun.
		//(String kullanınız)

		Scanner scan=new Scanner(System.in);
		System.out.println("adınızı giriniz");
		String ad=scan.nextLine();
		
		System.out.println("soyadınızı giriniz");
		String soyad=scan.nextLine();
		
		System.out.println("adresinizi giriniz");
		String x=scan.nextLine();
	
		System.out.println("Ad soyad: "+ ad + " " + soyad);
		System.out.print("Adres: " + x);
	
		scan.close();
		
	}

}
