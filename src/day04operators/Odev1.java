package day04operators;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		
	// Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını
	// ekrana yazdıran bir program yazınız.
		
	Scanner scan=new Scanner(System.in);
	System.out.println("dört basamaklı tam bir sayı giriniz");
	int sayi1=scan.nextInt();
	
	int bir=sayi1%10;
	int bin=sayi1/1000;
	System.out.println("Birler ve Binler basamağının toplamı= "+(bir+bin));
		
scan.close();
	}

}
