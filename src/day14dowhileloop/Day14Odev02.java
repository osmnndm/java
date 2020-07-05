package day14dowhileloop;

import java.util.Scanner;

public class Day14Odev02 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları do-while loop kullanarak çözünüz.
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		// ve başlangıç değerinden başlayıp bitiş değerinde biten 
		// 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir başlangıç değeri giriniz");
		int bas=scan.nextInt();
		System.out.println("Bir bitiş değeri giriniz");
		int bit=scan.nextInt();
		
		if(bas>bit) {
			bit=bas;
		}
		System.out.print(bas+" - "+bit+" sayı aralığında 4 ve 6 ya bölünebilen sayılar: ");
	
		do {
			if(bas%4==0 && bas%6==0) {
				System.out.print(bas+" ");
			}
			bas++;
		}while(bas<bit);
		scan.close();
	}

}
