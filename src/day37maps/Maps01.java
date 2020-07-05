package day37maps;

import java.util.HashMap;

public class Maps01 {
	
	public static void main(String[] args) {
		
	// Map bir interface'dir. Map interface'inin üç tane child Class'ı vardır.
	// 1) HashMap  2) HashTable  3) TreeMap
	
	// HashMap: HashMap key-value yapısını kullanır.Key ve Value programcı tarafından
	// yazılır.Key ve Value'da null değeri kullanılabilir. Key'de 1'den fazla null değeri kullanılırsa
	// Java son kullanılan null'u kabul eder, value'da biren fazla null değeri kullanılabilir.
	// HashMap console'a yazdırıldığında hem key değerleri hem de value değerleri aralarına
	// = sembolü konularak yazdırılır. 
	// HashMap'ler ekrana yazdırırken rastgele yazdırır.
	// HashMap, Map'ler arasında en hızlısıdır.
    // { } ve key numarası olmadan value okumak için .get() methodunu kullanıyoruz.
		
	
	// Normalde Java kendisi Hashing tekniği kullanarak kendisi key atar.
	// Maps'lerde bu keyleri biz kendimiz atıyoruz.
	// Bir HashMap'e eleman eklemek istediğimizde put() methodu kullanırız, burada iki parametre 
	// kullanırız key ve Value.
	// key'de sayı yerine null koyabiliriz ama sadece bir kere çünkü keylerde bunu dublucation 
	// sayar, Exception vermez, eskisinin üzerine yazar.
	// HashMap'ler "therad safe" değildir. Bazen bir application'da aynı anda iki app birlikte çalışır.
	// bir application buna müsaitse buna "thread safe" deniyor, yani aynı anda başka şeyler yapabiliyor.
		
		
	// List<String> isimler   ahmet, mehmet nazmi
	// List<Integer>boy 180,200,190  yazacağımıza
	// hashMap'le ahmet 180, mehmet 200, nazmi 190 olarak çalışabiliyoruz.
	
	
	HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
	hashMap.put(3333, "Ali");
	hashMap.put(1, "Veli");
	hashMap.put(55, "Mine");
	hashMap.put(4, "Kemal");
	System.out.println(hashMap);
	
	System.out.println(hashMap.remove(4));
	System.out.println(hashMap);
	
	System.out.println(hashMap.remove(1, "Veli")); // true verir.
	System.out.println(hashMap.remove(55, "Ayse")); // false verir.
	System.out.println(hashMap);
	
	System.out.println(hashMap.get(55)); // { } ve key numarası olmadan value okumak için 
	// get kullanıyoruz. bu key numarasında value yoksa null yazar.
	System.out.println(hashMap.get(5555)); // null yazar
	
	System.out.println(hashMap.keySet()); // Map'teki key numalarını Set halinde görmek için .keySet() 
	// methodunu kullanıyoruz.
	
	System.out.println(hashMap.values()); // Map'teki vauleleri Set halinde yazdırmak için .values() methodunu kullanıyoruz.
	
	System.out.println(hashMap.size()); // Map'te kaç eleman var bunu yazdırmak için .size() methodu kullanılır.
	
	System.out.println(hashMap.containsKey(3333)); // Map içerisinde aradığımız key numarasında 
	// value var mı diye bakar, true veya false verir.
	
	System.out.println(hashMap.containsValue("Mine")); // Map içerisinde aradığımız value varmı diye
	// arattırmak için .containsValue() methodu kullanılır, True veya false döner.
	
	hashMap.replace(55, "Emin");// .replace() methodu key numarasındaki value yerine yeni value yazar.
	System.out.println(hashMap);
	
	hashMap.clear(); // .clear() methodu Tüm elemanları siler. void bir method olduğu için console'a yazar.
	
	
	
	}
}
