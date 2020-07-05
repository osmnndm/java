package day22arrayList;

public class Odev2204 {

	public static void main(String[] args) {
		
		// For-each loop Soru 4:
		// Bir String oluşturunuz, 
		// bu String’deki character’leri yukarıdan aşağıya for-each loop kullanarak yazdırınız.
		// İpucu: split()
		
		String kelime= "Eleveda";
		String ch[]=kelime.split("");
		
		for(String w:ch) {
			System.out.println(w);
		}
		

	}

}
