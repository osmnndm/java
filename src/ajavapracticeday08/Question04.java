package ajavapracticeday08;

import java.util.Scanner;

public class Question04 {
	
	public static void main(String[] args) {
		
		/* 1. Kullanıcının girdiği sayının, for döngüsü kullanarak rakamları 
		 * toplamını bulan method yazınız.
		 * 
		 * 1. Adım : Kullanıcıdan sayı al.
		 * 2. Adım : Sayıyı String'e çevirin.
		 * 3. Adım : String'in her elemanını sayıya çevir ve toplama ekle
		 * 
		 * Bunu method kullanarak yapalım methodumuz toplamı return etsin.
		 * Method ismi : public static int getRakamlarToplami(int sayi)
		 * 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir rakam giriniz");
		int rakam = scan.nextInt();
		System.out.println("ilk method: " + rakTop(rakam));
		
		System.out.println("ikinci method: "+ getRakamlarToplami(rakam));
		
		scan.close();
		
	}
	
	public static int rakTop (int rakam) {
		
		int sum = 0;
		
		while (rakam>0) {
			int rakam1 = rakam%10;
			rakam = rakam/10;
			sum = sum+rakam1;
			
		}
		return sum;
	}
	
	// Diğer bir yol
	
	public static int getRakamlarToplami(int rakam) {
		String sayininStringi = String.valueOf(rakam);
		int toplam = 0;
		
		for(int i = 0;  i<sayininStringi.length(); i++) {
		 int sayiyaCevir = Integer.parseInt(sayininStringi.substring(i, i+1));
		 toplam += sayiyaCevir;
		}
		return toplam;
	}

}
