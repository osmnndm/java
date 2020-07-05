package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu08 {
	
	public static void main(String[] args) {
		
	
	
	// girilen iki String veriyi karşılaştıran Java kodu yazınız.
	// aynı ise True farklı ise false return etsin.
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen bir kelime giriniz");
	String str1 = scan.nextLine();
	System.out.println("Lütfen bir kelime daha giriniz");
	String str2 = scan.nextLine();
	
//	System.out.println(str1.contentEquals(str2)); // sonucu boolean veren bir method
	
	System.out.println(kont(str1,str2));
	
	}
	
	public static boolean kont (String str1, String str2) {
		@SuppressWarnings("unused")
		boolean kont1;
		
		if(str1.equals(str2)) {
			return (kont1 = true);
		}
		return kont1=false;
	}
}
