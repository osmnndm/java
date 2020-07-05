package day06Odev;

import java.util.Scanner;

public class Odev0604 {

	public static void main(String[] args) {
		
		// Kullanıcıdan iki sayı alın eğer sayıların işaretleri aynı ise ekrana “Aynı işaretli” yazdırın.
		// Sayıların işaretleri farklı ise ekrana “Farklı işaretli” yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("iki tam sayı giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		if(num1>=0 && num2>=0){
			System.out.println("\"Aynı işaretli\"");
		}else if(num1<0 && num2<0){
			System.out.println("\"Aynı işaretli\"");
		}else {
			System.out.println("\"Farklı işaretli\"");
		}
		scan.close();
	}

}
