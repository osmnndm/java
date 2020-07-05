package day16overloading;

public class Overlaoding02 {

	public static void main(String[] args) {
		
		
		
		// Note 1: Return type'i değiştirmek overloading için yeterli değildir.
		// Java methodların farklı olup olmadıklarını anlamak için iki şeye bakar.
		// a) method ismine b) parametrelere bakar.
		// Method ismi ve parametreler Java için methodların imzası gbiidir.
		// Java da method imzası yerine " method signature" denir.
		// Note 2: Access Modifier'ları değiştirmek de methodları Java açısından farklı hale getirmez.
		// public,privat vs. = access modifier
		// çünkü access modifier'lar method signature'a dahil değildir.
		// Note 3: Method'ların body'sini değiştirmek de methodları java açısında farklı hale getirmez.
		// çünkü body'lar method signature'a dahil değildir.
		// Note 4: Siz daha kodu yazarken yani kodu çalıştırmadan önce Java sizi yaptığınız hatalardan dolayı 
		// uyarırsa bu tip hatalara "Compile Time Error" denir. (altta kırmızı çizgi ile yazması)
		// Note 5: kodu yazarken herhangi bir hata yok. fakat kodu çalıştırdıktan sonra console'da 
		// kırmızı hata mesajlar alırsanız bu hatalara "Run Time Error" denir.
		
//		public static void carpma(int num1, int num2) {
//		System.out.println(num1* num2);
//	}
	
//	public static int carpma(int num1, int num2) {
//		return num1/num2;
//	}
	
//	private static int carpma(int num1, int num2) {
//		return num1* num2;

//			
//		}
	}

}
