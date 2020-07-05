package ajavapracticeday08;

import java.util.Random;
import java.util.Scanner;

public class Question02 {
	
	/*
	 * Whilde döngüsü kullanarak "sayı tahmin oyunu" yazınız. 
	 * 
	 * 1. Adım : Java ile rastgele bir sayı üretelim (new Random() kullanabilrsiniz)
	 * 2. Adım : Kullanıcıdan tahminini alalım.
	 * 3. Adım : Kullanıcının girdiği tahmini, bilgisayarın ürettiği 
	 * 			 rastgele sayı ile karşılaştıralım.
	 * 4. Adım : Cevap doğru olana kadar 2. ve 3. adımı tekrarlayalım, 
	 * 			 bunu da while döngüsü ile yapalım.
	 *
	 * */
	
	public static void main(String[] args) {
		
		
		   
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int rastgeleSayi = random.nextInt(10);
		
		int tahmin = -1;  // ilk durumda hiç bir şekilde tahmin ile random birbirine eşit olmasın
						 // eşit olursa döngü hiç çalışmayacağından oyuna giremeyecekti bu nedenle 
						 //	0-10 harici -1 gibi bir sayı girdir, 11 de yazabilirdik.
		
		   
		   while(tahmin != rastgeleSayi) {
			   System.out.println("1 ile 10 arası tahminde bulunmak için bir sayı giriniz");
			   tahmin = scan.nextInt();
			   
			   if(tahmin == rastgeleSayi) {
				   System.out.println("Tebrikler kazandınız");
			   }else {
				   System.out.println("Tekrar deneyiniz");
			   }
			   
		   }
		scan.close();
	}
	
	
	  
	

}
