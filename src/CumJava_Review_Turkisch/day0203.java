package CumJava_Review_Turkisch;

import java.util.Scanner;

public class day0203 {

	public static void main(String[] args) {
		
		// / Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		Scanner scan=new Scanner(System.in);
		String PM,AM;
		int saat, dak,san;
		System.out.println("Lütfen saati 24 saat dilimi olarak giriniz");
		saat=scan.nextInt();
		System.out.println("Lütfen dakikayı giriniz");
		dak=scan.nextInt();
		System.out.println("Lütfen saniyeyi giriniz");
		san=scan.nextInt();
		
		String ampm=(saat>12 && saat<=23)? "am":"pm";
		
		
		System.out.println("SAAT: "+saat+" :" +dak+ ": "+san+" :"+ ampm);
		
		
	}

}
