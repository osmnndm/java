package day21multidimensionalarray;

import java.util.Arrays;

public class Odev2101 {

	public static void main(String[] args) {
		
   	// Aşağıdaki multi dimensional array’in tum elemanlarının 
   // çarpımını ekrana yazdıran bir program yazınız.
  // { {1,2,3}, {4,5,6} }
		
		int arr[][]={ {1,2,3}, {4,5,6} };
		int mult=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				mult=mult*arr[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(arr)+" Sayılarının çarpımı= "+mult);
		
	}

}
