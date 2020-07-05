package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		// List oluşturun isim list01 olsun elemanlar integer olsun
		// List'ler data type olarak primitive'leri kabul etmez.
		// Primitive'lerde non-Primitive yapmak için Wrapper class'ları kullanırız.
		
		List<Integer> list01=new ArrayList<>();
		
		// bir list'in içinde elaman olup olmadığını kontrol edin
		// bunun için isEmpty methodu kullanılır.
		// boş ise true , dolu ise false return eder.
		
		System.out.println(list01.isEmpty());
		
		// Bu liste eleman ekleyin.
		
		list01.add(123);
		System.out.println(list01.isEmpty());
		
		// List'den eleman silmek için remove() methodu kullanılır.
		// iki remove methodu var biri indexle çalışıyor
		// 
		
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);

//		list01.remove(index);
		list01.remove(1); // indexi 1 olan elemanı siler
		
		// son elemanı siliniz.
		
		System.out.println();
		
		System.out.println(list01); // [123, 124, 125, 124]
		
		//123 ü silin
		
		list01.remove(0); 
		System.out.println(list01); // [125, 124]
		
		// listteki son elemanı silin
		
		list01.remove(list01.size()-1);
		System.out.println(list01); // 125

	}

}
