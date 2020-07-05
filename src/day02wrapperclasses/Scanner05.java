package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
	// Dairenin alanı ve çervresini bulunuz.	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen dairenin yarı çapını giriniz");
		double yaricap= scan.nextDouble();
		System.out.print("Dairenin alanı = ");
		System.out.println(3.14159*yaricap*yaricap);
		System.out.print("Dairenin çevresi = ");
		System.out.println(2*3.14159*yaricap);
		
		
		// data tipi int ise nextInt() kullanılır
		// data tipi double ise nextDouble() kullanılır
		
		scan.close();

	}

}
