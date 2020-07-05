package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
	
	public static void main(String[] args) {
		
		// TreeSet: 1) HashSet ile hemen hemen aynıdır. Duplication'a müsaade etmez
		// 2) TreeSet elemanlarını natural order( sayı ise küçükten büyüğe, String ise a dan z ye)
		// göre dizer. 
		// 2) HashSet ile farkı: TreeSet elemanlarını natural ordera göre dizer.
		//    HashSet ise rastgele elemanları dizer.
		// 3) HashSet ile farkı: HashSet bu sıralama meselesinden dolayı daha hızlıdır.
		// 4) Natural Order'a sahip bir Set lazım olduğunda normalde TreeSet kullanılması lazımken
		// yavaşlığından dolayı HashSet oluşturulur sonra bu HashSet TreeSet'e dönüştürülür böylelikle
		// TreeSet'in hız problemi çözülmüş olur.Direk TreeSet oluşturma genellikle kullanılmaz.
		// sıralama benim için önemli olduğunda TreeSet kullanırım.
		// HashSet oluşturup Java'nın elemanların hızlı eklemesini sağlarız.
		// HashSet'i TreeSet'e çevirme: oluşturduğumuz HashSet'i TreeSet' constructor'ına 
		// parametre olarak koyup TreeSet'e çeviririz. 
		// böylelikle TreeSet'in elemanları natural order yapma özelliğinden istifade etmiş oluruz.
		
		
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		
		System.out.println(tSet); // alfabetik sırada yazdıracaktır.
		
		// HashSet oluşturup Java'nın elemanların hızlı eklemesini sağlarız.
		HashSet<String> hSet1 =new HashSet<String>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		
		System.out.println(hSet1);// sıralama olmadan rastgele yazar.
		
		// oluşturduğumuz HashSet'i TreeSet' constructor'ına parametre olarak koyup TreeSet'e 
		// çeviririz. böylelikle TreeSet'in elemanları natural order yapma özelliğinden istifade
		// etmiş oluruz.
		TreeSet<String> tSet1 = new TreeSet<>(hSet1); 
		
		System.out.println(tSet1);
		
		
	}

}
