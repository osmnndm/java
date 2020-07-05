package day35collections;

import java.util.LinkedList;

public class LinkedList01 {
	
	public static void main(String[] args) {
		
//		LinkedList bir Class'tır. LinkedList'te koyduğumuz her elemanın sağ tarafında bir pointer
//		varmış gibi düşünüyoruz bu pointer onu sağ tarafındaki elemana bağlar.linked zaten bağlanmak
//		demektir.bu şekilde tren vagonları gibi her eleman bir sonraki elemana bağlıdır.
//		cok fazla eleman silmemiz veya eleman eklememiz gereken durumlarda LinkedList kullanılır.
//		LinkedList'te head hariç her eleman için bir data bir de pointer var.
//		Head ilk eleman, head'de sadece pointer vardır.
//		Her eleman pointer'i bir sonraki elemanı gösterir, son elemanın pointer'ı(tail) pointer'i 
//		null(boş) gösterir.    . A . B . C .    . Z . null   
//		ilk pointe head diyoruz,A'yı gösterir. son noktaya tail diyoruz null gösterir.
//		Data ve pointer içeren her elemanın diğer adı "node" dur.  " . A " birlikte bir node'dur.
//		eleman ekleme ve çıkarma durumlarında LinkedList başarılıdır.

//		LinkedList objesi oluşturunuz
		
		LinkedList<String> linklist = new LinkedList<>();
		linklist.add("Mark");
		linklist.add("Amanda");
		linklist.add("John");
		linklist.add("Ann");
		linklist.add("Pamela");
		System.out.println(linklist); // [Mark, Amanda, John, Ann, Pamela]
		
		linklist.remove(2);
		System.out.println(linklist);
		
		linklist.removeFirst();
		System.out.println(linklist);
		
		linklist.removeLast();
		System.out.println(linklist);
		
		linklist.add(1, "Ali");
		System.out.println(linklist);
		
		linklist.addFirst("Kemal");
		System.out.println(linklist);
		
		linklist.addLast("Zeynep");
		System.out.println(linklist);
		
		linklist.set(1, "Ajanda");
		System.out.println(linklist);
		
		LinkedList<String> linklist2 = new LinkedList<>();
		linklist2.add("X");
		linklist2.add("Y");
		
		linklist2.addAll(linklist); // iki listi birbirine ekliyoruz
		System.out.println(linklist2); 
		
		linklist.addAll(3, linklist2);
		System.out.println(linklist);
		
		System.out.println(linklist2.contains("Can"));
		
		linklist2.clear(); // clear methodu listin elemanlarını siler, sizde boş bir list kalır.
		System.out.println(linklist2);
		
	}

}
