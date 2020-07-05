package day14dowhileloop;

import java.util.Scanner;

public class Day14Odev06 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları do-while loop kullanarak çözünüz.
		// Kullanıcıdan bir String alın 
		// ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdırın.
		// “a” harfi yoksa tekrar bir String girmesini isteyin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime yazınız");
		
		String wort;
		
		do {
			wort=scan.next();
			if(!(wort.contains("a"))) {
				System.out.println("Yeni bir kelime daha yazınız");
			}
		}while(!(wort.contains("a")));
		System.out.println("Simetrik");
		scan.close();

	}

}
