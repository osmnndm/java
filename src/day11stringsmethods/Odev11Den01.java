package day11stringsmethods;

public class Odev11Den01 {

	public static void main(String[] args) {
		
		// Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye once dusunun sonra kodları yazarak
		// ekran çıktılarına bakın.
		
		String str = "Cat, caterpillar";
		System.out.println(str.substring(0));
		System.out.println(str.substring(3));
		System.out.println(str.substring(4));
		System.out.println(str.substring(15));
		System.out.println(str.substring(16));
		System.out.println(str.substring(5,8));
		System.out.println(str.substring(3,4));
		System.out.println(str.substring(5,5));
//		System.out.println(str.substring(8,5));
		System.out.println(str.startsWith("C"));
		System.out.println(str.startsWith("c"));
		System.out.println(str.startsWith("B"));
		System.out.println(str.startsWith("Cat"));
		System.out.println(str.startsWith("c",5));
		System.out.println(str.startsWith("ter",7));
		System.out.println(str.startsWith("p", 11));
		System.out.println(str.startsWith(""));
		System.out.println(str.endsWith("r"));
		System.out.println(str.endsWith("C"));
		System.out.println(str.endsWith(""));
		System.out.println(str.endsWith( " "));
		System.out.println(str.endsWith("lar"));
		System.out.println(str.endsWith("caterpillar"));

	}

}
