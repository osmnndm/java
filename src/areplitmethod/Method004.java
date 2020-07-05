package areplitmethod;

public class Method004 {
	
	public static void main(String[] args) {
		
		// iki sayının eşitlik durmunu kontrol eden methodu yazınız.
		
		System.out.println(esitMi(1,3));
		
	}
	
	public static boolean esitMi(int num1, int num2) {
		if(num1 == num2) {
			return true;
		}
		return false;
	}

}
