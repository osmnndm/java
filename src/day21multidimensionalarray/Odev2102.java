package day21multidimensionalarray;

import java.util.Arrays;

public class Odev2102 {

	public static void main(String[] args) {
		
		// Aşağıdaki multi dimensional array’in 
		// iç array’lerindeki son elemanların çarpımını ekrana yazdıran
		// bir program yazınız { {1,2,3}, {4,5}, {6} }
		
		int arr[][]= { {1,2,3}, {4,5}, {6} };
		int mult=1;
		
		for (int i = 0; i < arr.length; i++) {
			mult=mult*arr[i][(arr[i].length)-1];
		}
		System.out.println(Arrays.deepToString(arr)+" Array'inin son elemanları çarpımı= "+mult);
		
	}

}
