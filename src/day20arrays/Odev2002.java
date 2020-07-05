package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev2002 {

	public static void main(String[] args) {
		
		// Soru:
//		Kullanıcıya kaç elemanlı bir array gireceğini sorun.
//		Kullanıcıdan array’in elemanlarını girmesini isteyin.
//		a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin.
//		b) Bu arayın tum elemanlarını tersten yazdırın.
//		Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kaç elemanlı bir Array oluşturmak istiyorsunuz");
		int length=scan.nextInt();
		int arr[]=new int[length];
		
		System.out.println("Lütfen array elemanlarını yazınız");
		for (int i = 0; i < length; i++) {
			arr[i]=scan.nextInt();			
		}
		
		Arrays.sort(arr);
		System.out.println("Array içinde aramak istediğiniz karakteri giriniz");
		int j=scan.nextInt();
		
		if(Arrays.binarySearch(arr, j)>=0) {
			System.out.println("istediğiniz karakter Array içinde mevcut");
		}else {
			System.out.println("istediğiniz karakter Array içinde mevcut değil");
		}
		
		int arr2[]=new int[length];
		for (int i = length-1; i >= 0; i--) {
			arr2[(length-i)-1]=arr[i];
		}
		
		System.out.println("ilk girdiğiniz Array elemanları     :"+ Arrays.toString(arr));
		System.out.println("Array elemanlarının tersten yazılımı: "+ Arrays.toString(arr2));
		
	scan.close();

	}

}
