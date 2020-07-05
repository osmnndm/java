package day06Odev;

import java.util.Scanner;

public class Odev0610 {

	public static void main(String[] args) {
		// Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		// “Eşkenar üçgen” yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen”
		// yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın”
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen üçgenin herbir kenar uzunluğunu giriniz");
		double ken1=scan.nextDouble();
		double ken2=scan.nextDouble();
		double ken3=scan.nextDouble();
		
		if(ken1==ken2 && ken2==ken3) {
			System.out.println("Bu üçgen bir Eşkenar üçgendir.");
		}else if(ken1==ken2 || ken2==ken3 || ken1==ken3) {
			System.out.println("Bu üçgen bir İkizkenar üçgendir.");
		}else {
			System.out.println("Bu üçgen Çeşitkenar bir üçgendir.");
		}
			
		scan.close();
	}

}
