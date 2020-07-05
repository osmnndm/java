package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu02 {
	
	public static void main(String[] args) {
		
		// 2.farklı Stringi uç uca ekleyen Java kodunu yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime1 = scan.nextLine();
		System.out.println("ikinci kelimeyi giriniz");
		String kelime2 = scan.nextLine();
		
		String str =kelime1.concat(kelime2);
		System.out.println(str);
		scan.close();
	}

}
