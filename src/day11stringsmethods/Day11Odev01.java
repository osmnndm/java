package day11stringsmethods;

import java.util.Scanner;

public class Day11Odev01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		// ve başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıları ekrana yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir başlangıç değeri giriniz");
		int ilk =scan.nextInt();
		System.out.println("Bitiş değeri giriniz");
		int son =scan.nextInt();
		
		for(int i=ilk; i<=son; i++) {
			System.out.print(i+" ");
		}
		scan.close();
	
		
	}

}
