package day08ternaryoperator;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir tamsayı girmesini isteyin, 
		// ekrana o tamsayının mutlak degerini yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num=scan.nextInt();
		
		System.out.println(num>=0 ? num +" sayısının mutlak değeri = "+num : 
			num +" sayısının mutlak değeri = "+ num*-1);
		scan.close();
		
		
		

	}

}
