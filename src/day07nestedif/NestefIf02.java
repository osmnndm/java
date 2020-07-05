package day07nestedif;

import java.util.Scanner;

public class NestefIf02 {

	public static void main(String[] args) {
		
		// kullanıcıdan password girmesini isteyin
		// password dört basamaklı bir sayı ise
		// çift olup olmadığını kontrol edin
		// cift sayıise "Password tamam" yazdırın
		// tek sayı ise "Tekrar deneyin" yazdırın
		// Password dört basamaklı değilse " Tekrar deneyin" yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Tam sayı olan bir password giriniz");
		int pas=scan.nextInt();
		
		if(pas>999 && pas<10000) {
			if(pas%2==0) {
				System.out.println("Password tamam");
			}else if (pas%2!=0){
				System.out.println("Tekrar deneyin");
			}
		} else {
				System.out.println("Tekrar deneyin");
				
			
		}
		
		
		
		scan.close();
		
		
	}

}
