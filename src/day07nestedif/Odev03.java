package day07nestedif;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan password girmesini isteyin.
		// Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. 
		// Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
		// Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
		// Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir Password giriniz");
		int pas=scan.nextInt();
		
		if(pas%10==0) {
			System.out.println("5'e bölünebilen çift sayı");
		}else if(pas%10==5) {
			System.out.println("5'e bölünebilen tek sayı");
		}else if(pas%5!=0) {
			System.out.println("Tekrar deneyin");
		}
		scan.close();
		
	}}