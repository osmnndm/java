package areplitarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorular06 {
	
	public static void main(String[] args) {
		
//		Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
//
//		Array: [12,15,43,23,56,76,78,90,77,43]
//
//		Aranan değer:56
//
//		Beklenen Çıktı:
//		56 sayısı arrayin 4. elemanı
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = scan.nextInt();
		
		Integer arr[] = {12,15,43,23,56,76,78,90,77,43};
		Arrays.sort(arr);
	
		System.out.println(Arrays.binarySearch(arr, sayi));
		
		scan.close();
	}

}
