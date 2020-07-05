package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopinterview03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir sayı alın
		// bu sayının tersini ekrana yazdırın
		// bu sayının tersinin iki fazlasını ekrana yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		
		String num=scan.nextLine();
		String ters="";
	
		for(int i=num.length()-1; i>=0;i--) {
			ters=ters+num.charAt(i)+""; //char'i String'e cevirmek icin sonuna + "" ekleyebilirsiniz

		
		}	
		int tersInt=Integer.valueOf(ters)+2;
		System.out.println(tersInt); 
scan.close();

	}

}
