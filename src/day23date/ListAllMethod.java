package day23date;

import java.util.ArrayList;
import java.util.List;

public class ListAllMethod {

	public static void main(String[] args) {
		
		// listaddAll() methodu iki listi birleştirmek için kullanılır.
		// index kullanmadan addAll()yazım sırasına göre bir ekleme yaparsınız
		// list'i istediğiniz index'e eklemek istiyorsanız addAll(index,element) seçmeniz lazım.
		
		List<Integer>list1=new ArrayList<>();
		list1.add(11);
		list1.add(12);
		System.out.println(list1); // [11, 12]

		List<Integer>list2= new ArrayList<>();
		list2.add(13);
		list2.add(14);
		list2.add(15);
		System.out.println(list2); // [13, 14, 15]
				
		
		list1.addAll(list2);
		System.out.println(list1); // [11, 12, 13, 14, 15]
		
		list2.addAll(list1);
		System.out.println(list2); // [13, 14, 15, 11, 12, 13, 14, 15]
		
		List<Integer> list3=new ArrayList<>();
		list3.add(1);
		System.out.println(list3); // [1]
		
		List<Integer> list4=new ArrayList<>();
		list4.add(2);
		list4.add(3);
		System.out.println(list4); // [2, 3]
		
		list4.addAll(1, list3);; // [2, 1, 3]
		System.out.println(list4);
		
		
		
	}

}
