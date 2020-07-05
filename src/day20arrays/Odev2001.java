package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev2001 {

	public static void main(String[] args) {
		
		// Soru:
//		Kullanıcıya kaç elemanlı bir array gireceğini sorun.
//		Kullanıcıdan array’in elemanlarını girmesini isteyin.
//		a) Bu array’in tum elemanlarını ekrana yazdırın.
//		b) Bu arayın son elemanını ilk eleman yapın ve tum elemanlarını ekrana yazdırın.
//		Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdırın
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kaç elemanlı bir Array oluşturmak istiyorsunuz");
		int length=scan.nextInt();
		int arr[]=new int[length];
		
		System.out.println("Lütfen array elemanlarını yazınız");
		for (int i = 0; i < length; i++) {
			arr[i]=scan.nextInt();			
		}
		
		System.out.print("Arrayin tüm elemanları :"+Arrays.toString(arr));
		
scan.close();
	}

}
