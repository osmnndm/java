package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

//	public static void main(String[] args) throws FileNotFoundException {
		
		// FileInputStream bir Class. yazdığımız bir programın içerisine bir dosya eklemek 
	   // istediğimizde bu Class'ı kullanıyoruz.
	
	// Checked Exception'ları handle(halletmek) için iki yol var.
			// 1) "throws" keywordunu kullanmak. bunu kullanırsanız konsolda teknik mesajlar görürsünüz
			// Bu yüzden çok tercih edilmez.
	public static void main(String[] args)throws FileNotFoundException {	
		
	
			FileInputStream file = new FileInputStream("C:/ogrenci.txt");
	
			
		
			
//			e.printStackTrace(); OTOMATİK OLUŞAN BU SATIRI SİLİYORUZ. ALTTAKİNİ YAZIYORUZ
			
		} 
		
		// Checked Exception'ları handle(halletmek) için iki yol var.
		// 1) "throws" keywordunu kullanmak. bunu kullanırsanız konsolda teknik mesajlar görürsünüz
		// Bu yüzden çok tercih edilmez.
		// 2) "try-catch block kullanmaktır. Bunu kullanırsanız konsolda teknik mesajlar yerine 
		// kendi mesajlarımızı görebiliriz. Bu yüzden try-catch kullanmak tercih edilir.
		
		
		// FileInputStream() parametresini boş bırakırsanız FileInputStream Class'ının parametresiz 
		// Constructor'ı olmadığından altını çizer exception verir.
		// içine "C:/ogrenci.txt" yazınca altını yine çizer.
		// altına gidip "add throws" linkini tıklıyoruz.
		// main methoda "throws FileNotFoundException" yazısını ekleyecektir.
		// çalıştırınca altta bir sürü hata mesajları gösterecek. bunlar yabancı birileri için 
		// readable olmadığı için bu 1. yolu çok tercih etmiyoruz.
		
		// diğer bir yol 
		// // içine "C:/ogrenci.txt" yazınca altını yine çizer.
		// altına gidip "add try" linkini tıklıyoruz.
		// try {
		// FileInputStream file = new FileInputStream("C:/ogrenci.txt");
		// } catch (FileNotFoundException e) { yazacaktır.
		// e.printStackTrace(); OTOMATİK OLUŞAN BU SATIRI SİLİYORUZ. ALTTAKİNİ YAZIYORUZ
		// System.out.println("Dosya bulunamadı, Allah bilir kim sildi");
		// Çalıştırınca bu yazı çıkacaktır.
		
		// biz bir kod yazdığımızda muhtemel hatayı tahmin ederiz.
		
		

	}



// yeni bir Class oluşturuyoruz.

class ExceptionTryCatch{
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream ("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
		System.out.println("Dosya'nın path'i yanlış veya dosya silinmiş olabilir");
		//	e.printStackTrace(); BU SATIRI SİLİYORUM
		// class ismi ExceptionTryCatch üstüne gidip sağ tıkla
		// run as git ==> java yı seç altta try yazanı seç ve tamam de. 
		// üstteki mesaj değilde "Dosya'nın path'i yanlış veya dosya silinmiş olabilir"); mesajı 
		// altta mesaj olarak paylaşılır.
		}
	}
}
