package day06Odev;

import java.util.Scanner;

public class Odev0609 {

	public static void main(String[] args) {
		// Kullanıcıdan bir tamsayı alın eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
		// 0 ise ekrana “Nötr” yazdırın. 0 dan büyük ise ekrana “Pozitif” yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num1=scan.nextInt();
		
		if(num1<0) {
			System.out.println("Sayı negatiftir.");
		}else if(num1==0) {
			System.out.println("Sayı nötrdür.");
		}else {
			System.out.println("Sayı Pozitiftir");
		}
			
		scan.close();
	}

}
