package day10Stringmethods;

import java.util.Scanner;

public class Odev1004 {

	public static void main(String[] args) {
		
		// Kullanıcıdan yaşadığı ülkenin ismini alın 
		// bu ülkenin ismi Amerika ise ekrana USA, 
		// Ingiltere ise ekrana UK, 
		// Almanya ise ekrana DE yazdırın. 
		// Diğer ülkeler için ise NA yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yaşadığınız ülkenin ismini yazınız");
		String ulke=scan.next();
		ulke=ulke.toLowerCase();
		
		switch(ulke) {
		case "amerika":
			System.out.println("USA");
			break;
		case"ingiltere":
			System.out.println("UK");
			break;
		case"almanya":
			System.out.println("DE");
			break;
			default:
				System.out.println("NA");
		}
		scan.close();
		
		
	}

}
