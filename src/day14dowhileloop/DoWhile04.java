package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// Kullanıcıdan bir String alın
		// bu stringin indexi tek sayı olan karakterlerini ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kel=scan.next();
		
		int length=kel.length();
		int i=1;
		
		do {
			if(i%2==1) {
				System.out.print(kel.charAt(i)+" ");
			}
			i++;
		}while(i<length);
		scan.close();
	}

}
