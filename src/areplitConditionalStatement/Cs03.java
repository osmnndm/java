package areplitConditionalStatement;

import java.util.Scanner;

public class Cs03 {

	public static void main(String[] args) {
		
//		Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.
//
//		Test Data:
//		12
//		34
//		23
//
//		Beklenen Çıktı:
//		En Buyuk Sayi: 34
		
		Scanner in = new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		 int num1 = in.nextInt();
		System.out.println("İkinci bir tam sayı giriniz");
		 int num2 = in.nextInt();
		System.out.println("Üçüncü bir tam sayı giriniz");   
		   int num3 = in.nextInt();
		   
		   int buy=0;
		   
		    if(num1>num2){
		      if(num1>num3){
		       buy=num1;
		      }
		       if (num2>num3){
		       buy=num2;
		    }
		      }
		    else {
		     buy=num3;
		    }
		      System.out.println("En Buyuk Sayi: "+ buy);
		  in.close();
		
	}

}
