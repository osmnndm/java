package day12scopewhileloop;

import java.util.Scanner;

public class Day12Odev02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		// ve başlangıç değerinden başlayıp bitiş değerinde
		// biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir başlangıç değeri giriniz");
		int bas=scan.nextInt();
		System.out.println("Lütfen bir bitiş değeri giriniz");
		int bit=scan.nextInt();
		
		if(bas<=bit) {
			while(bas<=bit) {
				System.out.print(bas+" ");
				bas++;
			}
		}else while(bit<=bas) {
			System.out.println(bas+" ");
			bas--;
		}
scan.close();
	}

}
