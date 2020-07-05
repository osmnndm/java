package areplitGiris;

import java.util.Scanner;

public class ReplitGiris02 {

	public static void main(String[] args) {
		
//		İki tamsayının toplamasını yapabilen Java Kodunu yazınız.
//
//		Test:
//		15 + 10
//
//		Örnek Çıktı:
//		25
		
		Scanner input = new Scanner (System.in);
	    int num1 = input.nextInt();
	    int num2 = input.nextInt();
	    
	    // Write your code here
	    System.out.println(num1+num2);
input.close();
	}

}
