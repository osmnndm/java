package day08ternaryoperator;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {

		// Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		// En ve boy eşit ise ekrana “Kare”
		// farklı ise ekrana “Dikdörtgen” yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("en değerini giriniz");
		double en=scan.nextDouble();
		System.out.println("boy değerini giriniz");
		double boy=scan.nextDouble();
		
		System.out.println(en==boy ? "Bu bir Karedir" : "Bu bir Dikdörtgendir");
		scan.close();

	}

}
