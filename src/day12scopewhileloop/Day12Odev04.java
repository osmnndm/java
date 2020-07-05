package day12scopewhileloop;

import java.util.Scanner;

public class Day12Odev04 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		// ve başlangıç değerinden başlayıp bitiş değerinde biten 
		// tüm tamsayıların toplamını ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir başlangıç değeri giriniz");
		int bas=scan.nextInt();
		System.out.println("Lütfen bir bitiş değeri giriniz");
		int bit=scan.nextInt();
		
		int sum=0;
		if(bas<=bit){ 
			while(bas<=bit) {
				sum=bas+sum;
				bas++;
			}
		}else while(bit<=bas) {
			sum=bas+sum;
			bas--;
		}System.out.print("iki sayı arlalığındaki sayıların toplamı="+sum);
		scan.close();
	}

}
