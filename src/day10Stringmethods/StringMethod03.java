package day10Stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		
		// charAt() methodu belli indexteki characteri return eder.
		
		String str1="cimbombom";
		// str1 in 4. indexindeki karakteri bulan kodu yazınız.
		
		System.out.println(str1.charAt(4));
		// index i 4 olan karakter o harfidir.
		
		System.out.println(str1.charAt(0));
		// index 0 ilk harfi gösterir.
	//	System.out.println(str1.charAt(10));
		// olmayan bir index ile işlem yapmaya çalışırsanız console da exeption alırsınız. 
		// buda büyük bir hata yaptınız demektir.
		
		
		// length() methodu Stringin içinde kac karakter olduğunu verir.
		
		System.out.println(str1.length());
		// ekrana 9 yazdırır.index saymaya 0 dan başlar
		// length() saymaya 1 den başlar.
		
		// son indexi 9 olan bir Stringin length i kaçtır.
		// cevap: 9+1=10
		// length =son index+1
		
		
		
		// Kullanıcıdan ismini girmesini isteyin
		// isminin son harfini ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz");
		String isim=scan.nextLine();
		
		int sonch=isim.length();
		sonch=sonch-1;
		
		System.out.println("son karakter : "+isim.charAt(sonch));
				
		scan.close();
	}

}
