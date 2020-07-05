package CumJava_Review_Turkisch;

import java.util.Scanner;

public class Day0302 {

	public static void main(String[] args) {
		
		// Kullanıcıdan iki farklı kelime yazsın string olarak
		// progra bu kelimeleri beraberce ekrana yazdırsın ve sonuna ünlem işarei eklesin
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("iki kelime yazınız");
//		String kelime1=scan.next();
//		String kelime2=scan.next();
//		
//		System.out.println(kelime1+kelime2+"!");
//scan.close();
		
		
		
		
//		 Kullanici  iki sayi girsin 
//		  Program girilen sayilarin karesini ayri ayri ekrana yazdirsin //
//		  Ayri olarak; Program girilen sayilari ayri ayri 5 ile carpimini
//		  ve sonucunu ekrana yazdirsin. //
//		  Ayri olarak; Program girilen sayilara ayri ayri 12 eklesin //
//		  Ayri olarak; Program girilen sayilardan ayri ayri 5 cikarsin //
//		  
		  
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int num1=scan.nextInt();
		
		System.out.println("İkinci sayıyı giriniz");
		int num2=scan.nextInt();
		
		int kare1=num1*num1;
		int kare2=num2*num2;
		
		System.out.println(num1+ " sayısının karesi :"+ kare1);
		System.out.println(num2+ " sayısının karesi :"+ kare2);
		
		System.out.println(num1+"x"+"5"+"="+num1*5);
		System.out.println(num2+"x"+"5"+"="+num2*5);
		  
		  
		  
	}

	
	
	
}
