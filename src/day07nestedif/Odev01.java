package day07nestedif;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan cinsiyetini girmesini isteyin.
		// Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		// Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		// Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		// Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.

		Scanner scan=new Scanner(System.in);
		System.out.println("Cinsiyetinizi giriniz (Erkek/Bayan)");
		String cns=scan.next();
		
		System.out.println("Yaşınızı giriniz");
		int yas=scan.nextInt();
		
		
		if(cns.equalsIgnoreCase("Erkek")) {
			if(yas<18) {
				System.out.println("Erkek çocuk");
			}else {
				System.out.println("Adam");
			}}
		if(cns.equalsIgnoreCase("bayan")) {
				if(yas<18) {
					System.out.println("Kız Çocuk");
				}else {
					System.out.println("Kadın");
				} scan.close();
		
		}
		
		
	}

}
