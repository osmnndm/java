package day30exceptions;

public class TryCatchl03 {
	
	// INTERVİEW SORUSU:
			// throw ==> java bir satıra geldiğinde normalde hata vermese bile burada hata yap
						// diyebiliriz, bunun için throw kullanırız.
						// mesela girilmemesi gereken arazilere mayın döşenir, aynı şekilde
						// bir satıra girilmemesi isteniyorsa orada hata versin isteyebiliriz 
						// bunun için throw kullanılır.
	
	
	// throw , throws keywordlerinin farkı 
	// 1) throw, method body'si içine yazılır, throws method parentezi ile curly brace'in {}
	// arasına yazılır
	// throw'u method body'si içinde istediğimiz yerde kullanabiliriz.
	// 2) throw'u method body'si içinde exception almak istediğimiz yerde kullanabiliriz.
	// throws ise mecburen method isminden sonra bir kere kullanılabilir.
	// 3) bir throw sadece bir tane exception üretir. 
	// bir throws ile birden fazla exception üretebilirsiniz.
	// yani "throws NullPointerException, ArithmeticException" mümkün.
	// 4) throw için syntax ==> throw new NullPointerException;
	//    throws için syntax ==> throws NullPointerException
	
	public static void main(String[] args) {
		
		System.out.println(exceptions());
	}
	
	@SuppressWarnings("finally") // 24,25,26. satırların altını sarı renk çiziyordu 
	                            //bunu yazarak kaldırdık.
	public static String exceptions() {
		String result = "";
		String v = null;
		
		try {
			try {
				result += "before";
				v.length();  // null uzunluğu istenince NullPointException hatası alınır.
							 // ve alt satıra geçmeden satır 29'a geçer.
				result += "after";
			}catch( NullPointerException e) {
				result += "catch";
				throw new RuntimeException(); 
											  // burada Exception oluştursun diyor ama altta onu 
											  // yakalayacak catch yok bu nedenle bir alt satıra geçer.
			}finally {
				result +="finally";
				throw new Exception(); // yeni bir Exception oluşturur ve bunu satır 37 yakalar.
			}
		}catch(Exception e) { // Bu parent Exception dır. satır 31'u kapatırsak 
			                  // bu sefer bu
			result += "done";
		}
		return result; // result'u çalıştırır, return'u ekrana yazdırır. 
					   // method'da void kullanılmadığı için return
	}

}
