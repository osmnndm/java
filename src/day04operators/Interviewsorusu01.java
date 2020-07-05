package day04operators;

import java.util.Scanner;

public class Interviewsorusu01 {

	public static void main(String[] args) {
		
		// iki tane variable ın değerlerini yer değiştiriniz.
		// sayi1=12, sayi2=30 == sayi1=30, sayi2=12  
		// bu işleme swap denir, yer değiştirme.
	
		
		// 1.YOL
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yerlerini değiştirmek için iki sayı giriniz");
		double sayi1=scan.nextDouble(); // 12.0
		double sayi2=scan.nextDouble(); // 30.0
		
		System.out.println("Yer değiştirmeden önce");
		double gecici=0.0;
		gecici=sayi1;  // Variable oluştururken data tip sadece bir kere yazılır. 
		               // ikinci kez yazarsanız altta kırmızı çizgi çıkar.

		sayi1=sayi2;
		sayi2=gecici;
		
		System.out.println("Yer değiştirdikten sonra");
		System.out.println(sayi1); // 30.0
		System.out.println(sayi2); // 12.0
		
		
		// 2.YOL
		// SAYILARIN YERİNİ DEĞİŞTİR AMA GEÇİCİ VARİABLE KULLANMA
		
		System.out.println("YER DEĞİŞTİRMEK İÇİN İKİ SAYI DAHA GİRİNİZ");
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		sayi3=sayi3+sayi4;
		sayi4=sayi3-sayi4;
		sayi3=sayi3-sayi4;
		
		System.out.println("Yer değiştirdikten sonra");
		System.out.println(sayi3); // 30.0
		System.out.println(sayi4); // 12.0
		
		scan.close();	
		}

}
