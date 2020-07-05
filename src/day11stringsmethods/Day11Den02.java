package day11stringsmethods;

public class Day11Den02 {

	public static void main(String[] args) {
		
		// Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye once dusunun sonra kodları yazarak
		// ekran çıktılarına bakın.
		
		String str = "Cat, caterpillar";
		System.out.println(str.replace('t', 'm'));
		System.out.println(str.replace("t", "m"));
		System.out.println(str.replace("x", "y"));
		System.out.println(str.replace("", "|"));
		System.out.println(str.replace("a", ""));
		System.out.println(str.replace("at", "amel"));
		System.out.println(str.replace("at", "e"));
		System.out.println(str.replaceFirst("c", "C"));
		System.out.println(str.replaceFirst("at", "amel"));
		System.out.println(str.replaceFirst("Cat, caterpillar", "Deve"));
	
		
		//	Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye once dusunun sonra kodları yazarak
		//	ekran çıktılarına bakın.
		
		String str1 = "900";
		String str2 = "1000";
		int str3 = 900;
		int str4 = 1000;
		System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
		System.out.println(String.valueOf(str3) + String.valueOf(str4));
		

	}

}
