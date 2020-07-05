package day15methodcreation;

import java.util.Scanner;

public class Day15Odev01 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.
		// Kullanıcıdan isim ve soyismini alın. 
		// Kullanıcının isim ve soyisminin ilk harflerini büyük
		// diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		
		String soyisim = null;
		String isim = null;
		isimYazdirma(isim,soyisim);

	}
	public static void isimYazdirma(String isim, String soyisim) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz");
		isim=scan.nextLine();
		isim=isim.toLowerCase();
		char ilk=isim.toUpperCase().charAt(0);
		
		System.out.println("Lütfen soyisiminizi giriniz");
		soyisim=scan.next();
		soyisim=soyisim.toLowerCase();
		char soyilk=soyisim.toUpperCase().charAt(0);
		
		System.out.print("İsim soyisim: ");
		
		if(isim.contains(" ")) {
			String ilkİsim=ilk+isim.substring(1,(isim.indexOf(" ")));
			String ikinciİsim=isim.substring((isim.indexOf(" "))+1).toLowerCase();
			char ilk2=ikinciİsim.toUpperCase().charAt(0);
			isim=ilkİsim+" "+ilk2+ikinciİsim.substring(1);
			System.out.print(isim);
		}else {
			System.out.print(ilk+isim.substring(1));
		}
		
		System.out.println(" "+soyilk+soyisim.substring(1));
		scan.close();
	}

}
