package ajavapracticeday05;

public class ObjectOrnek {
	
	public static void main(String[] args) {
		
		StringBuilder stb = new StringBuilder();
		
		stb.append("bayram");
		System.out.println(stb.equals(stb.reverse())); // sonuç true çıkar. adresleri aynı olduğu için true
		System.out.println(); // sonuç true çıkar. haschcode objecktin kendine has tanımını 
//							  // yapan bir rakam verir.Bir adres.
		System.out.println(stb.hashCode());
	//  
		
		System.out.println(stb.equals(stb.reverse().toString())); // false verir.
		// to String ile Stringbuilder'ı Stringe çevirdik.
		
		StringBuilder stb2 = new StringBuilder();
		
		stb2.append("Zehra");
		System.out.println(stb2);
		System.out.println(stb2.reverse());
		
		System.out.println(stb2.equals(stb2.reverse())); // Zehra ile arheZ i karşılaştırıyoruz.
														 // true verecetir.
		// objecktleri aynı stb2 ve stb2 dolayısıyla aynı referance noktalarını gösterecek ve true verecek.
		// objectler için adresi kontrol ediyor.
		
		String name = "mahmut";
		String name2 = "mahmut";
		System.out.println(name.equals(name2)); // değeri karşılaştırıyoruz.
		
		
	}

}
