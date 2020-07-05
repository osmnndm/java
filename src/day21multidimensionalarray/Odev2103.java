package day21multidimensionalarray;

public class Odev2103 {

	public static void main(String[] args) {
		
		// Aşağıdaki multi dimensional array’lerin iç array’lerinde 
		// aynı index’e sahip elemanların toplamını ekrana yazdıran bir program yazınız
		// arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		
		int arr1[][]= { {1,2}, {3,4,5}, {6} }; 
		int arr2 [][]= { {7,8,9}, {10,11}, {12} };
		
	
		int leng1=arr1.length;
		int leng2=arr2.length;
		int lengi;
		if (leng1<=leng2) {
			lengi=leng1;
		}else {
			lengi=leng2;
		}
		
		for (int i = 0; i < lengi; i++) {
			
			int lengj;
			if (arr1[i].length<=arr2[i].length) {
				lengj=arr1[i].length;
			}else {
				lengj=arr2[i].length;
			}
			
			for (int j = 0; j < lengj; j++) {
				
			System.out.print("arr1"+"["+i+"]"+"["+j+"]"+"+"+"arr2"+"["+i+"]"+"["+j+"]"+ "="+" ");
			System.out.println(arr1[i][j]+arr2[i][j]);
			
			}
		}
		
		
	}

}
