package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ["A", "C", "B", "C"] listini oluşturun
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// list de eleman olarak B var mı?
		// contains methodu kullanılır.
		// list.contains("B"); list B elemanını içeriyor mu demektir.
		// varsa true yoksa false return eder.
		
		
		list.contains("B");
		System.out.println(list.contains("B"));// true verir.
		
		
		// bir listteki elemanları alfabetik sıraya(Natural Order) dizmek için 
		// Collections.sort(list); methodu kullanılır
		// parametre olarak listin adı girilir.
		// list deki elemanları alfabetik sıraya koyunuz.
		// Collection ==> bir araya getirilmiş parçalar.
		// ayakkabılık, kalemlik, koleksiyon gibi
		// Collection bir class, içerisinde methodlar var.
		
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
	}

}
