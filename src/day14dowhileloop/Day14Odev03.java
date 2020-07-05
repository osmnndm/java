package day14dowhileloop;

import java.util.Scanner;

public class Day14Odev03 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları do-while loop kullanarak çözünüz.
		// Kullanıcıya sayı girmesini söyleyin. 
		// Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu
		// tüm sayıların toplamını yazdırınız.
		// Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Toplamasını istediğiniz sayıları teker teker giriniz.");
		System.out.println("Toplam sonucu istediğinizde en son \"0\" yazınız");
		
		int num;
		int sum=0;
		do {
			System.out.println("Bir sayı giriniz: ");
			num=scan.nextInt();
			sum=sum+num;
		}while(num!=0);
		
		System.out.println("Girilen sayıların toplamı: "+sum);
		scan.close();
	}

}
