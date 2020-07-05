package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir tam sayı isteyin ve o tam sayının mutlak değerini ekrana yazdırın.
		// mutlak değer bir sayının kendi işareti ile çarpılması demektir.
		// -3 un mutlak değeri 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num=scan.nextInt();
		
		if(num>=0) {
			System.out.println(num);
		}else {
			System.out.println(num*-1);
		}
		scan.close();
		
	}

}
