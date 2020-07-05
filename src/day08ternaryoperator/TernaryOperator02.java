package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kullanıcıdan iki sayı alın bu sayılar birbirine eşit ise
		// toplamlarını ekrana yazdırın 
		// bu sayılar birbirinden farklı ise 
		// çarpımlarını ekrana yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki sayı giriniz");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		double sonuc= num1==num2 ? (num1+num2) : (num1*num2);
		System.out.println(sonuc);
		scan.close();
		
	}

}
