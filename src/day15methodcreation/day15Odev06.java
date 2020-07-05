package day15methodcreation;

import java.util.Scanner;

public class day15Odev06 {

	public static void main(String[] args) {
		
		
		// 1'den 9'a kadar rastgele atanan bir sayının kaç girişte tahmin edildiğini gösteren bir oyun yazınız.
		
		
		Scanner scan=new Scanner(System.in);
		int ran1=(int) (Math.random()*10);
		int num1=0;
		int i=1;
		
		
		System.out.println("1'den 9'a kadar Sayı tahmini oyunu");
		System.out.println("Sayımızı kaç girişte tahmin edebileceksiniz hadi deneyelim!!");
		System.out.println("1-9 arası bir sayı giriniz");
		
			
			do{
				
				num1=scan.nextInt();
				
				if(num1>9) {
					System.out.println("Yanlış sayı girdiniz tekrar deniyiniz");
					}
				if (num1==ran1) {
					System.out.println("Tebrikler!!! "+num1+" sayısını "+i+ ". denemede bildiniz.");
					i=9;
					}
				
				else if(i==9) {
					System.out.println("Maalesef "+ ran1+" sayısını bilemediniz");
					}
				
				else if(i<9) {
					System.out.println("1-9 arası bir sayı giriniz");
				}
				
					i++;
					
				
				}while(i!=10);
				
			scan.close();
			
	}

}
