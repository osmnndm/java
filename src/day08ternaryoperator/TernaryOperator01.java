package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir sayı alınız
		// sayı pozitif veya 0 ise ekrana Pozitif yazdırınız.
		// sayı negatif ise ekrana Negatif yazdırınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num=scan.nextInt();
		
	//	if(num>=0) {
	//		System.out.println("Pozitif veya 0");
	//	}else {
	//		System.out.println("Negatif");
	//	}
		
	// Ternary Operator if else
	// Condition(şart)ı yazıp soru işareti koyuyoruz.
	// sonra Condition doğru olduğunda ne yapacak onu yazıyoruz ve : 
	// sonra Condition yanlış ise
		
	//Syntax (komut satırı)
	//              = condition + ?+ iş + yanlışsa yapılacak iş;
		String sonuc= num>=0 ? "Poziftif veya 0" : "Negatif";
		System.out.println(sonuc);
		scan.close();
		
		
	
		
		
		
		
		
	}

}
