package day11stringsmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		
		// substring() methodu bir String'in belli bir bölümünü kesip almak için kullanılır

		String str1="Java calışana kolaydır";
		
		System.out.println(str1.substring(5)); // substring(beginIndex) 
		                                       //index dahil şekilde devamını alır.
		System.out.println(str1.substring(9)); // şana kolaydır. index 9 dahil.
		System.out.println(str1.substring(22)); // metin 22 index ekranda hiç bir şey göremezsiniz
	//	System.out.println(str1.substring(23)); // 23 olunca hata verir.
		System.out.println(str1.substring(0)); // str1.substring=str1 olduğundan substring(0) hiç kullanılmaz
	
		
		// substring() 2.VERSİYON
		
		System.out.println(str1.substring(5, 13)); 
		// ilk index dahil ikinci index dahil değil.
		// ilk indexi ekranda görürsünüz, ikinci indexi ekranda göremezsiniz. [5,13)
		// çalısana return eder
		
		System.out.println(str1.substring(6, 12));
		// alısan
		
		System.out.println(str1.substring(6, 6));// ilk "6" dahil et ikinci "6" dahil etme
		// ekranda birşey gözükmez.
		
		
//		System.out.println(str1.substring(7, 6));// hata verir
		
		
		
	}

}
