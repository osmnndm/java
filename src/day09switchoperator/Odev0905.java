package day09switchoperator;

import java.util.Scanner;

public class Odev0905 {

	public static void main(String[] args) {
		
		/*
		 * Kullanıcıdan A, B, C, D harflerinden birini alın 
		 * eğer harf C ise ekrana “Doğru cevap” yazdırın.
		   A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
		   Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		String harf=scan.next();
		harf=harf.toUpperCase();
		
		
		switch (harf){
		case "A":
			System.out.println("Yanlış cevap");
			break;
		case "B":
			System.out.println("Yanlış cevap");
			break;
		case "D":
			System.out.println("Yanlış cevap");
			break;
		case "C":
			System.out.println("Doğru cevap");
			break;
			default:
				System.out.println("Geçersiz cevap şıkkı");
			
		}
		scan.close();
		
	}

}
