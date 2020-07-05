package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanıcıdan bir karakter girmesini isteyiniz.
		// karakter harf ise küçük harf olup olmadığını kontrol ediniz.
		// küçük harf ise ekrana Küçük harf yazdırınız.
		// büyük harf ise ekrana büyük harf yazdırınız.
		// harf değilse harf değil yazdırınız.
		
		// a-z 97-122
		// A-Z 65-90

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char ch=scan.next().charAt(0);
		
		String result= (ch>=97 && ch<=122) ? "küçük harftir": 
			((ch>=65 && ch<=90)? "büyük harftir": "harf değildir.");
		System.out.println(ch +" "+result);
		
		scan.close();
		
	}

}
