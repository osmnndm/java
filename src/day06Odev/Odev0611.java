package day06Odev;

import java.util.Scanner;

public class Odev0611 {

	public static void main(String[] args) {
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		// 1. 50 den az - D 
		// 2. 50(dahil) ile 60 arası - C 
		// 3. 60(dahil) ile 80 arası - B. 
		// 4. 80(dahil) ustu- A
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen notunuzu giriniz:");
		double not1=scan.nextDouble();
		
		if(not1<0 && not1>100) {
			System.out.println("yanlış not girdiniz tekrar giriniz");
		}else if(not1>=0 && not1<50) {
			System.out.println("D");
		}else if(not1>=50 && not1<60) {
			System.out.println("C");
		}else if(not1>=60 && not1<80) {
			System.out.println("B");
		}else if(not1>=80 && not1<=100) {
			System.out.println("A");

	}
		scan.close();
	}
}
