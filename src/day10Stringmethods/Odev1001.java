package day10Stringmethods;

import java.util.Scanner;

public class Odev1001 {

	public static void main(String[] args) {
		
		// Kullanıcıdan kredi kartı numarasını alın 
		// ve bu numaranın üçüncü, dördüncü ve sonuncu rakamlarını ekrana yazdırın.
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen kredi kart numaranızı giriniz");
		String num1=scan.next();
		
		System.out.println("Kartın üçüncü rakamı: "+num1.charAt(4));
		System.out.println("Kartın dördüncü rakamı: "+num1.charAt(5));
		System.out.println("Kartın son rakamı: "+num1.charAt(num1.length()-1));
		scan.close();

	}

}
