package day12scopewhileloop;

import java.util.Scanner;

public class Day12Odev05 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		// ve başlangıç değerinden başlayıp bitiş değerinde biten 
		// tüm tamsayıların çarpımını ekrana yazdırın.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir başlangıç değeri giriniz");
		int bas=scan.nextInt();
		System.out.println("Lütfen bir bitiş değeri giriniz");
		int bit=scan.nextInt();
		
		int sum=1;
			while(bas<=bit) {
				sum=bas*sum;
				bas++;
			} System.out.print("iki sayı arlalığındaki sayıların çarpımı="+sum);	
	scan.close();
	}
	
}
