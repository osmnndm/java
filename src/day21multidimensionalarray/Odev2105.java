package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Odev2105 {

	public static void main(String[] args) {
		
//		Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız.
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
		
		System.out.println(list);
		
//		İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
//		İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz.
//		ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B.
		
		list.add("B");
		list.add(1, "L");
		System.out.println(list);
		
//		set() methodu kullanarak, E’yi D yapınız.
//		ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, F, B.
		
		list.set(3, "D");
		System.out.println(list);
		
//		remove() methodu kullanarak, F’yi siliniz.
//		ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, B.
		
		list.remove(4);
		System.out.println(list);
		
//		sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
//		ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
		
		Collections.sort(list);
		System.out.println(list);
		
//		contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de
//		var olmadığını doğrulayınız.
		
		System.out.println(list.contains("L"));
		System.out.println(list.contains("M"));
		
//		size() methodu kullanarak, list’in kaç eleman olduğunu ekrana yazdırınız.
		
		System.out.println(list.size());
		
//		clear() methodu kullanarak, list’deki tum elemanları siliniz.
		
		list.clear();
		System.out.println(list);
		
//		isEmpty() methodu kullanarak, list’deki tum elemanların silindiğini doğrulayınız.
		
		System.out.println(list.isEmpty());
		
	}

}
