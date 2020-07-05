package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		// genel usul olarak metodlar main method içine yazılmaz 
		// main method dışında methodlar oluşturulur ve 
		// oluşturlan methodlar main method içine çağırılarak kullanılır.
		// metodları main'in dışında oluşturup, mainin içinde kullanabiliriz.
		// metodun ismin yazarak çağırıp main içinde kullanabiliriz.
		// main metodunu sadeleştirmeye yarar.
		// metodu call ediyoruz çağırıyoruz.
		// bir metodu main içerisinden çağıracaksanız mutlaka static kelimesini kullanmalısınız.
		// void bir return type dir.hiç bir şey üretmez sadece ekrana birşey yazar.
		// Method parantezinin içinde oluşturulan variable'lara "parametre" denir.
		// Methodu çağırırken method parantezinin içine yazılan değerlere "argüment" denir.
		// Parametrenin data type ile argümentin data type'ı eşleşmeli. parametre 
		// int iken argüment String olamaz.

	//	toplama();
	//	carpma();
		System.out.println(toplama(11,15.2));// 26.2
		System.out.println(carpma(13,5)); // 65
		
		
	}
//	public static void toplama() { 
//		System.out.println(3+5);
//		}
	public static double toplama(int num1,double num2) { // data tipi ve ismi birlikte yazılan yere parametre denir.
													    // toplama metodu iki parametrelidir.
	// double int'i kapsadığı için
	// sorun çıkarmıyor. auto						  // eğer parametreli bir metod oluşturursak metodu çağırmak için  
													// içine sayı koymamız gerekiyor. 
													// toplama(3,5) gibi 3 ve 5'e argüment deniyor.
		
		return num1+num2;   // return: döndürmek, sonucu vermek
	
	}
	
//	public static void carpma() {
//		System.out.println(3*5);
//	}
	
	public static int carpma(int num1,int num2) {
		return num1*num2;
	}
}
