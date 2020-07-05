package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {
	
	public static void main(String[] args) {
		
		// elemanları A,B ve C Stringleri olan bir list oluşturunuz
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// list iterator oluşturunuz
		// ListIterator Iterator'a göre daha zengin daha çok method içeriyor.
		// iterator'larda elemanlar arasında gezmek için her zaman While'ı kullanıyoruz.
		// .next()bir sonraki elemana geç return et demektir.
		// .hasPrevious pointer'ı en sondan başlayıp geriye doğru bir önceki elemana bak 
		// varsa true ver demektir.
		// öncelikle .hasNext'i kullanıp pointi sona getiriyoruz.
		// en sona gelen point .hasPrevious ile kaldığı yerden devam edip geriye doğru gider.
		// .hasNext kullanmadan .hasPrevious kullanırsak en baştan başlar geride hiçbirşey 
		// olmadığından devam etmez.
		// .hasPrevious() ve previous() methodlarını kullanarak bir list'in elamanlarını
		// tersten yazmak isterseniz önce hasNext() ve next() kullanmalısınız.
		// list oluşturmadan ListIterator oluşturup ona eleman ekleyemiyorum.

		
		ListIterator<String> listIterator = list.listIterator();
		
		while(listIterator.hasNext()) {
			Object element = listIterator.next(); // data type herşeye uygun olsun diye object yaptık.
			System.out.print(element + " ");
		}
		
		System.out.println();
		
		while(listIterator.hasPrevious()) {
			Object element = listIterator.previous();
			System.out.print(element + " ");
		}
		
	}

}
