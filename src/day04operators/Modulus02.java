package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		// Kullanıcının girdiği sayının ilk ve son rakamının toplamını veren program yazınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 4 rakamlı bir tam sayı giriniz");
		int sayi1=scan.nextInt();
		
		// bir tam sayının birer basamağını bulmak için sayıyı 10 a böleriz.
		
		int sonRakam=sayi1%10;
		
		// ilk rakamı bulmak için 4 basamaklı olduğu için 1000 e böleriz.
		int ilkRakam=sayi1/1000;
		
		System.out.println("Son rakam ile ilk rakamın toplamı= "+ (sonRakam+ilkRakam));
		
		scan.close();
		}

}
