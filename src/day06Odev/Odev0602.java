package day06Odev;

import java.util.Scanner;

public class Odev0602 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
		// “b, c, d, e” den biri ise ekrana “Sessiz harf” yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir harf yazınız");
		char harf=scan.next().charAt(0);
		
	
		if(harf=='a'|| harf=='e'|| harf=='i'|| harf=='o'|| harf=='u') {
			System.out.println(" \""+harf+ "\""+ " harfi sesli bir harftir.");
		}else if(harf=='b'|| harf=='c'|| harf=='d'|| harf=='e') {
			System.out.println("\""+harf+"\""+" harfi sessiz bir harftir.");
		}else {
			System.out.println("Yanlış harf girdiniz");
		}
			
			scan.close();
	}

}
