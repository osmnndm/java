package CumJava_Review_Turkisch;

import java.util.Scanner;

public class Zumbeispiel02 {

	public static void main(String[] args) {
		/*
		 * //Scanner ile kullanıcıdan 3 sayı girmesini isteyin ve bu sayıların toplamını yazdırınız.
		 */
		int num1,num2,num3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 3 tam sayı giriniz");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		System.out.println("Bu üç sayının toplamı = "+num1+num2+num3);
		scan.close();
		

	}

}
