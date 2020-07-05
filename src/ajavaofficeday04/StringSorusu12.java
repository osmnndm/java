package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu12 {
	
//	Girilen String değerin uzunluğunu yazdıran Java kodunu yazınız.
//
//	Test Data
//
//	techproed.com
//
//	Beklenen çıktı:
//	techproed.com 13 karakterdir.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cümle giriniz");
		String str = scan.nextLine();
		
		System.out.println(uzunluk(str));
		
		
		
		scan.close();
		
		
	}
	
	public static int uzunluk(String str) {
		int length = str.length();
		return length;
	}

}
