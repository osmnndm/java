package day08ternaryoperator;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullanıcıdan bir yıl girmesini isteyin, 
		// yıl artık yıl ise ekrana “Artık yıl” 
		// degilse ekrana “Artık yıl degil”yazdırın.
		// artık yilin iki şarıt var. yıl 100'e bölünürse 400'e de bölünmeli
		// yıl 100'e bölünmezse 4'e bölünmeli
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir yıl giriniz");
		int jahr=scan.nextInt();
		
		System.out.println(jahr%100==0 && jahr%400==0 ? jahr+" yılı bir Artık yıldır":(
				jahr%100!=0 && jahr%4==0 ? jahr+" yılı bir Artık yıldır.": 
					jahr+" yılı bir Artık yıl değildir."
				)
				);
		scan.close();
	}

}
