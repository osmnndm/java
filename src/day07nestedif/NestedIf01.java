package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir sayı alın. 
		// bu sayı pozitif ise 9'dan büyük mü diye kontrol edin.
		// 9'dan büyük ise ekrana "Sayı" yazdırtın.
		// 9'dan küçük eşit ve 0'dan büyük eşit ise ekrana "Rakam" yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num=scan.nextInt();
		
		if(num>=0) {
			if(num>9) {
				System.out.println("Sayi");
			}else if(num<=9 && num>=0) {
				System.out.println("Rakam");
				
				scan.close(); // Scanner Class'ının kullandıktan sonra en altta main method'un içinde 
				// Scanner Class'ını kapatınız
				// Scanner Class'ını kapatmak için scan.close(); yazmak yeterlidir.
			}
		}
		
		
		
		
		
		

	}

}
