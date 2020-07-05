package day12scopewhileloop;

import java.util.Scanner;

public class Day12Odev07 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir rakam alın ve bu rakam icin çarpım tablosunu ekrana yazdırın.
		// Kullanıcının hata yapmadığını farz edin.
		// Ornegin kullanıcı 3 girerse;
		// 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Çarpım tablosunu istediğiniz rakamı giriniz");
		int rak=scan.nextInt();
		
		System.out.println("For Loop ile çözüm");
		for(int i=1; i<11;i++) {
			System.out.println(rak+"x"+i+"="+rak*i);
			
		}
		System.out.println("");
		System.out.println("While Loop ile çözüm");
		
		int num=1;
		while(num<11) {
			System.out.println(rak+"x"+num+"="+rak*num);
			num++;
		}
		scan.close();
		
	}

}
