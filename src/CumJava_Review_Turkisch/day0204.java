package CumJava_Review_Turkisch;

import java.util.Scanner;

public class day0204 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir sayı girmesini isteyiniz
				// Sayı tek sayı ise "Sayınız tek sayıdır."
				// Sayı çift sayı ise "Sayınız çift sayıdır." yazdırınız
		
		
		int say;
		System.out.println("lütfen bir sayı giriniz");
		Scanner scan=new Scanner(System.in);
		say=scan.nextInt();
		
		System.out.println(say%2==0?"sayı çit sayıdır" : "sayı tek sayıdır");
	}

}
