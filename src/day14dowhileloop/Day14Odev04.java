package day14dowhileloop;

import java.util.Scanner;

public class Day14Odev04 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları do-while loop kullanarak çözünüz.
		// Kullanıcıya iki sayı girmesini söyleyin. 
		// Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın.
		// Eşit değilse tekrar iki sayı girmesini söyleyin.

		Scanner scan=new Scanner(System.in);
		System.out.println("İki tam sayı giriniz");
		int a,b;
		do {
			a=scan.nextInt();
			b=scan.nextInt();
			if(a!=b) {
				System.out.println("Tekrar iki tam sayı giriniz");
			}
		}while(a!=b);
		System.out.println("Kare oluşturdunuz");
		scan.close();
	}

}
