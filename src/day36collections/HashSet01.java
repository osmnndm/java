package day36collections;

import java.util.HashSet;

public class HashSet01 {
	
	public static void main(String[] args) {
		
		// HashSet 1) Tekrarlı eleman kullanımına(Duplication) izin vermez.
		// 2) Key - Value yapısını kullanır. Key'ler ve Value'lar HashSet için unique'dir(benzersiz).
		// normalde Key'ler her zaman unique'dir. Value'lar kullanılan Class'a bağlı olarak
		// unique olabilir ve olmayabilir. Kullanılan Class HashSet ise Value'larda unique olur ama
		// ArrayList ise unique olma zorunluluğu yoktur.
		// Key'i java kendi üretir, tekrarı bir benzeri yoktur, aynı şekilde vaule'larında benzeri olmamalı
		// Key-Value'lara en güzel örnek sözlüklerdir. Bir kelimenin manası bir kere yazılır başka 
		// yazılmaz. kelimeler Key'dir, Value'ler ise tekrar kullanılabilir. 
		// yürek = kalp, gönül = kalp gibi... bu nedenle mesela dijital bir sözlük oluşturduğunuz da
		// ArrayList makul olur HashSet makul olmaz yürek için kalp yazdığınızda 
		// gönül için kalp yazamazsınız yani unique'dır.
		// HashSet'i ekrana yazdırdığımızda key ve value'yu birlikte göreceğiz. aşağıdaki gibi
		// [Dil=kalp, Yürek=Kalp, Gönül=Kalp, Yüz=Sayı]
		// mesela öğrenci numarasını girdiğinizde bu keye uygun sadece ilgili kişiyi bulur.
		// bizim her yazdığımız karaktere Java bir reference değeri atar, buna Hashcode diyoruz.
		// uniqe numara: herkesin essiz bir numarasi var. mesela univeriste numarasi 9017004   
		// 90(yil)17(bolum)004(kazanma sirasi)
		// console de cikan referanslar javanin hashing yontemi  buna hashcode denir.
		// Java bizim verdiğimiz her value için hashing tekniğini kullanarak bir unique oluşturur.
		// key her zaman unique dir.
		// Normalde List'lerde add() methodu hep yeni eklenen elemanı sona ekler ama HashSet'lerde
		// öyle bir zorunluluk yok.
		// HashSet'ler elemanları ekrana rastgele yazdırır, kural yoktur. Java arka planda her vaule'ya
		// verdiği key unique değerine göre bir reference atar ve ona göre bir sıraya dizer. 
		// buda random rastgele olur.
		// HashSet'te bir Value'ya aynı değer eklenmek istendiğinde Compile Time veya Run Time Error alınmaz.
		// son yüklediğimizi eskisinin üzerine yazar, tekrara izin verilmez.
		// .hashCode() methodu bir valuye Java'nın atamış olduğu hashCode değerini çalıştırır.
		
//		Class   Data type         constructor ismi
		HashSet<String> hSet = new HashSet<>();
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		// aynı eleman HashSet'e eklenmek istendiğinde Compile Time veya Run Time Error alınmaz.
		// son eklenen eleman ilk eklenen elemanın üstüne yazılır.
		hSet.add("Apple");
		System.out.println(hSet);
		
		System.out.println(hSet.hashCode());
		// .hashCode() methodu bir valuye Java'nın atamış olduğu hashCode değerini çalıştırır.
		
		
	}

}
