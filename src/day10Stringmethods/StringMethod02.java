package day10Stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		
		// lastIndexOf() methodu aradığınız karakterin String içindeki son görümünün indexini return eder.
		// a harfininin en son nerede görüldüğünü bulur.
		
		
		String str1="Sivrihisar";
		System.out.println(str1.lastIndexOf('i'));
		// ekrana 6 yazdırır.

		
		System.out.println(str1.lastIndexOf('r'));
		// ekrana 9 yazdırır.
		
		
		// LASTİNDEXOF() 2. VERSİYON
		System.out.println(str1.lastIndexOf('i',7));
		// ilk 7 indexin içinde i harfinin son görümünün indexini return eder.
		
		System.out.println(str1.lastIndexOf('i',5));
		// ilk 5 indexin içinde geçen en son i harfini return eder
		
		// LASTİNDEXOF() METHODU 3. VERSİYON
		
		String str2="rivrihisar";
		System.out.println(str2.lastIndexOf("ri"));
		
		// String içindeki "ri" nin son görünümünü bulacak.
		// son "ri" deki 'r' harfinin indexinin return edecek.
		
		
		
		
	}

}
