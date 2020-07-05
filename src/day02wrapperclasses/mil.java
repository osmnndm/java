package day02wrapperclasses;

import java.util.Scanner;

public class mil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("MİL'İ KM'YE ÇEVİRME");
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("MİL DEĞERİNİ GİRİNİZ");
		double mil=scan.nextDouble();
		System.out.print(mil );
		System.out.print( "mil = ");
		System.out.print(mil*1.6);
		System.out.println("km");
		
scan.close();
	}

}
