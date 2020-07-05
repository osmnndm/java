package day10Stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		
		// contains() methodu bir Stringin içinde bir characterin olup olmadğını kontrol eder.
		// eğer o karakter Stringin içinde true yoksa false return eder.
		// contains methodunun içine her zaman String koyuyoruz. charı kabul etmez.
		// çok kullanılan bir methoddur.
		
		
		String str1="karakartal";
		System.out.println(str1.contentEquals("m"));
		
		// false görürürüz. 
		//contains
		
		System.out.println(str1.contains("kar"));
		// true görünür.
		

		// Bir Stringin baş ve sonundaki boşlukları siler.
		// "  Ali     " baş ve sondaki boşlukları siler "Ali" haline getirir.
		// "Ali    Can" ortadaki boşluklara dokunmaz.
		
		String str2="    Ali Can    ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		
		// isEmpty() methodu bir Stringin içinde character olup olmadığına bakar.
		// character yoksa true, varsa false return eder.
		
		String str3= "Ali";
		System.out.println(str3.isEmpty());
		// false çünkü String boş değil
		
		String str4=" ";
		System.out.println(str4.isEmpty());
		// false çünkü space Java için bir karakterdir.
		
		String str5="";
		System.out.println(str5.isEmpty());
		//true verir çünkü içinde hiç bir şey yok
		
		
		//Note: isEmpty() true çıkarsa length 0 çıkar.
		
		
	}

}
