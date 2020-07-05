package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu04 {
	
	public static void main(String[] args) {
		
		// Kullanıcıdan alınan Stringin son karakterini silip ekrana yazan Java kodunu yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String str = scan.nextLine();
		
		int index = str.length()-1;
		System.out.println(str.substring(0, index));
		
		scan.close();
	}

}
