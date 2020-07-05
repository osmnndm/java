package day02wrapperclasses;

import java.util.Scanner;

public class daire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);

		System.out.println("Dairenin yarıçapını giriniz");
		float r=scan.nextFloat();
		System.out.print("Dairenin alanı = ");
		System.out.println(3.14159*r*r);
		System.out.println();
		System.out.print("Dairenin çevresi = ");
		System.out.println(3.14159*2*r);
		
				
		scan.close();
		

	}

}
