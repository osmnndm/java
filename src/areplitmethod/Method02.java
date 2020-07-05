package areplitmethod;

import java.util.Scanner;

public class Method02 {
	
//	Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.
//
//	Test Data:
//	java is fun
//
//	Beklenen Çıktı:
//
//	Stringdeki sesli harf sayısı: 4
	
	static String cumle;
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		cumle = scan.nextLine();
		
		sesli(cumle);
		
		scan.close();
	}
	
	public static void sesli (String cumle) {
		
		String sesliHarf = "aeiou";
		int count=0;
		for (int i = 0; i < sesliHarf.length(); i++) {
			for (int j = 0; j < cumle.length(); j++) {
				if(cumle.charAt(j)==sesliHarf.charAt(i)) {
					count++;
				}
				
			}
			
		}
		
		System.out.println("Stringdeki sesli harf sayısı: "+count);
	}
	

}
