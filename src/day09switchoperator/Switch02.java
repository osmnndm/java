package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		// Kullanıcı haftanın gün numarasını girsin
		// Programınız günün ismin yazsın
		// yanlış gün sayısı girerse geçerli gün sayısı giriniz.
		// switch kullanarak yapınız
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Haftanın gün numarasını giriniz");
		int day=scan.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("geçerli gün sayısı giriniz");
		}
		scan.close();
	}

}
