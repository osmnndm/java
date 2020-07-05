package day10Stringmethods;

public class Odev10den1 {

	public static void main(String[] args) {
		
		// Aşağıdaki kodların ekran çıktısı alınırsa ne olur 
		
		
		String str="Cat, caterpillar";
		
		
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf("cat"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf("CAT"));
		System.out.println(str.indexOf("ter"));
		System.out.println(str.indexOf("pars"));
		System.out.println(str.indexOf("a" , 3 ));
		System.out.println(str.indexOf("at", 2));
		System.out.println(str.indexOf("at", 8));
	}

}
