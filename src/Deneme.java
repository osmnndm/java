
public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numA = 2;
		int numB = 3;
		String str1 = "Çok";
		String str2 = "Çalış";
		
		// Aşağıdaki çıktıları ekrana yazdırmak icin program yazınız.
		// A) Çok Çalış B) 5 Çok C) Çalış23 D) Çok1
		
		// A
		System.out.print("A) ");
		System.out.println(str1+" "+str2);
		
		// B
		System.out.print("B) ");
		System.out.println(numA+numB+" "+str1);
	
		// C
		System.out.print("C) ");
		System.out.println(str2+numA+numB);
		
		// D
		System.out.print("D) ");
		System.out.println(str1+(numB-numA));
		
		
		int numC = 2;
		int numD = 3;
		String str3 = "Study";
		String str4 = "Hard";
		// Yukarıdaki variable’lari kullanarak ekrana “61 Study-1”
		// yazdıran bir program yazınız.
		
		System.out.println();
		System.out.println(numC*numD+""+(numD-numC)+" "+str3+"-"+(numD-numC));
		
		
		
		

	}

}
