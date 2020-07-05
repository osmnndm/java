package day02wrapperclasses;

import java.util.Scanner;

public class prizma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Prizmanın En değerini giriniz");
		int en=scan.nextInt();
		System.out.println();
		System.out.println("Prizmanın Boy değerini giriniz");
		int boy=scan.nextInt();
		System.out.println();
		System.out.println("Prizmanın Yükseklik değerini giriniz");
		int yuk=scan.nextInt();
		
		System.out.print("Prizmanın alanı = ");
		System.out.println(en*boy*yuk);
		
		scan.close();
	}

}
