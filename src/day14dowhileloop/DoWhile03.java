package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir sayı alınız.
		// sayı 10 dan küçük ise ekrana kazandınız yazdırın.
		// sayı 10 veya 10 dan büyük ise ekrana tekrar deneyiniz yazdırın
		
		Scanner scan=new Scanner(System.in);
		int num=0;
		do {
		System.out.println("Bir sayı giriniz");
		num=scan.nextInt();
		}while(num>=10); // while içindeki condition true oldukça loop devam eder
						// false olunca loop biter alta geçer.
		System.out.println("Kazandınız");
	scan.close();
	}

}
