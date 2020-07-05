package day06Odev;

import java.util.Scanner;

public class Odev0608 {

	public static void main(String[] args) {
		// Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
		// Diğer durumlarda ekrana “Harf değil” yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char harf=scan.next(".").charAt(0);
		
		if(harf>='a' && harf<='z') {
			System.out.println("Bu bir harftir");
		}else if(harf>='A' && harf<='Z') {
			System.out.println("Bu bir harftir");
		}else {
			System.out.println("Bu bir harf değildir");
		}
			
		scan.close();
	}

}
