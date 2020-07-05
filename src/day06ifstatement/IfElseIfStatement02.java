package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan sınav notunu tam sayı olarak girmesini isteyin
		// Negatif girerse ekrana yanlış değer girdiniz yazdırın
		// 0 dan büyük eşit ve 50 den küçük girerse ekrana kaldınız
		// 50 den büyük eşit ve 80 den küçük ise ekrana geçtiniz yazdırın
		// 80 den büyük ve eşit 100 den küçük ise ekrana tebrikler yazdırın
		// 100 den büyük değer girerse ekrana yanlış değer girdiniz yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println(("Notunuzu tam sayı olarak giriniz"));
		int not=scan.nextInt();
		
		if(not<0) {
			System.out.println("Yanlış değer girdiniz");
		}else if(not>100) {
			System.out.println("Yanlış değer girdiniz");
		}else if (not<50) {
			System.out.println("Kaldınız");
		}else if(not<80) {
			System.out.println("Geçtiniz");
		}else {
			System.out.println("Tebrikler");
		}
		scan.close();

	}

}
