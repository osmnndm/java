package day06Odev;

import java.util.Scanner;

public class Odev0612 {

	public static void main(String[] args) {
		// Kullanıcıdan bir yıl alın eğer yıl 1000’e bölunuyorsa ekrana “Milenyum” yazdırın.
		// Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl” yazdırın.
		// Eğer yıl 10’a bulunuyorsa ekrana “Onyıl” yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yıl değeri giriniz");
		int yil=scan.nextInt();
		
		if(yil%1000==0) {
			System.out.println("Milenyum");
		}else if(yil%100==0) {
			System.out.println("Yüzyıl");
		}else if(yil%10==0) {
			System.out.println("Onyıl");
		}else
			System.out.println("Bulunduğunuz yıl onun katı yıllardan değil");
		
		scan.close();
	}

}
