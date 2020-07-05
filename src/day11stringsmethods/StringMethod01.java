package day11stringsmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		
		// startsWith() methodu bir Stringin istenen harfle başlayıp başlamadğını
		// kontrol eder. istenen harfle başlıyorsa True, istenen harfle 
		// başlamıyorsa False return eder.
		
		String str1="Ali Can";
		// startsWith() 1. VERSİYON
		
		System.out.println(str1.startsWith("A")); // true return etmesi lazım.
		System.out.println(str1.startsWith("B")); // false 
		System.out.println(str1.startsWith("a")); // false
		System.out.println(str1.startsWith("Ali")); // true
		
		// startsWith() 2.VERSİYON
		
		System.out.println(str1.startsWith("a",3)); 
		// 3.index ve sonrasına a varmı diye bakar varsa true der.
		// false
		
		System.out.println(str1.startsWith("a",5));
		// 5.index ve sonrasına a varmı diye bakar varsa true der.
		// true
		
		System.out.println(str1.startsWith("Can",4));
		
		
		// ensWith( ) methodu bir Stringin istenen harfle bitip bitmediğini
		// kontrol eder. istenen harfle bitiyorsa true, bitmiyorsa false return eder.
		
		String str2="Ayse Canan";
		System.out.println(str2.endsWith("n")); // true
		System.out.println(str2.endsWith("Canan")); // true
		System.out.println(str2.endsWith("CANAN")); // false
		System.out.println(str2.endsWith("")); // true verir. n den sonra içinde hiçbirşeymi var diye soruyor.
		// "" ve " "  tamamıyla farklıdır. ikincinin içinde boşluk karakteri var. bircinin içinde hiçbirşey yok. 

		String str3="Ali "; // true
		System.out.println(str3.endsWith(" ")); // true
		
		
	}

}
