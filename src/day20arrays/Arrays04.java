package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		
		// Bir array'in içinde belli bir elemanın var olup olmadığını kontrol ediniz.
		// binarySearch (ikili araştırma demek) bu iş için kullanılır.
		// binarySearch() methodu aranan eleman var olduğunda o elemanın indexini return eder.
		// Önemi Not: binarySearch methodunu kullanmadan önce sort() methodunu kullanmak zorundasınız
		// aksi takdirde binarySearch methodu manalı bir sonuç vermez,verdiği sonuc güvenilir olmaz.
		
		int arr[]= {1,12,12,8,2,4,3};
		
		// yukarıda verilen array'de 3 sayısı eleman olarak var mı?
		
		Arrays.sort(arr);
		Arrays.binarySearch(arr, 3); 
		
		System.out.println(Arrays.binarySearch(arr, 3)); // 2
		// sonuc 2 yazar. önce sıralama yapar sonra bize indexi döndürür.
        //çünkü binary yapıyor bize sayılar döndürecek.
		
		System.out.println(Arrays.binarySearch(arr, 12)); // 5
		// aynı elemandan birden fazla olduğunda ilkinin indexini verir. 
		// elemanı bulduktan sonra break yapar.
		
		System.out.println(Arrays.binarySearch(arr, 5)); //-5
		// binarySearch() methodu olmayan elemanlar için negatif sayılar return eder
		// negatif olması o elemanın arrayde olmadığı anlamına gelir
		// -4 o eleman olsaydı kaçıncı eleman olduğu anlamındadir.
		// {1,2,3,4,18,12,12} var olsaydı 4 ten hemen sonra olurdu buda 5.eleman demektir.
	}

}
