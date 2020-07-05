package day08ternaryoperator;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir tamsayı girmesini isteyin, 
		// tamsayı çift ise ekrana “Çift” 
		// tek ise ekrana “Tek” yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num=scan.nextInt();
		
		System.out.println(num%9==0 ? num+" sayısı bir çift sayıdır" : num+" sayısı bir tek sayıdır");
		scan.close();
		

	}

}
