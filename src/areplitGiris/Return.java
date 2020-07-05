package areplitGiris;

public class Return {

	
	public static int besilecarp(int a) {
		
		return (a*5);
		
	}
	
	public static int dörtiletopla(int a) {
		
		return (a+4);
		
	}
	
	public static int yediilecarp(int a) {
		
		return (a*7);
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(besilecarp(dörtiletopla(yediilecarp(2))));

	}

}
