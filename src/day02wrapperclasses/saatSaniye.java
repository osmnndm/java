package day02wrapperclasses;

import java.util.Scanner;

public class saatSaniye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("SAATİ SANİYEYE ÇEVRİME");
		System.out.println("Lütfen saat sayısını giriniz");
		long saat=scan.nextLong();
		System.out.print( saat   );
		System.out.print(" Saat = ");
		System.out.print(saat*3600);
		System.out.println("  saniyedir.");
		
		scan.close();
		
	}

}
