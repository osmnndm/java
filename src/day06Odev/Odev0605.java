package day06Odev;

import java.util.Scanner;

public class Odev0605 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir tamsayı alın eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana
		// “Rakam” yazdırın. Diğer durumlarda ekrana “Sayı” yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir tam sayı giriniz");
		int num1=scan.nextInt();
		
		if (num1<10 && num1>=0) {
			System.out.println("\"Rakam\"");
		}else {
			System.out.println("\"Sayı\"");
		}
		scan.close();
	}

}
