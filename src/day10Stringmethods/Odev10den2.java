package day10Stringmethods;

public class Odev10den2 {

	public static void main(String[] args) {
		
		// Aşağıdaki kodların ekran çıktısı alınırsa ne olur 
		
		
		String str = "Cat, caterpillar";
				System.out.println(str.lastIndexOf("a"));
				System.out.println(str.lastIndexOf("at"));
				System.out.println(str.lastIndexOf("s"));
				System.out.println(str.lastIndexOf("CAT"));
				System.out.println(str.lastIndexOf("pars"));
				System.out.println(str.lastIndexOf("a" , 3 ));
				System.out.println(str.lastIndexOf("a" , 5 ));
				System.out.println(str.lastIndexOf("at", 2));
				System.out.println(str.lastIndexOf("at", 7));
				
				String str1 = "";
				System.out.println(str1.isEmpty());
				String str2 = " ";
				System.out.println(str2.isEmpty());
				String str3 = "Almanya";
				System.out.println(str3.isEmpty());
		

	}

}
