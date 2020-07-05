package day04operators;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		
		
		// 3 basamaklı bir sayının rakamları toplamını yazdırma
		
		Scanner scan=new Scanner(System.in);
		System.out.println("üç basamaklı tam bir sayı giriniz");
		int sayi1=scan.nextInt();
		
		int birler=sayi1%10;
		int yuzler=sayi1/100;
		int kalan=sayi1%100;
		int onlar=kalan/10;
		
		System.out.println("girilen sayının rakamları toplamı = "+ (birler+onlar+yuzler));
		
		scan.close();
		
	}

}
