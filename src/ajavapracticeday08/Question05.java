package ajavapracticeday08;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question05 {

	///			KELİME ANALİZİ
		/*
		 * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
		 * 
		 * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap 
		 * 				oluşturun.
		 * 2. Adım : Girilen metni split methodu ile parçalayalım.	
		 * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
		 * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim	
		 * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve 
		 * 				tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
		 * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
		 * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
		 * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri 
		 * 				tekrar sayısıyla birlikte gösterelim.
		 * 
		 * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
		 * */
		///// örnek bir parçalama çiz
		//		cümle bir. cümle iki -- > split
		//		1. "cümle bir" --- >> cümle (1) , bir (1)
		//		2. "cümle iki" --- >> cümle (2) , iki (1)
	
	
	static Map<String,Integer> kelimeListesi = new HashMap<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("İstediğiniz metni giriniz : ");
		String metin = scan.nextLine();
		// bugün okula gitmedim. bugün yorgunum.
		String[] cumleler = metin.split("\\."); // . gibi ifadeler özel ifadeler olduğundan \\ java bunu 
//												// eklememizi istiyor.
		// bugün okula gitmedim
		// bugün yorgunum
		for(int i = 0 ; i < cumleler.length ; i++) {
			String[] kelimeler = cumleler[i].trim().split(" ");
			// bugün, okula, gitmedim
			for(int j = 0; j < kelimeler.length; j++) {
				if(kelimeListesi.get(kelimeler[j]) == null) { // null    
					kelimeListesi.put(kelimeler[j], 1); // eğer bu kelimeden başka yoksa ona 1 yaz.
				}else { // cümle, 1
					int sayi = kelimeListesi.get(kelimeler[j]); // value değeri 1'i yazar.
					kelimeListesi.put(kelimeler[j], sayi+1); // hashmap e git cümleyi ekle bir yaz
					
					scan.close();
				}
			}
		}
		for(String s : kelimeListesi.keySet()) { // hashMap te for each kullanacaksak .keySet() 
			                                     // kullanmamız gerekiyor.
			System.out.println(s + " = " + kelimeListesi.get(s));
		}
	}
}
