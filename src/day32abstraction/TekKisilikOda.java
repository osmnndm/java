package day32abstraction;

public class TekKisilikOda extends Otel {
	
	public static void main(String[] args) {
		
		TekKisilikOda musteri1 = new TekKisilikOda();
		musteri1.kahvalti();
		System.out.println("TV Ücriti: "+musteri1.tv(5));
		
		System.out.println("Wifi Ücreti: "+musteri1.wifi(1));
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltınız sadvictir");
	}
	
	public int tv(int saat) {
		return saat*2;
	}
	}
