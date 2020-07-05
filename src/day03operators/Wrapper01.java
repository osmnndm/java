package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		// Kullanıcıdan ad ve soyadını alıp ekrana yazdıran bir program yazınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Ad ve Soyadınız'ı giriniz");
		String isim=scan.nextLine();
		// Stringleri kullanıcıdan almak için ya sadece next kullanırsınız yada nextLine() kullanırız.
		// next tek kelimelik Stringler için kullanılır
		// nextLine satırın tamamını almak, tüm cümleyi almak için kullanılır.
		// nextLine girilen tüm String'i almak için kullanılır
		
		System.out.print("AD SOYAD :");
		System.out.println(isim);
		
		scan.close();
	}

}
