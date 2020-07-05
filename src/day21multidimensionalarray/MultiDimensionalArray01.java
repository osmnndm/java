package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		
		// Multi dimensional Array oluşturma (2 boyutlu oluşturma)
		// asıl arrayin içinde 3 eleman onun içindede 4 eleman var
		
		int arr[][]=new int[3][4];
		System.out.println(Arrays.toString(arr)); // [[I@1540e19d, [I@677327b6, [I@14ae5a5]
		
		System.out.println(Arrays.deepToString(arr)); // .deepToString sonuna kadar git tüm elemanları yazdır demektir.
		// [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]] yazdırır.

		
		// DEĞER ATAMA 1.YOL
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		
		arr[1][0]=5;
		arr[1][1]=6;
		arr[1][2]=7;
		arr[1][3]=8;
		
		arr[2][0]=9;
		arr[2][1]=10;
		arr[2][2]=11;
		arr[2][3]=12;
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[1][2]);
		
		int top=arr[0][3]+arr[2][1];
		System.out.println(top);
		
	}

}
