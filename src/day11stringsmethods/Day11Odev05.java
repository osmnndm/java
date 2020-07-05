package day11stringsmethods;

import java.util.Scanner;

public class Day11Odev05 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		// ve başlangıç değerinden başlayıp bitiş değerinde biten 
		// tüm tamsayıların çarpımını ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir başlangıç değeri giriniz");
		int ilk =scan.nextInt();
		System.out.println("Bitiş değeri giriniz");
		int son =scan.nextInt();
		
		int sum=1;
		for(int i=ilk; i<=son; i++) {
			sum=sum*i;
		}
		System.out.println("Bu aralıktaki sayıların çarpımı="+sum);
		scan.close();

	}

}
