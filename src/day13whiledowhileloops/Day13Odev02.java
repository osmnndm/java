package day13whiledowhileloops;

import java.util.Scanner;

public class Day13Odev02 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları hem for loop hem de while loop kullanarak çözünüz.
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		// ve başlangıç değerinden başlayıp bitiş değerinde biten 
		// 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir başlangıç değeri giriniz");
		int bas=scan.nextInt();
		
		System.out.println("Lütfen bir bitiş değeri giriniz");
		int bit=scan.nextInt();
		int bas1,bit1;
		
		if(bas<=bit) {
			bas1=bas;
			bit1=bit;
		}else {
			bas1=bit;
			bit1=bas;
		}
		
		System.out.println("For Loop ile çözüm");
		System.out.print(bas1+" ile "+bit1+" sayı aralığında 3 ve 5'e bölünebilen sayılar: ");
		
		for(int i=bas1;i<=bit1;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
			}
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("For While ile çözüm");
			System.out.print(bas1+" ile "+bit1+" sayı aralığında 3 ve 5'e bölünebilen sayılar: ");
			
			while(bas1<=bit1) {
				if(bas1%3==0 && bas1%5==0) {
					System.out.print(bas1+" ");
					}
					bas1++;
			}
		scan.close();
		}
}
