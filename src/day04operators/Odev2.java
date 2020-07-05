package day04operators;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		
	
	// Kullanıcının girdiği 4 basamaklı sayının tum rakamlarının toplamını	
	// ekrana yazdıran bir program yazınız.
		
	Scanner scan=new Scanner(System.in);
	System.out.println("dört basamaklı tam bir sayı giriniz");
	int sayi1=scan.nextInt();
	
	int birler=sayi1%10;
	int binler=sayi1/1000;
	int v=sayi1/10;
	int onlar=v%10;
	int v2=sayi1/100;
	int yuzler=v2%10;
	
	System.out.println("Bu sayının tüm rakamları toplamı= "+(birler+onlar+yuzler+binler));
	
		scan.close();	
	}

}
