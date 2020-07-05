package areplitGiris;

import java.util.Scanner;

public class ReplitGiris04 {

	public static void main(String[] args) {
		
//		İki sayının toplamını , çarpımını, farkını, bölümünü ve geri kalanını yazdıran  bir Java programı yazın.
//
//		Test Data:
//		Input first number: 125
//		Input second number: 24
//
//		Beklenen Sonuçlar:
//		125 + 24 = 149
//		125 - 24 = 101
//		125 x 24 = 3000
//		125 / 24 = 5
//		125 mod 24 = 5 

		Scanner in = new Scanner(System.in);
		  int num1 = in.nextInt();
		  int num2 = in.nextInt();
		  
		  // Write your code here
		  int top=num1+num2;
		  int cik=num1-num2;
		  int carp=num1*num2;
		  int bol=num1/num2;
		  int mod=num1%num2;
		  
		  System.out.println(num1+" + "+ num2 +" = "+top);
		  System.out.println(num1+" - "+num2+" = "+cik);
		  System.out.println(num1+" x "+num2+" = "+carp);
		  System.out.println(num1+" / "+num2+" = "+bol);
		  System.out.println(num1+" mod "+num2+" = "+mod);
		  
		  in.close();
	
	}

}
