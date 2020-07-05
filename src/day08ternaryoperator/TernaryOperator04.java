package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		// Ternary Operator (IF ELSE IF) JAVA RESMİ SERTİFİK SINAVINDA GENELDE BU ÇIKAR
		// kullanıcıdan bir sayı alınız.
		// sayı 0 dan büyük eşit ise 
		// 10 dan küçük olup olmadığını kontrol ediniz.
		// 10 dan küçük ise ekrana Rakam yazdırınız değilse Pozitif Sayı yazdırınız
		// sayı 0 dan küçük ise ekrana negatif sayı yazdırınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int num1=scan.nextInt();
		
		// ? İŞARETİNDEN SONRA PARANTEZ AÇARSAK İÇİNE YAZILANLAR NE İSE ONU UYGULAR 
		// BUDA İKİNCİ BİR İF GİBİ DÜŞÜNÜLEBİLİR.
		
		String result=num1>=0 ? (num1<10 ? "Bir Rakamdır" : "Bir Pozitif sayıdır"): "Bir Negatif sayıdır";
		System.out.println(num1+" " +result);
		
		scan.close();
	}

}
