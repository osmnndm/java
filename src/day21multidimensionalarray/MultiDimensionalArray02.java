package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		
		// Multi Dimensional Array Oluşturup Değer Atama 2.Yöntemi
		
		int arr[][]= {{1,2},{3}, {4,5,6} } ;
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[0][1]+arr[1][0]+arr[2][2]); // 2+3+6=11
		
		
		// arr arrayindeki tüm elemanların toplamını veren programı yazınız.
		// arr.length bize iç içe kaç tane array olduğunun sayısını veriyor.(ilk index parantez )
		// arr[i].length ikinci index parantezinin uzunluğu için
		
		int sum=0;
		
		for(int i=0; i<arr.length;i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				sum=sum + arr[i][j];
			}
		}
		
		System.out.println("Tüm elemanların toplamı: "+sum);
	}

}
