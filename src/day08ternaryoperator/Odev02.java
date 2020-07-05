package day08ternaryoperator;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan iki tamsayı girmesini isteyin, 
		// ekrana her zaman büyük olanını yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki tam sayı giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		System.out.println(num1>num2 || num1<num2 ? (
				num1>num2 ? num1+ " sayısı "+ num2+" sayısından büyüktür" :
			num2+ " sayısı "+ num1+" sayısından büyüktür"  )
				:num1+" sayısı "+num2+" sayısına eşittir.");
		scan.close();
		
		
		
	}

}
