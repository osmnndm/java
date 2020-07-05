package day30exceptions;

public class ThrowSorusu03 {
	
	public static void main(String[] args) {
		
		try {
			hop();
		} catch ( Exception e) {
			e.printStackTrace(); // bunu kullanırsak hangi satırlarda Exception aldığımızı gösterir
//			at day30exceptions.ThrowSorusu03.hop(ThrowSorusu03.java:19) 
//			at day30exceptions.ThrowSorusu03.main(ThrowSorusu03.java:8)
//			Exception hataları oluşum sırasına göre consolda gösterir.
			
		}
	}

	private static void hop() {
		throw new RuntimeException ("cannot hop");
	}
}
