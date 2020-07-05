package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {
	
	public static void main(String[] args) {
		
		// Elemanları A,B ve C olan bir list oluşturunuz
		// list iterator kullanarak bu elemanları ve AW, BW ve CW ye dönüştürünüz.
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		ListIterator<String> listIterator = list.listIterator();
		
		// list oluşturmadan ListIterator oluşturamıyorum.
		
		while(listIterator.hasNext()) {
			Object harf = listIterator.next();
			listIterator.set(harf + "W"); // set methodu bu indextekinin yerine bunu ata,uygula demektir.
		}
		// iterator'da yapılan değişiklikler kalıcı oluyor.
		
		System.out.println(list);
		
		list.add("Kemal");
		list.add("Can");
		
		System.out.println(list);
	}
	

}
