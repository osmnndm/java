package day19arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		// elemanları 1,2,3,4,5 bir int array oluşturunuz
		// bu arrayde 3 elemanının olup olmadığını kontrol ediniz.
		// 3 varsa ekrana "3 var" yazdırın.
		// 3 yoksa "3 yok " yazdırın.
		
		
		// Array oluşturup eleman eklemek için 1.YOL
		
		//		int arr[]=new int[5];
		//		arr[0]=1;
		//		arr[1]=2;
		//		arr[2]=3;
		//		arr[3]=4;
		//		arr[4]=5;
		
		// Array oluşturup eleman eklemek için 2. YOL
//		
		int arr[]= {1,2,3,4,5};
		
		int count=0; // flag(bayrak) denir.
		
		for (int i=0; i<5;i++) {
			if(arr[i]==3) {
				count++;
		}
		}
	
	if(count>0) {
		System.out.println("3 var");
	}else {
		System.out.println("3 yok");
	}
		
//		int arr1[]= {1,2,3};
//		int arr2[]= {1,2,3};
//		
//		if(arr1==arr2) {
//			System.out.println("same");
//		}else {
//			System.out.println("Not same"); // not same yazacaktır çünkü index karşılaştırması olmazsa 
//											// adres karşılaştırması yapar buda aynı sonucu vermez
		}
		
		
		
	}

