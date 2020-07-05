package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// Bir integer Array'in elemanlarını küçükten büyüğe diziniz 
		// ve ekrana iki durumuda yazdırınız
		
//		String arr[]= {"Ali","Veli","Deniz"};
		int arr[]= {2,11,0,23,7};
		System.out.println("Sıralamadan önce: "+ Arrays.toString(arr));
		
		// Arrays.sort() methoduna parametre olarak array'in ismi yazılırsa
		// o Array'in elemanlarını küçükten büyüğe sıralanmış olur.
		
		Arrays.sort(arr);
		System.out.println("Sıralamadan sonra: "+ Arrays.toString(arr));
		
		// char'lardan oluşan bir array oluşturunuz ve "ascending order" yapınız.
		
		char arrCh[]= {'a','c','x','j'};
		
		System.out.println("Sıralamadan önce: "+ Arrays.toString(arrCh));
		
		Arrays.sort(arrCh);
		System.out.println("Sıralamadan sonra: "+ Arrays.toString(arrCh));
		
		// charlar sıralanırken java ASCII kodlarını kullanır.
		// büyük harflerin ASCII kodları küçük harflerden küçüktür.
		// bu nedenle büyük harfler öne geçer.
		// java rakamların ASCII kodunu o rakamın değeri gibi düşünür ve bu harflerden küçüktür,
		
		
		
		// Soru: String'lerden oluşan bir array oluşturun ve ascending order yapın
		
		
		String arrSt[]= {"can","Ali","Veli","Deniz","ahmet","9"};
		
		System.out.println("Sıralamadan önce: "+ Arrays.toString(arrSt));
		
		Arrays.sort(arrSt);
		System.out.println("Sıralamadan önce: "+ Arrays.toString(arrSt));
		
		// Soru: boolean bir array oluşturun. ascending order(küçükten büyüğe sıralayın)oluşturun.
		// booleanlar için sort methodu kullanılamaz.
		
		 boolean arrBl[]= {true,false,false};
		
		System.out.println("Sıralamadan önce"+ Arrays.toString(arrBl));
		
	}

}
