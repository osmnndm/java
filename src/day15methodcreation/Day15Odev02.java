package day15methodcreation;

import java.util.Scanner;

public class Day15Odev02 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.
		// Kullanıcıdan iki sayı alın 
		// bu sayılar eşit ise ekrana “Eşit”, 
		// birinci sayı büyük ise ekrana “Birinci sayı büyük”, 
		// ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		
		int num1=0;
		int num2=0;
		
		sayiEsitligi(num1,num2);
		
	}
	public static void sayiEsitligi(int num1,int num2) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("İki sayı giriniz");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		String result= num1==num2 ? "Bu iki sayı eşittir" :((num1>num2)? "Birinci sayı ikinci sayıdan büyüktür" :
			"ikinci sayı birinci sayıdan büyüktür");
		System.out.println(result);
		scan.close();
	}

}
