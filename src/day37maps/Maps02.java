package day37maps;

import java.util.Hashtable;

public class Maps02 {
	
	public static void main(String[] args) {
		
		// Hashtable: HashMap ile hemen hemen aynıdır.
		// Farkları: 
		// 1) Hashtable console'a yazdırıldığında HashMap gibi rastgele sıralamada yazdırılır.
		// 2) Hashtable Key ve Value'larda null'a müsade etmez.
		// 3) Hashtable thread safe'dir.Bazen bir application'da aynı anda iki app birlikte çalışır.
		// bir application buna müsaitse buna "thread safe" deniyor, 
		// yani aynı anda başka şeyler yapabiliyor.
		// 4) HashTable daha yavaştır.
		// HashMap'te kullanılan tüm Methodların tamamı Hashtable'da da kullanılabilir.
		
		Hashtable<String, String> hTable = new Hashtable<>();
		hTable.put("Dil","Kalp");
		hTable.put("Gönül", "Kalp");
		hTable.put("Dil", "Tad alma organı");
	//	hTable.put(null, "Agızlik"); // Run Time Error verir
	//	hTable.put("Kanaat", null); // Run Time Error verir
		hTable.put("Ali", "");// null olmadığından problem olmaz.
		System.out.println(hTable);
		
		
	}

}
