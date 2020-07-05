package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan yıl girmesini isteyin, girilen yıl artık yıl ise
		// ekrana artık yıl yazdırın. girilen yıl artık yıl değilse
		// ekrana artık yıl değil yazdırın.
		// şubat'ın 29 çektiği yıla artık yıl denir. 4 yılda bir olur.
		// artık yilin iki şarıt var. yıl 100'e bölünürse 400'e de bölünmeli
		// yıl 100'e bölünmezse 4'e bölünmeli
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yıl giriniz ");
		int yil=scan.nextInt();
		
		if(yil%100==0) {
			if(yil%400==0) {
				System.out.println("Artik yıl");
			}
		}else if(yil%4==0) {
			System.out.println("Artık yıl");
		}else {
			System.out.println("Artık yıl değil");
		}

		scan.close();
		
		

	}

}
