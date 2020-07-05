package ajavapracticeday06;

import java.util.Scanner;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle giriniz");
		String cumle =scan.nextLine();
		
		int ilkBosluk = cumle.indexOf(" ");
		int sonuncuBosluk = cumle.lastIndexOf(" ");
		
		System.out.println(cumle.substring(sonuncuBosluk+1)+cumle.substring(ilkBosluk, sonuncuBosluk+1)+cumle.substring(0, ilkBosluk));
		
	
	}

}
