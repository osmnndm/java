package day11stringsmethods;

public class StringMethod03 {

	public static void main(String[] args) {
		
		// concat() method cancatenation yapmanın 
		// yani iki stringi birleştirmenin diğer yönetmidir.
		// str1+str2 ile aynıdır
		// concat'i istediğiniz kadar peşpeşe kullanabilirsiniz.
		
		String str1="Ali";
		String str2="Veli";
		
		System.out.println(str1+str2); // AliVeli
		System.out.println(str1.concat(str2)); // AliVeli
		
		System.out.println(str1.concat(str2).concat(str1));
		// AliVeliAli
		System.out.println(str1.concat("==>").concat(str2));
		// Ali==>Veli

		
		
		// replace() methodu bir karakterin yerine başka bir karakter yazmaya yarar.
		// örnek ata yerine ana yazmak gibi
		
		String str3="ata";
		System.out.println(str3.replace("t", "n")); // t gördügün yere n koy demektir.
	//	str3.replace(oldChar, newChar)
		System.out.println(str3.replace("a", "ü")); // ütü yazar
		System.out.println(str3.replace("x", "y")); // x harfi olmadığı için hiç birşey yapmaz
		System.out.println(str3.replace("", "/")); // /a/t/a/ return eder.
		System.out.println(str3.replace("t", "")); // aa return eder.
		//t yi imha ediyor. bir harfi silmek için kullanılabilir.
		System.out.println(str3.replace("at", "Mustaf")); // Mustafa
		
		
		
		
		// replaceFirst() methodu değiştirmek istediğimiz karakterin sadece ilk eşleşen karakteri değiştirir.
		
		String str4="karakartal";
		System.out.println(str4.replaceFirst("k", "K")); // Karakartal
		System.out.println(str4.replaceFirst("a", "e")); // kerekartal
		System.out.println(str4.replaceFirst("ka", "A")); // Arakartal
		System.out.println(str4.replaceFirst("kara", "")); // kartal
		System.out.println(str4.replaceFirst("karak", "K")); // Kartal
		System.out.println(str4.replaceFirst("karakartal", "cimbombom")); // cimbombom
		
		// Soru
		String text="Ali okula gitti. Ali otobüse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
		System.out.println(text.replace("Ali", "Veli"));
		// Veli okula gitti. Veli otobüse bindi. Veli eve geldi. Veli yemek yedi. Veli uyudu.
		
		
		
		
	}

}
