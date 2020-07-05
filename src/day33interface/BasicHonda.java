package day33interface;

public class BasicHonda extends Araba implements DisAraba,IcAraba {
	
	public static void main(String[] args) {
		
		BasicHonda basicHonda = new BasicHonda();
		basicHonda.diesel();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Hidrolik direksiyon");
	}

	@Override
	public void koltuk() {
		System.out.println("Kumaş koltuk");
	}

	@Override
	public void klima() {
		System.out.println("Manuel Klima");
	}

	@Override
	public void kapi() {
		System.out.println("Dört kapılı");
	}

	@Override
	public void move() {
		System.out.println("Önden çekişli");
	}

}
