package day15methodcreation;

import java.util.Scanner;

public class Day15Odev04 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.
		// Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.
		// Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		
		String sekil="";
		alanCevre(sekil);
		
		
		}
	public static void alanCevre(String sekil) {
		
		double a,b,c,h,sAlan,sCevre;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Alan ve çevresini hesaplamak istediğiniz şekli seçiniz.");
		System.out.println("Paralel kenar için: P");
		System.out.println("Dikdörtgen için: D");
		System.out.println("Üçgen için: U  yazınız.");
		
		sekil=scan.next().toLowerCase();
		
		
		switch (sekil) {
		
		case "p":
			
			System.out.println("Paralelkenarın taban uzunluğunu (a) giriniz :");
			a=scan.nextDouble();
			System.out.println("Paralelkenarın kısa kenar uzunluğunu(b) giriniz : ");
			b=scan.nextDouble();
			System.out.println("Paralelkenarın yüksekliğini(c) giriniz :");
			c=scan.nextDouble();
			
			sAlan=b*c;
			sCevre=2*a+2*b;
			
			System.out.println("Paralelkenarın alanı :"+sAlan+" cm2");
			System.out.println("Paralelkenarın çevresi :"+sCevre+ " cm");
			
			break;
			
		case "d":
			System.out.println("Dikdörtgenin a kenar uzunluğunu giriniz :");
			a=scan.nextDouble();
			System.out.println("Dikdörtgenin b kenar uzunluğunu giriniz : ");
			b=scan.nextDouble();
			
			sAlan=a*b;
			sCevre=2*a+2*b;
			
			System.out.println("Dikdörtgenin alanı :"+sAlan+" cm2");
			System.out.println("Dikdörtgenin çevresi :"+sCevre+ " cm");
			
			break;
			
		case "u":
			
			System.out.println("Üçgenin a taban uzunluğunu giriniz :");
			a=scan.nextDouble();
			System.out.println("Üçgenin b kenarının uzunluğunu girin : ");
			b=scan.nextDouble();
			System.out.println("Üçgenin c kenarının uzunluğunu girin :");
			c=scan.nextDouble();
			System.out.println("Üçgenin h yüksekliğini giriniz  :");
			h=scan.nextDouble();
			
			sAlan=a*h/2;
			sCevre=a+b+c;
			
			System.out.println("Üçgenin alanı :"+sAlan+" cm2");
			System.out.println("Üçgenin çevresi :"+sCevre+ " cm");
			
			break;
			
			default:
				System.out.println("Yanlış karakter girdiniz tekrar deneyiniz");
			
		scan.close();
		
		}
		
	}

}
