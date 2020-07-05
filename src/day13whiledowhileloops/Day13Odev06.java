package day13whiledowhileloops;

import java.util.Scanner;

public class Day13Odev06 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları String methodlarını kullanarak çözünüz.
		// Kullanıcıdan bir String alın 
		// ve bu String’in icinde “a” harfi varsa 
		// “a” harfinin ilk görünümünün indexini ekrana yazdırın. 
		// “a” harfi yoksa ekrana “a harfi yok” yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir kelime giriniz: ");
		String kel=scan.next();
		kel=kel.toLowerCase();
		int index=kel.indexOf('a');
		
		
		if(index!=-1) {
			System.out.println("a harfinin indexi: "+index);
		}else {
			System.out.println("Bu kelimede a harfi bulunmamaktadır.");
		}
scan.close();
	}

}
