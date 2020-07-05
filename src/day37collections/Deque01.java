package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
	
	public static void main(String[] args) {
		
		// Deque: Double ended Queue (iki uçlu Queue)
		// Queue'larda ekleme sona yapılır, silme bastan yapılır.
		// Queue kullanırsanız eklemeyi hem başa hem de  sona yapabilirsiniz.
		// Aynı şekilde silmeyi hem baştan, hem de sondan yapabilirsiniz.
		// Dequeue'da FİFO(First In First Out) var, bunun yanında LIFO'da var.(Last In First Out)
		// Queue'lara eleman olarak null eklenebilir ama Deque'lara null eleman olarak eklenemez.
		// Deque resizable'dır. Yani kapasitesi değiştirilebilir.
		// pop() methodu Deque'larda baştaki elemanı siler ve baştaki elemanı return eder.
		// offer() methodu sona ekleyince true döner, addLast() ekleyemeyince exception verir.
		// offerFirst() başa ekleyince true döner, addFirst() ekleyemeyince exception verir.
		// push() başa ekleyemeyince false döner.
		
		
		Deque<String> dq = new LinkedList<String>();
		dq.add("Son1");
		dq.addFirst("Bas1");
		dq.addLast("Son2");
		dq.push("Bas2");// push() en başa ekleme yapar.
		dq.offer("Son3"); // en sona elemena eklemek için kullanılır
		dq.offerFirst("Bas3");
		dq.offerLast("Son4");
		System.out.println(dq);
		
		
		System.out.println(dq.pop());// baştaki elemanı siler ve return eder.
		System.out.println(dq);
		
		System.out.println(dq.removeLast()); // Son4
		System.out.println(dq);
		
		dq.removeFirst();
		System.out.println(dq);
		
	}

}
