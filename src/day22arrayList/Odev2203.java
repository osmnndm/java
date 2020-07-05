package day22arrayList;

import java.util.ArrayList;
import java.util.List;

public class Odev2203 {

	public static void main(String[] args) {
		
		// For-each loop Soru 3:
		// İki String array oluşturunuz 
		// ve bu array’lerdeki ortak elemanları For-each loop kullanarak bulunuz. 
		// Sonucu ekrana yazdırınız.
		// Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız
		
		String arr1[]= {"Ali", "Veli","Can"};
		String arr2[]= {"Deniz","Veli","Ahmet"};
		List<String>sonuc=new ArrayList<>();
		
		for(String w:arr1) {
			for(String y:arr2) {
				if(w.equals(y)) {
					sonuc.add(w);
				}
			}
		}if(sonuc.isEmpty()) {
			System.out.println("Ortak eleman yok");
	}else {
		System.out.println(sonuc);
	}
		
	}
}
