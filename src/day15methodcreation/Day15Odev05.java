package day15methodcreation;

import java.util.Scanner;

public class Day15Odev05 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.
		// Kullanıcıya bir String girmesini söyleyin 
		// ve bu String’i yukarıdan aşağıya doğru yazdıran Program yazınız. 
		// Ornegin; CAN ==> C
		//			        A
		//			       	N

	String klm="";	
	yukAsagi(klm);
		
	}
	public static void yukAsagi(String klm) {
		
	int leng;	
	Scanner scan=new Scanner(System.in);
	System.out.println("Yukarıdan aşağıya alt alta yazılmasını istediğiniz bir kelime giriniz");
	
	klm=scan.next();
	leng=klm.length()-(1);
	
	for(int i=0; i<=leng;i++ ) {
		
		System.out.println(klm.charAt(i));
	}
	scan.close();
}
}
