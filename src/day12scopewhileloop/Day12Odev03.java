package day12scopewhileloop;

import java.util.Scanner;

public class Day12Odev03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		// ve başlangıç değerinden veya sonrasından başlayıp bitiş değerinde 
		// veya öncesinde biten tüm çift tamsayıları while loop kullanarak
		// ekrana yazdırınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir başlangıç değeri giriniz");
		int bas=scan.nextInt();
		System.out.println("Lütfen bir bitiş değeri giriniz");
		int bit=scan.nextInt();
		
		if(bas<=bit) {
			while(bas<=bit) {
				if(bas%2==0) {
				System.out.print(bas+" ");}
				bas++;
			}
		}else while(bit<=bas) {
			if(bas%2==0) {
			System.out.println(bas+" ");}
			bas--;
		}

scan.close();
	}

}
