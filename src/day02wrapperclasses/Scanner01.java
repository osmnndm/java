package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
	// kullanıcı iki tam sayı versin
	// program bu tam sayıların toplamını ve çarpımını ekrana yazdırsın.
		
	Scanner scan = new Scanner(System.in);  
	
	// Scanner yazısının üstüne gelip çıkan ekrandan importu seç
	
	System.out.println("lütfen iki tam sayı giriniz.");
	
	int sayi1 = scan.nextInt();
	int sayi2 = scan.nextInt();
	
	System.out.println(sayi1+sayi2);
	System.out.println(sayi1*sayi2);
	
	scan.close();
	

	}

}
