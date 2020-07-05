package areplitarray;

public class ArraySorular09 {
	
	public static void main(String[] args) {
		
//		Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
//
//		Array: [1,2,3,4,5,6,7,8,9]
//
//		Beklenen Çıktı:
//
//		Tek Sayilar: 5
//		Cift Sayilar: 4
		
		
		Integer arr[] = {1,2,3,4,5,6,7,8,9};
		int tek = 0;
		int çift = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				çift++;
			}else {
				tek++;
			}
		}
		
		System.out.println("Tek Sayilar: "+ tek);
		System.out.println("Cift Sayilar: "+ çift);
		
	}

}
