package day30exceptions;

public class ThrowSorusu02 {
	
	public static void main(String[] args) {
		
		try {
			hop();
		}catch (Exception e) {
			System.out.println(e.getMessage()); // getMessage eException'ı yakala sadece mesajı yazdır.
												// teknik hata mesajını yazma demektir.
									       // sadece e yazılsaydı java.lang.RuntimeException yazacaktı
		}
	}
	
	private static void hop() {
		throw new RuntimeException ("cannot hop");
	}

}
