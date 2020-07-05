package ajavaofficeday04;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorusu11 {
	
//	Girilecek iki String nesnesinin aynı verileri içerip içermediğini 
//	kontrol etmek için bir Java programı yazın.
//
//	Test Data:
//	Java is fun
//	Java is fun 
//
//	Beklenen Çıktı:
//	True
//
//
//
//	Test Data
//	Java is good
//	Java is fun
//
//	Beklenen Çıktı:
//	False
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cümle giriniz");
		String str1 = scan.nextLine();
		System.out.println("İkinci bir kelime veya cümle giriniz");
		String str2 = scan.nextLine();
		
		System.out.println(kelime(str1,str2));
		scan.close();
	}

	public static boolean kelime(String str1,String str2) {
		@SuppressWarnings("unused")
		boolean kont;
		if(str1.equals(str2)) {
			return kont = true;
		}
		return kont = false;
		}

}
