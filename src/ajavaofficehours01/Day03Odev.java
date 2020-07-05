package ajavaofficehours01;

import java.util.Scanner;

public class Day03Odev {

	public static void main(String[] args) {
		
		// kullanıcıdan alacağımız 2 pozifif tam sayının en büyük ortak bölenini bulalım.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 1. pozitif tam sayıyı giriniz");
		
		int num1=scan.nextInt();
		System.out.println("Lütfen 2. pozitif tam sayıyı giriniz");
		int num2=scan.nextInt();
		
		int obeb=0;
		for (int i=1;i<=num1 && i<=num2; i++) {
			if(num1%i==0 && num2%i==0) {
				obeb=i;
			}
		}System.out.println(num1+" ve "+num2+" ortak böleni: "+obeb);
		scan.close();
	}

}
