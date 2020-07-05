package day22arrayList;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		// For Each Loop, for loop'un üst versiyonudur.
		// Diğer adı "Enhanced(Zenginleştirilmiş) For Loop"
		// mümkün olduğunca For Loop yerine bundan sonra bunu kullanacağız.
		
		int arr[]= {12, 21, 13, 43};
//		for llop kullanarak elemanları ekrana yazdır.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		System.out.println("=======");
//		for each loop kullanarak elemanları ekrana yazdır.
		
		for(int w:arr) {   // w 0.indexten başlayıp son indexe kadar uygular.
			System.out.print(w);
		}
		
		System.out.println();
		System.out.println("=======");
		
//		String içeren bir array oluşturun. Elemanlarını yanyana aralarına boşluk koyarak
//		For Each Loop ile ekrana yazdırınız.
		
		
		String arr1[]= {"for","each","kullan"};
		for(String w:arr1) {
			System.out.print(w+" ");
		}
		
		System.out.println();
		System.out.println("=======");
		
//		Integer elemanlar içeren bir list oluşturun
//		for each loop kullanarak bu elemanların toplamını ekrana yazdırın.
		
		List<Integer> list =new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		
		int sum=0;
		
		for(int w:list) {
			sum=sum+w;
		}
		System.out.println("elemanlar toplamı= "+sum);
		
		System.out.println();
		System.out.println("=======");
		
//		{{1, 2}, {5}, {6, 7, 8}} arrayindeki tüm elemanların toplamını bulunuz.
		
		int arr2[][]={{1, 2}, {5}, {6, 7, 8}};
		int sum1=0;
		
		for(int[] w:arr2) {
			for(int z: w) {
			sum1=sum1+z;
			}
		}
		System.out.println(sum1);
		
	}

}
