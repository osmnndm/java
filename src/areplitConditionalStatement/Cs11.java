package areplitConditionalStatement;

import java.util.Scanner;


public class Cs11 {
	
//	Kullanıcıdan bir harf girmesini isteyiniz. 
//	Girilen harf sesli ise Sesli harf olduğunu, 
//	değilse sessiz harf olduğunu ekrana yazdırsın. 
//	Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin. 
//	(Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
//
//	Sesli harfler: a,e,i,o,u
//
//	Test Data: 
//	a
//
//	Beklenen Çıktı:
//	a harfi sesli harfdir.
//
//	Test Data:
//	d
//
//	Beklenen Çıktı:
//	d harfi sesiz harftir.
//
//	Test Data: 
//	we  yada %
//
//	Beklenen Çıktı: 
//	Yanlis karakter girdiniz!

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");
		String harf = scan.next();
		char harf3 =harf.toLowerCase().charAt(0);
		
		if(!(harf3>96 && harf3 <123) || (harf.length()>1)) {
			System.out.println("Yanlis karakter girdiniz!");
		}else {
		int count =0;
		String harf2[] = {"a","e","i","o","u"}; 
		for (int i = 0; i < harf2.length; i++) {
			if(harf2[i].equalsIgnoreCase(harf)) {
				count++;
			}
		}
		if(count>0) {
		System.out.println(harf+" harfi sesli harfdir");
		}else {
		System.out.println(harf+" harfi sesiz harftir");
		}
		}
		scan.close();
	}

}
