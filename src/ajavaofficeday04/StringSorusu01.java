package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu01 {
	
	public static void main(String[] args) {
		
		// 1. girilen String değeri tersten yazan Java kodunu yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime yazınız");
		String kelime = scan.nextLine();
		
		int CountStr = kelime.length();
		
		while(CountStr>0) {
			System.out.print(kelime.charAt(CountStr-1));
			CountStr--;
			
			
//			StringBuilder sbl = new StringBuilder(kelime);
//			String ters = sbl.reverse().toString();
//			System.out.println(ters);
			
			scan.close();
		}
		
	}

}
