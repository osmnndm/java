package day15methodcreation;

import java.util.Scanner;

public class Day15Odev03 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.
		// Kullanıcıya sayı girmesini söyleyin. 
		// Kullanıcının girdiği sayının rakamları toplamını ekrana yazdıran bir program yazın.
		
		int num=0;
		rakamToplami(num);

	}
	public static void rakamToplami(int num) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		num=scan.nextInt();
		int sum=0;
	
		
		while(num>0) {
			int bas=num%10;
			sum=sum+bas;
			num=num/10;
		}
		System.out.println("Sayının rakamları toplamı="+sum);
		scan.close();
	}

}
