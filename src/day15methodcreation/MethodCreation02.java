package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		
		// saati saniyeye, mili kilometreye, kg'mı grama 
		// çeviren bir method yazınız.
		// bu methodu main methodun dışında oluşturup main methodun içinden çağırınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Birimi giriniz");
		String birim=scan.nextLine();
		
		System.out.println("Miktarı giriniz");
		double miktar=scan.nextDouble();
		
		donusturucu(birim,miktar); // 10800
		
		scan.close();
	}
	
	public static void donusturucu(String birim,double miktar) {
		
		// switch: değişmek demek
		switch(birim) {
		case"saat":
			System.out.println(miktar*60*60);
			break;
		case"mil":
			System.out.println(miktar*1.6);
			break;
		case"kilogram":
			System.out.println(miktar*1000);
			break;
			default:
				System.out.println("saat,mil ve kilogram dışında bir birim girmeyiniz");
		}
		
	}
	
}
