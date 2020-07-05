package day30exceptions;

public class ThrowSorusu01 {
	
	public static void main(String[] args) {
		
		try {
			hop(); // RuntimeException yakalar çünkü onun parent'ıdır.
		}catch (Exception e) {
			System.out.println(e); // burada e exception adıdır. e yazdığımız için 
			// altta java.lang.RuntimeException yazar.
		}
	}

	private static void hop() {
		throw new RuntimeException("cannot hop");
		
		// cannot hop cevap
	}
}
