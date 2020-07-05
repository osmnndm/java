package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {
	
//	Collections: yığın, birikim demektir.
//	Javada temelde üç tane list var. List, Queue, Set
//	Collection bu üçünün parent'ı durumunda. Java her zaman ortak özellikleri parent'a koyar.
//	Iterable Collection Interface'ının parentıdır. değiştirilebilir demektir.
//	ve bunlar hepsi Interface'dır
//	child Interface ise parent Class olamaz.
//	Queue sıra demek
//	Iterator bir collection'ın elemanları arasında gezer ve o elemanları değiştirir.
//	for each loop Collection elemanları arasında gezer ama değiştiremez.
//	Collection olarak biz sadece List'i öğrenmiştik
//	List<String> list1 = new ArrayList<>(); yazdığımızda hem List hem de ArryList'in altını cizer
//	List ayrı bir Interface ArrayList ayrı bir Class
//	Iterator Javada bir Interface'dir.
//	.iterator methodu başka bir objeyi interface'e uygun hale getirmektir.
//	interface'de normalde Constructor olmaz, obje oluşturulamaz ama iterator methodu sayesinde 
//	başka yerde oluşturulmuş objeyi interface'de kullanılabilir haline getiriyor.
//	.hasNext methodu bir sonraki elaman var mı yok mu, kontrol eder, eleman varsa true atar.
//	System.out.print(iterator.next());// yazdırmak için next methodunu kullanmamız gerekiyor.
//	.next methodu iterator'a git pointer’i bir sonraki elemanın öncesine götür demektir.
//	eğer siz bir Iterator'da değişimin kalıcı olmasını istiyorsanız
//  for-each loop elamanlar arasında gezer ama Collection'ı değiştiremez
//	iterator ise elemanlar arasında gezer ve istenirse Collection'ı değiştirir. 
//	Data type ya kendisi gibi yada parenti gibi olmalı, obje oluşturabilmesi içinde class olmalı
//	SortedSet obj2 = new TrreSet(); obj2 objesi TreeSet Class'ı nda oluşturuluyor, SortedSet onun
//	parenti
	
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);// [X, Y, Z]
		
		Iterator<String> iterator = list1.iterator(); 
//      .iterator methodu başka bir objeyi interface'e uygun hale getirmektir.
//		Tipi Iterator interface olan iterator isimli bir obje oluşturduk.
//		bu objeyi list1 kullanarak üretmiş olduk.
//		while(iterator.hasNext()) { //.hasNext methodu bir sonraki elaman var mı yok mu, kontrol eder.
//		yukarıdaki while de kendisinden sonra eleman var olana kadar 
//		true eder eleman bitince false der çıkar.
//			System.out.print(iterator.next());// yazdırmak için next methodunu kullanmamız gerekiyor.
//		}
		
		System.out.println();
		
//		for-each loop kullanarak list1'in tüm elemanlarını ekrana yazdırınız.
		for (String w: list1) {
			System.out.print(w); //XYZ
		}
		
		System.out.println();
		System.out.println();
		
//		for-each loop ile değişim yapmaya çalışalım
		
		for(String w: list1) {
			w = w+"A";
		}
		System.out.println(list1);// [X, Y, Z]
		
		// for-each loop elamanlar arasında gezer ama Collection'ı değiştiremez
//		iterator ise elemanlar arasında gezer ve istenirse Collection'ı değiştirir. 
	
		System.out.println();
//		Iterator ile for-each loop farkı:
		while(iterator.hasNext()) { 
			iterator.next(); //	.next methodu iterator'a git bir sonraki elemanı yazdır demektir.
			iterator.remove(); // remove methodu eleman siler.
		}
		System.out.println(list1); // []
		
	}
}
