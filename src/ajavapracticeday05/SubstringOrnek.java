package ajavapracticeday05;

import java.util.Scanner;

public class SubstringOrnek {

	public static void main(String[] args) {
		
		// Kullanıcıdan iki ismi isteyiniz 
		// ikinci ismi ilk ismin ortasına ekleyiniz
		// mehmet ==> mehahmetmet
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String isim1 = scan.nextLine();
		System.out.println("Bir isim giriniz");
		String isim2= scan.nextLine();
		
		int length = isim1.length();
		String isim3 = isim1.substring(0,(length/2));
		String isim4 = isim1.substring((length/2),(length));
		System.out.println(isim3+isim2+isim4);
		scan.close();
	}
	
}
