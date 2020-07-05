package day11stringsmethods;

import java.util.Scanner;

public class Day11Odev03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		// ve başlangıç değerinden veya sonrasından başlayıp bitiş değerinde veya öncesinde biten 
		// tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir başlangıç değeri giriniz");
		int ilk =scan.nextInt();
		System.out.println("Bitiş değeri giriniz");
		int son =scan.nextInt();
		
		if(ilk>=son) {
			System.out.println("Başlangıç değeri bitiş değerinden küçük olmalıdır.");
		}else {
		
		for(int i=ilk; i<=son; i++) {
			if(i%3==0) {
				System.out.println(i);
		}}
		scan.close();
		

	}}

}
