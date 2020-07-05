package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu03 {
	
	public static void main(String[] args) {
		
		// Kullanıcıdan alınan String kümesi içerisinde aranan
		// Stringi bulan java kodunu yazınız
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String str = scan.nextLine();
		
		System.out.println("Aranacak kelimeyi giriniz");
		String strbul = scan.nextLine();
		
		System.out.println(str.contains(strbul));
		
		scan.close();
		
	}

}
