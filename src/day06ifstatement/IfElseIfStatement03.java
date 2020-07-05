package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan altı basamaklı bir sayıisteyin. 0 ilede başlıyabilir
		// kazanma ihtimali %20, amorti ihtimali(tekrar oynama) %30, kaybetme ihimali %50
		// olan bir jakpot oyunu için program yazınız.
		// 00000-000001-000002-.....-99998,-999999 ==> 1000000 bir milyon sayı var.
		// bir milyon ihtimalden %20 sine kazandı diyeceğiz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Altı basamaklı bir sayı giriniz. 0 başta kullanılabilir");
		int num=scan.nextInt();
		
		if(num<200000) {
			System.out.println("Kazandınız");
		}else if(num<500000) {
			System.out.println("Amorti");
		}else
			System.out.println("Kaybettiniz");
		scan.close();
		
			}

}
