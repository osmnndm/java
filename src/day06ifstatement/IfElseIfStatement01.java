package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		
		// kullanıcıdan yaşını alın
		// yaş 13 den az ise ekrana " Calışamaz" yazdırın
		// yaş 13 den 65 e kadar ise ekrana "Calışabilir" yazdırın
		// yaş 65 den büyük ise ekrana "Emekli" yazdırın
		// yas negatif olursa "Yas nefatif olamaz" yazsın
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		int yas=scan.nextInt();
		
		if(yas<0) {
			System.out.println("Yas negatif olamaz");
		} else if(yas<13) {
			System.out.println("Calışamaz");
		}else if(yas<=65) {
			System.out.println("Calışabilir");
		}else {
			System.out.println("Emekli");
		}
		
		scan.close();
		}

}
