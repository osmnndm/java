package day22arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {

		// equals() methodu iki listin birbirnie eşit olup olmadığını kontrol eder
		// List'ler eşit ise "true", değilse "false" return eder.
		// equals() methodu aynı index'de aynı eleman olup olmadığını kontrol eder
		// equals() methodu objelerin reference(adreslerine) larına bakmaz.
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2)); // true
		
		list1.add("A");
		System.out.println(list1.equals(list2)); // false
		
		list2.add("A");
		System.out.println(list1.equals(list2)); // true 
		
		list1.add("A");
		list1.add("B");
		
		list2.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2)); // false
		
	}

}
