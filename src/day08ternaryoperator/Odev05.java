package day08ternaryoperator;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullanıcıdan bir tamsayı girmesini isteyin, 
		// o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		// 3 basamaklı degilse çift olup olmadigini kontrol edin. 
		// Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
		// Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir tam sayı giriniz");
		int num=scan.nextInt();
		
		System.out.println((num>99 && num<1000 || num>-1000 && num<-99)? num+" sayısı üç basamaklı bir sayıdır":(
				num%2==0 ? num+" sayısı üç basamaklı olmayan bir çift sayıdır.":
				num+" sayısı üç basamaklı olmayan bir tek sayıdır."
				)
				);
		scan.close();
		
		
	}

}
