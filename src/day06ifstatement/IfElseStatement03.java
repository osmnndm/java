package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		
		// kullanıcıdan alacağı urun miktarını ve fiyatını alalım
		// eğer kullanıcı 1000 den fazla ürün alırsa %20 indirim yapın ve 
		// kullanıcının ödeyeceği toplam fiyatı ekrana yazdırın
		// 1000 den az veya 1000 ürün alırsa indirim yapmayın
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Satın almak istediğiniz ürün miktarını giriniz");
		double miktar=scan.nextDouble();
		
		System.out.println("Aldığınız ürünün birim fiyatını giriniz");
		double fiyat=scan.nextDouble();
		
		if(miktar>1000) {
			fiyat=fiyat*(0.80);
		}
		System.out.println("ÜRÜN MİKTARI: "+ miktar);
		System.out.println("Toplam Fiyat miktarı:"+ fiyat*miktar);

		scan.close();
		
	}
	}
