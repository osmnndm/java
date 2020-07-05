package day06Odev;

import java.util.Scanner;

public class Odev0607 {

	public static void main(String[] args) {
		// Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 1000 den fazla ise
		// Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda
		// ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Alacağınız ürün miktarını giriniz:");
		int mik=scan.nextInt();
		
		System.out.println("Ürünün birim fiyatını giriniz:");
		int bir=scan.nextInt();
		
		if(mik>1000) {
			System.out.println("yapılan indirim tutarı = "+ mik*bir*0.1);
			System.out.println("Ödenmesi gereken meblağ = "+ mik*bir*0.9);
		}else {
			System.out.println("Ödenmesi gereken meblağ = "+ mik*bir);
		}
		
		scan.close();
	}

}
