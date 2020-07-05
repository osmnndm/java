package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan iki sayı alınız.
		// küçük sayıyı ekrana yazdırınız
		
		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayı giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		int result=num1>=num2 ? num2 : num1;
		System.out.println(result);
	
		
		scan.close();
		
		
	}

}
