package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		// Array'lerde lenght sabittir, değiştirilemez.
		// ArrayListler'de (List) length esnektir. Siz eleman ekledikçe List 
		// Length'ini artırır.
		// Siz eleman sildikçe List length'ini azaltır.
		// hem List hem de ArrayList üzerine gelip java.util olarak import yapıyoruz.
		// List<String> list = new List<>(); OLMAZ
		// ArrayList<String> list = new List<>(); OLMAZ
		// ArrayList<String> list = new ArrayList<>(); OLABİLİR
		// List<String> list = new ArrayList<String>(); OLABİLİR
		// List<String> list = new ArrayList<>(); GENEL KULLANIM ŞEKLİ
		// List'e eleman eklemek için add() methodu kullanılır.
		
		
		List<String> list01 = new ArrayList<>();
		System.out.println(list01); // []
		
		list01.add("Ali");
		
		System.out.println(list01); // []
									//[Ali]
		
		// Veliyi araya ekleme
		list01.add("Can");
		list01.add(1, "Veli");
		System.out.println(list01); // [Ali, Veli, Can]
		
		
		// list01'i [Han, Ali, Kemal, Veli, Can, Aysel] şekline getirin.
		
		
		list01.add(0, "Han");
		list01.add(2, "Kemal");
		list01.add(5, "Aysel");
		System.out.println(list01);
		
		System.out.println("Eleman sayısı: "+ list01.size()); // 6
		

	}

}
