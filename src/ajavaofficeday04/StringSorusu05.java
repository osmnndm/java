package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu05 {
	
	public static void main(String[] args) {
		
		// kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String str = scan.nextLine();
		
		System.out.println(str.toUpperCase());
		scan.close();
	}

}
