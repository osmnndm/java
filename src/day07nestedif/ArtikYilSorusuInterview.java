package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// 

		// Kullanıcıdan yıl girmesini isteyin, girilen yıl artık yıl ise
		// ekrana artık yıl yazdırın. girilen yıl artık yıl değilse
		// ekrana artık yıl değil yazdırın.
		// şubat'ın 29 çektiği yıla artık yıl denir. 4 yılda bir olur.
		// artık yilin iki şarıt var. yıl 100'e bölünürse 400'e de bölünmeli
		// yıl 100'e bölünmezse 4'e bölünmeli
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yıl giriniz");
		int yil=scan.nextInt();
		
		if(yil%100==0 && (yil%400==0)) {
			System.out.println(yil+ " Bu yil bir artık yildir");
		}else if((yil%100!=0) && (yil%4==0)){
			System.out.println(yil +" yılı bir artık yıldır");
	}else {
		System.out.println(yil+" yılı artık bir yıl değildir");
	}scan.close();
	}
}
