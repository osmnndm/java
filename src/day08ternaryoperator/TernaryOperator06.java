package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir sayı alınız.
		// sayı çift ise 10'a bölünüp bölünmediğini kontrol ediniz.
		// Sayı 10'a bölünüyorsa "Wooow 10" yazdırınız
		// 10'a bölünmüyorsa "Yazık" yazdırınız
		// sayı tek ise 5 e bölünüp bölünmediğini kontrol ediniz.
		// sayı 5 e bölünüyorsa "Wooow 5" yazdırınız.
		// sayı 5 e bölünmüyorsa "yazık 5" yazdırınız.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num=scan.nextInt();
		
	                  //Condition  soru işareti                     True                değilse            False
		String result= num%2==0      ?            (num%10==0 ? "Wooow 10" : "Yazık 10")    :      (num%5==0 ? "Wooow 5" :"Yazık 5");
		System.out.println(result);
scan.close();
	}

}
