package day22arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		// toArray() methodu listi Array'e çevirmek için kullanılır.
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		System.out.println(list); // [Ali, Can]
		
//		I. YOL: to Array() method'unun içinde parametre olarak new String[0] kullanınız.
		
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr)); 
	
//		II. YOL: Oluşturduğunuz array'in data type'ini Object olarak seçin.
//		Object class, Java'da bütün class'ların parent'idir. Yani Object class orta atadır.
//		Object class, Java'da parenti olmayan tek class'dır.
//		String, Object class'ın child'i olduğundan data type olarak bazı durumlarda
//		String yerine Object kullanırız.
		
		Object[] arr1=list.toArray();
		System.out.println(Arrays.toString(arr1));
		
//		asList( ) methodu array'leri liste çevirmek için kullanılır.
//		asList( ) methodu parametre olarak array'in ismini kabul eder.
		
		String arr2[]= {"Aliye","Can"};
		List<String> list1 = Arrays.asList(arr2);
		System.out.println(list1);
//		list1.add("Emine");
//		System.out.println(list1); // Run Time Error hata verir.boyut değişemiyor.
//		Array'den liste çevirme yaptığınızda, elde ettiğiniz list uzunluk olarak
//		esnek değildir. Yani array'den oluşturduğunuz liste ekleme ve çıkarma yapamazsınız.
		
		
//		list1.remove("Aliye"); // boyut değişeceği için remove() yapamazsınız.
		
		list1.set(0, "Kemal");
		System.out.println(list1); // [Kemal, Can]
		
//		List<String> list=new ArrayList<>();
//		list.add("one");
//		list.add("two");
//		list.add(7); // list lere sadece tek tip data eleman eklenebiliyor hata verir.
		
	}

}
