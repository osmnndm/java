package day06Odev;

import java.util.Scanner;

public class Odev0606 {

	public static void main(String[] args) {
		// Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		// “Eşkenar üçgen” yazdırın. Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Üçgenin üç kenar uzunluğunu sırasıyla giriniz");
		double ken1=scan.nextDouble();
		double ken2=scan.nextDouble();
		double ken3=scan.nextDouble();
		
		if(ken1==ken2 && ken2==ken3 && ken1==ken3) {
			System.out.println("Bu üçgen bir eşkenar üçgendir.");
		}else {
			System.out.println("Bu üçgen bir eşkenar üçgen değildir.");
		}
		
		scan.close();
		
	}

}
