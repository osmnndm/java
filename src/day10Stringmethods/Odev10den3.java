package day10Stringmethods;

public class Odev10den3 {

	public static void main(String[] args) {
	
		// Aşağıdaki kodların ekran çıktısı alınırsa ne olur
		
				String str = "Cat, caterpillar";
				System.out.println(str.toUpperCase());
				System.out.println(str.toLowerCase());
				System.out.println(str.substring(4).toLowerCase());
				System.out.println(str.substring(3,8).toUpperCase());
				System.out.println(str.toUpperCase().toLowerCase());
				String strA = "Cat ";
				System.out.println(strA.trim());
				String strB = " Cat";
				System.out.println(strB.trim());
				String strC = " Cat ";
				System.out.println(strC.trim());
				
				String strD = "Cat";
				System.out.println(strD.contains("a"));
				String strE = " Cat";
				System.out.println(strE.contains(" "));
				String strF = "Cat";
				System.out.println(strF.contains(""));
	//			String strG = "Cat";
				System.out.println(strF.contains("d"));
	}

}
