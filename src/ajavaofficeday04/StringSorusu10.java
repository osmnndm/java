package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu10 {
	
//	Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
//
//	Test Data:
//	java is fun
//
//	Beklenen Çıktı:
//	JAVA IS FUN


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String str1 = sc.nextLine();
		
		kelime(str1);
		
		sc.close();
		
	}
	
	public static void kelime(String str1) {
		String str2 = str1.toUpperCase();
		System.out.println(str2);
	}
	
}
