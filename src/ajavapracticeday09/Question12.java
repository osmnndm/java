package ajavapracticeday09;

import java.util.Scanner;

public class Question12 {
	
	/*
	 * Kullanıcı tarafından girilen yazı ya da sayının polindrom olup 
	 * olmadığını bulan bir program yazınız.
	 * 
	 * 1. Adım : Kullanıcıdan veri alalım.
	 * 2. Adım : For döngüsü kullanarak aldığımız ifadenin tersini bulalım.
	 * 3. Adım : Tersi ile normal ifadeyi karşılaştıralım.
	 * 
	 *      12321 = 12321
	 *      
	 *      baab = baad
	 *      
	 *      ey edip adanada pide ye
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı veya metin giriniz");
		String kelime = scan.nextLine();
		
		String tersHali ="";
		int length = kelime.length();
		
		for(int i=length; i>0; i-- ) {
			tersHali += kelime.substring(i-1, i);
		}
		
		System.out.println(tersHali);
		
		if(kelime.equals(tersHali)) {
			System.out.println("Bu bir polindromdur");
		}else {
			System.out.println("Bu bir polindrom değildir");
		}
		scan.close();
		
	}

}
