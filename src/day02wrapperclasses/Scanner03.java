package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		
	//Kullanıcıdan alınan bir sayının küpünü hesaplayan bir program yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Küpünü öğrenmek istediğiniz sayıyı giriniz");
		
		int sayi = scan.nextInt();
		System.out.println(sayi*sayi*sayi);
		
		scan.close();
	}

}
