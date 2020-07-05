package day06Odev;

import java.util.Scanner;

public class Odev0601 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir tamsayı alın eğer tamsayı 3 ile bölünebiliyorsa ekrana “3’ün katı” yazdırın.
		// 3 ile bölünemiyorsa ekrana “3’ün katı değildir” yazdırın.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num1=scan.nextInt();
		
		if(num1%3==0) {
			System.out.println(num1+" Sayısı üçün katıdır");
		}else {
			System.out.println(num1+" Sayısı üçün katı değildir");
		}
		
		scan.close();
		
	}

}
