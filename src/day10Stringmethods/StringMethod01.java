package day10Stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		
		// indexOf() method'u String içindeki karakterin yerini belirlemek için kullanılır.
		
		String str1="Javva World";
		System.out.println(str1.indexOf('v'));  
		
		// Ekrana 2 yazdırır. 										
		// çünkü index sayımı 0 dan başlar ve 2 olarak yazar.
		
		System.out.println(str1.indexOf('W'));
		// Ekrana 6 yazdırır. space Java için bir character dir.
				
		System.out.println(str1.indexOf('w'));
		// Java index bulamaz çünkü java "case sensitive" oidb
		// küçük w Stringde yok. Java character bulamayınca -1 return eder.
		
		System.out.println(str1.indexOf('a'));
		// Ekrana 1 yazdırır. birden fazla kullanılan characterler için Java ilk characterin indexini verir.
		
		// İNDEXOF() İKİNCİ VERSİYONU
		System.out.println(str1.indexOf('a',2));
		// String'deki ikinci a karakterinin index'ini bulsun.
		// ekrana 4 yazdırmalı.
		// aradığımız harfi yazıyoruz. "," 2 yazıyoruz. 
		// Bunun manası ikinci index ten itibaren 'a'yı arayıp indexini yazdır.
		
		System.out.println(str1.indexOf('a',4));
		// ekrana 4 yazdırır. ikinci a'dan itibaren aramaya başlar
		
		System.out.println(str1.indexOf('a',1));
		// ekrana 1 yazdırır
		
		System.out.println(str1.indexOf('a',5));
		// ekrana -1 yazdırır.
		
		
		
		// "Alamanya" Stringindeki ikinci 'a' karakterinin indexini bulunuz
		
		String str2="Alamanya";
		System.out.println(str2.indexOf('a'));
		// birinci 'a' nın indexini bulur 2 yazar.
		// idx= index için kısaltma olarak genellikle kullanılır
		
		int idx=str2.indexOf('a');
		
		System.out.println(str2.indexOf('a',3));
		// ekrana 4 yazdırır.
		
		System.out.println(str2.indexOf('a',idx+1));
		// aynı karakterden bir çok defa tekrar ediliyorsa bir sonraki aynı karakterin index ini bulur.
		
		
		// İNDEXOF() METHODUNUN 3. VERSİYONU
		
		String str3="Missisippi"; 
		// "is" Stringini arayalım.
		// ilk karakterin index'ini return eder.
		// ilk "is" deki 'i' harfinin index'i olan 1 i return eder.
		
		System.out.println(str3.indexOf("is"));
		

	}

}
