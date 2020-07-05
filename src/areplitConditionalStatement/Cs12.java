package areplitConditionalStatement;

import java.util.Scanner;

public class Cs12 {
	
	public static void main(String[] args) {
		
//		Ugly Number: 
//			 
//			Girilen bir sayının  ugly number olup olmadığını kontrol etmek için 
//		bir Java programı yazın.
//
//
//			Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
//
//			Test Data:
//			13
//
//			Beklenen çıktı:
//			ugly number  degildir
//
//			Test Data:
//			25
//			Beklenen Çıktı:
//
//			ugly number 
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen bir tam sayı giriniz");
		int num = scan.nextInt();
		
		int a=0;
		while(num!=1) {
			if(num%5==0) {
				num=num/5;
			}else if(num%3==0){
				num=num/3;
			}else if(num%2==0){
				num=num/2;
			}else {
				a=1;
				break;
			}
		}
		
		String result = a==0 ? "ugly number" :"ugly number degildir";
		System.out.println(result);
		
		scan.close();
		
	}
	

	

}
