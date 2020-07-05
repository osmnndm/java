package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queu01 {
	
	public static void main(String[] args) {
		
		// Queue: Queu'ya eklenen elemanlar listlerde olduğu gibi en sona eklenir.
		// Queue'da silinen elemanlar en baştaki elemandan başlayarak silinir.
		// [1,2,3] ==> bu Queue'dan eleman silmeye başladığınızda önce 1 silinir.
		// FIFO ==> meşhur tabirdir. first in first out. yemekhanelerde ilk gelen ekmeği 
		// önce bitirirler.
		// Queue bir interface'dir onun altında iki Class vardır. 
		// Birisi LinkedList, diğeri PriorityQueue dir.
		// elemanlar natural order dizilsin istersek PriorityQueue Constructor'ını kullanırız yok eğer
		// elemanlar girdiğimiz sıraya göre dizilsin istersek LinkedList Constructor'ını kullanırız.
		// .element() methodu ilk elemanı döndürür. Queue'da ilk eleman çok önemlidir.
		// remove() methodunda index yoktur ilk elemanı siler
		// veya remove(object) kullanılırsa parametre içine yazılan elemanı siler.
		// .poll() methodu ilk elemanı siler.
		// remove() methodu boş Queue'lar için kulllanılırsa Exception verir.
		// poll() methodu boş Queue'ler için kullanılırsa null verir.
		// dolu Queue'lar için ikiside aynı işi yapar ilk elemanı silerler farkları yoktur.
		
		// PriorityQueue Constructor'ı elemanları natural order'a göre sıralar.
		Queue<String> q = new PriorityQueue<>();
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q);
		
		// Constructor olarak LinkedList kullanırsak girdiğimiz sıraya göre dizer.
		Queue<String> qll = new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);
		
		// remove methodu kullanalım
		
		System.out.println("Silinen eleman: "+ q.remove()); 
		// bu yazımda remove methodu sildiği elemanı return eder ve her zaman ilk elemanı siler.
		System.out.println("Kalan q: "+ q); // geriye kalan elemanları görürürüz.
		System.out.println(q.remove("C")); 
		// true verir, çünkü biz Java'ya hangi eleman silinmesi gerektiğini söyledik, Java true return
		// ederek işlem tamam mesajı verir.
		System.out.println(q); // [B]
		System.out.println("Silinen eleman: "+ q.remove()); // B'yi silecektir.
		System.out.println(q); // []
//		System.out.println("Silinen eleman: "+ q.remove()); 
		// remove methodu() boş Queue'lar için Exception verdiğinden bu kodu comment yaptık.
		
		System.out.println(qll.element());//.element() methodu ilk elemanı döndürür. 
		// Queue'da ilk eleman çok önemlidir.
		
		System.out.println(qll);
		System.out.println(qll.poll()); // B ==> ilk elemanı sildi ve return etti.
		System.out.println(qll);// [A,C]
		System.out.println(qll.poll());// A
		System.out.println(qll);// [C]
		System.out.println(qll.poll());// C
		System.out.println(qll);// []
		System.out.println("Boş Queue için poll(): "+ qll.poll()); // null
//		Not: remove() methodu boş Queue'lar için kulllanılırsa Exception verir.
//		poll() methodu boş Queue'ler için kullanılırsa null verir.
//		dolu Queue'lar için aynı işi yapar ilk elemanı silerler farkları yoktur.
	}

}
