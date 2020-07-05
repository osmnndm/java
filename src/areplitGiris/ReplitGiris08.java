package areplitGiris;

import java.util.Scanner;

public class ReplitGiris08 {

	public static void main(String[] args) {
		
//		Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
//
//		Test Data
//		34
//		Beklenen Çıktı
//		7
		
		Scanner input = new Scanner(System.in);
       
        long n = input.nextLong();
        System.out.println("Sayı Değerleri Toplama: " + sumDigits(n));
        input.close();
    }

      public static long sumDigits(long n) {
      int length=0;
      int a=(int)n;
      while(a!=0){
        a=a/10;
        ++length;
      }
       
        long sum=0;
        for(int i=1;i<=length;i++){
          int bas=(int)(n%10);
          n=n/10;
          sum=sum+bas;
        }
		return sum;
		
      }
      }
