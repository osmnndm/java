package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan 3 basamaklı bir tam sayı alın bu sayının rakamları toplamını bulunuz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("3 basamaklı bir tam sayı giriniz");
		int sayi1=scan.nextInt();
		
		int sonRakam=sayi1%10;
		int ilkRakam=sayi1/100;
		int v=sayi1/10;
		int ortaRakam=v%10;
		
		
		System.out.println(sonRakam+ilkRakam+ortaRakam);
	scan.close();	
	}

}
