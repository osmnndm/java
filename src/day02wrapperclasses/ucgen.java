package day02wrapperclasses;

import java.util.Scanner;

public class ucgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ÜÇGENİN ÇEVRESİNİ HESAPLAMA");
		Scanner scan=new Scanner(System.in);
		System.out.println("üçgenin ilk kenarını giriniz");
		byte a=scan.nextByte();
		System.out.println("üçgenin ikinci kenarını giriniz");
		byte b=scan.nextByte();
		System.out.println("üçgenin üçüncü kenarını giriniz");
		byte c=scan.nextByte();
		System.out.print("ÜÇGENİN ÇEVRESİ = ");
		System.out.println(a+b+c);
		
		scan.close();

	}

}
