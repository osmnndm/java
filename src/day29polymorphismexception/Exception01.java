package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		
		// Exception: istisnai problemler demektir.
		// mesela sayılar birbirine bölünebilir ama sadece 0'a bölümünde hata verir. 
		// bu problemli duruma exception diyoruz.
		// bazı problemler vardır, halledilebilir, handling exeption.
	
		// bazılarıda halledilemez throwing exeption. yardım istemeye throw denir.
		// temelde iki türlü exception var.
		// 1)Exeption'ların bir kısmı Compile Time, 2) Bir kısmıda Run Time Error'dur.
		// Compile Time Error'lara Checked Exeption'da denir. kod yazarken bu hatalar altı kırmızı
		// çizilerek gösterilir. 
		// Checked exeption'a örnek: 
		// 1) FileNotFoundExceptions Programıma bir dosyayı almak istediğimde dosya bulunamadığı zaman verilen hatadır.
		// 2) IOException: input output exception yazdığım programıma dışardan bir şey almak, 
		// 	  veya dışarıya bir şey yollamak istediğimde bu hatayı verir.
		// Not: FileNotFoundException, IOException'ın Child'ıdıdır.
		// Not: Compile Time Exception'lar mutlaka Handle edilmelidir, yani düzeltilmelidir.
		
		// Checked Exception'lar nasıl halledilir?
		// 1) Method isminden sonra "throws" keyword kullanılır.
		// 2) try-catch block kullanılır. try-catch block kullanmak daha iyidir, çünkü readable'dır.
		// throws : yardım iste (denemeden yardım iste) throw yapılırsa java mesajarı 
		// kendi yazar, bu çok readable olmuyor.
		// try-catch blocks: try:dene eğer hata çıkarsa (catch:) onu yakala ve konsola yazdır.
		// lastiği değiştirmeyi dene yapamazsan bana yaz.
		// try kullanılırsa ekrana çıkacak hatayı siz yazarsınız daha anlaşılır olur.
		
		
		
		
		
		
	}

}
