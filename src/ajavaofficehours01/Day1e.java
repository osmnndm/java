package ajavaofficehours01;

import java.util.Scanner;

public class Day1e {

	public static void main(String[] args) {
		
		// kullanıcıdan rakam alalım ve bu rakamın çarpım tablosunu ekrana yazdıralım.
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Çarpım tablosunu istdeğiniz bir rakam giriniz");
//		int num=scan.nextInt();
//		int son;
//		for (int i = 1; i < 11; i++) {
//			son=i*num;
//			System.out.println(i+"X"+num+"="+son);
//		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Çarpım tablosunu ");
		System.out.println();
		
		for (int i = 2; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				int son=i*j;
				System.out.println(i+" X "+j+" = "+son);
			}
			System.out.println();
			scan.close();
		}
			
			
		

	}

}
