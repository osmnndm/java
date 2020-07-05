package day11stringsmethods;

import java.util.Scanner;

public class Day11Odev06 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş harflerini alın 
		// ve başlangıç harfinden başlayıp bitiş harfinde biten 
		// tüm harfleri büyük harf olarak ekrana yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir başlangıç harfi giriniz");
		char harf1=scan.next().toUpperCase().charAt(0);
		System.out.println("Bir bitiş harf yazınız");
		char harf2=scan.next().toUpperCase().charAt(0);
		
		System.out.println(harf1+" - "+ harf2);
		
		if(harf1>=harf2) {
			System.out.println("Başlangıç harfi bitiş harfinden alfabeye göre önce geliyor olması lazım");
			System.out.println("Lütfen yeniden giriş yapınız");
		}else if((harf1<='z' && harf1>='a') && (harf2>='a'&&harf2<='z')){
			System.out.println("lütfen harf giriniz");
		}
		else {
			
		
		for(char h=harf1 ; h<=harf2 ; h++) {
		
			System.out.print(h+" ");
		}}
		scan.close();
		

	}

}
