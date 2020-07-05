package day13whiledowhileloops;

import java.util.Scanner;

public class Day13Odev03 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları hem for loop hem de while loop kullanarak çözünüz.
		// Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız.
		// Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bölenlerini bulmak istediğiniz bir tam sayı giriniz");
		int num=scan.nextInt();
		
		if(num<0) {
			num=num*(-1);
			}
		System.out.println("For Loop ile çözüm");
		System.out.print(num+" sayısının bölenleri: ");
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("For While ile çözüm");
		System.out.print(num+" sayısının bölenleri: ");
		
		int i=1;
		while(i<=num) {
			if(num%i<=0) {
				System.out.print(i+" ");
			}
			i++;
		}
	scan.close();	

	}

}
