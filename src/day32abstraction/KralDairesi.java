package day32abstraction;

public class KralDairesi extends Otel {
	
	public static void main(String[] args) {
		
		KralDairesi musteri3 = new KralDairesi();
		musteri3.kahvalti();
		System.out.println("TV Ücreti: "+musteri3.tv("international", 5));
		System.out.println("Wifi ücreti: "+musteri3.wifi(3));
		
	}
	
	public void kahvalti() {
		System.out.println("Kahvaltınız teras kat Kral Restaurant'dadır.");
	}

	public int tv(String international, int saat) {
		if(international.equals("international")) {
			return saat*5;
		}else {
			return 0;
		}
	}
}
