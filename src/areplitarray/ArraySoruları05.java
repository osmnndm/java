package areplitarray;

import java.util.Scanner;

public class ArraySoruları05 {
	
	public static void main(String[] args) {
		
//		yazılan değerin array içerisinde arayan Java Kodu yazınız.
//
//		Array: [1551,1223,1443,1267,1789,1023,2020]
//
//
//		Aranan Değer:2020
//		Beklenen Çıktı:True
//
//		Aranan Değer:2010
//		Beklenen Çıktı :False
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = scan.nextInt();
		
		Integer arr[] = {1551,1223,1443,1267,1789,1023,2020};
		int kon = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(sayi==arr[i]) {
				kon++;
		}
		}
			
			String result = kon>0 ? "True" :"False";
			System.out.println(result);
		
		
		scan.close();
	}

}
