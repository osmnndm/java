package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu09 {
	
	// Girilen Stirng değer içinde istenen indexten karakteri bulan java kodunu yazınız.
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String str = scan.nextLine();
		
		System.out.println("Lütfen bir index numarasını giriniz");
		int i = scan.nextInt();
		
		int index = str.charAt(i);
		
		System.out.println(i + "." + "index karekteri: " + (char)index );

		scan.close();
	}

}
