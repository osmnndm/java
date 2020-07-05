package day07nestedif;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf girmesini isteyin.
		// Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
		// “a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
		// Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
		// “Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		// ASCII TABLE a-z==> 97-122 A-B==> 65-90
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char harf=scan.next().charAt(0);
		
		if(harf>=97 && harf<=122) {
			if(harf==97) {
				System.out.println("İlk küçük harf");
			}else if(harf!=97){
				System.out.println(harf+ " harfi bir küçük harftir.");
			}}
		if(harf>=65 && harf<=90) { 
			if(harf==90) {
			System.out.println("Z harfi son büyük harftir");
		}else if(harf!=90) {
			System.out.println(harf+" harfi bir büyük harftir.");
		}}
		scan.close();
			
		
}
}
