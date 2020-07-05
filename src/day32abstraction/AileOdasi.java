package day32abstraction;

public class AileOdasi extends Otel {
	
	public static void main(String[] args) {
		
		AileOdasi musteri2 = new AileOdasi();
		
		musteri2.kahvalti();
		System.out.println("Wifi ücreti: "+ musteri2.wifi(6));
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltınız Cafeteria'da olacaktır.");
	}
	
	

}
