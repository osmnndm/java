package day37maps;

import java.util.TreeMap;

public class Maps03 {
	
	public static void main(String[] args) {
		
		// TreeMap: 1) TreeMap key'lerde null kullanmaya müsade etmez ama value'larda 
		// istediğimiz kadar null kullanmaya müsade eder.
		// Collection'larda ne zaman Tree duyarsanız natural order aklımıza gelmeli.
		// TreeMap elemanlarını console'a yazdırmak istediğimizde key'ler natural order'a 
		// göre sıralanır.TreeMap en yavaşlarıdır.
		
		
		TreeMap<String, Integer> tMap = new TreeMap<>();
		tMap.put("Kanaat", null);
		tMap.put("Bezelye", 7);
		tMap.put("Elma", 10);
		tMap.put("Armut", 8);
		System.out.println(tMap); // alfabetik sırada yazar
		
		
	}

}
