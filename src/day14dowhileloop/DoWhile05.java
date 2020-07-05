package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		
		// Kullanıcıdan ismini alın
		// ilk harf büyük harf ise ekrana doğru giriş yaptınız
		// ilk harf küçük harf ise ilk harfi büyük olarak giriniz
		
		Scanner scan=new Scanner(System.in);
		String isim=""; // sayı olunca sıfır string olunca "" kullanabiliriz.
		
		do {
			System.out.println("Lütfen ilk isminizi giriniz");
			isim=scan.next();
			
			if(isim.charAt(0)>='A'&&isim.charAt(0)<='Z') {
				System.out.println("Doğru giriş yaptınız");
			}else {
				System.out.println("İlk harfi büyük harf olarak giriniz.");
			}
		}while(!(isim.charAt(0)>='A'&&isim.charAt(0)<='Z')); // ! değildir
		
scan.close();
	}

}
