package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {

		// Basit bir hesap makinasi
		// Kullanıcıdan yapacağı işlemi işlem sembolü ile seçmesini sağlayalım.
		// sonrada kullanıcıdan iki sayı girmesini isteyelim.
		// Girilen iki sayı ve seçilen işleme göre doğru sonucu ekrana yazdıralım.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\" + \" \" - \" \" * \"\" : \"  işlemlerinden birini seçiniz");
		char islem=scan.next().charAt(0);
		System.out.println("işlem yapmak için iki sayı giriniz");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		hesapMakinasi(islem,num1,num2);
		scan.close();
	}
	public static void hesapMakinasi(char islem,double num1,double num2) {
	//	case: durum  4 farklı durum var switch kullanmak makul
		
		switch(islem) {
			case'+':
				System.out.println(num1 +"+"+num2+"="+ (num1+num2));
				break;
			case'-':
				System.out.println(num1 +"-"+num2+"="+ (num1-num2));
				break;
			case'*':
				System.out.println(num1 +"*"+num2+"="+ (num1*num2));
				break;
			case':':
				System.out.println(num1 +":"+num2+"="+ (num1/num2));
				break;
				default:
					System.out.println("\"+\" \"-\" \"*\"\":\" : dışında işlem girmeyiniz");
	}
	}
}
