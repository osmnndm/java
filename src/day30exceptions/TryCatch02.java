package day30exceptions;

public class TryCatch02 {
	
	static String o;
	
	public static void main(String[] args) {
		
		String s = "";
		System.out.println(s.length());
		
		try { // dene bunu çalıştır her yerde kullanılabilir ama 
			 // genel kullanım exception ihtimalinde kullanılıyor.
			s+="t";
		}catch(Exception e) {
			s+="c";
		}finally {
			s+="f";
		}
		s+="a";
		
		System.out.println(s);
		
		String n = null; 
		String m; 
		
		// String'e null atandığı veya String instance variable'a (o) değer atanmadığı zaman 
		// length() methodu çalışmaz ve NullPointerException alırsınız.
		// NullPointerException Run Time Exception'dır.
		// n bir bir objedir, obje için uzunluk ölçülemez.
		// String m bir methodun içinde olduğu için local variable'dir mutlaka değer atanması lazım 
		// yoksa hata verir.
		
		
		// 
//		System.out.println(n.length());
//		System.out.println(m.length());
//		System.out.println(o.length());
		
		
		
		
		
	}

}
