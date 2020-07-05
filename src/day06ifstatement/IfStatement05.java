package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		
		// kullanıcıdan bir dikdörtgenin en ve boyunu alın
		// en ve boy eşit ise ekrana bu bir karedir yazdırın
		// en ve boy farklı ise ekrana bu bir dikdörtgendir yazdırın
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("en değerini giriniz");
		double en=scan.nextDouble();
		
		System.out.println("boy değerini giriniz");
		double boy=scan.nextDouble();
		
//		if(en==boy) {
//			System.out.println("Bu bir karedir");
//		}
//		if (en!=boy) {
//			System.out.println("Bu bir dikdörtgendir");
//		}
//		
		// else ==> diğer ihtilamllerin tamamı veya denilenin haricinde veya değilse
		
		if(en==boy) {
			System.out.println("bu bir karedir");
		}else {
			System.out.println("bu bir dikdörtgendir");
		}
		
		scan.close();
		

	}

}
