package day32abstraction;

public interface Interface01 {
	
	// Interface Class'a benzer ama Class değildir.
		// Abstract Classların içine hem abstract hem constract method koyabiliyorduk, Interface'e
		// sadece abstract method konulabilir.
		// Interface içerisine variable koyabaliriz ama mutlaka bu variable static ve final olmalıdır.
		// Interface içindeki variable'lar mutlaka public static ve final olmalıdır.
		// bu kuralı dinlemez variable'ı private veya protected yaparsanız Compile Time Error alınır.
		// interface içindeki variable'ları mutlaka initialize etmek(değer atamak) zorundasınız, 
		// aksi takdire Compile Time Error alırsınız.
		// int a=12; gibi yapılmalı
		// interface'de method oluştururken kesinlikle body yazmayın
		// interface'deki methodlar kesinlikle public ve abstract olmalıdır.
		// interface'deki abstract methodları üretirken abstract keyword kullansanızda olur 
		// kullanmasanızda olur. public void add(); veya public abstract void add();
		// çünkü interface kendi içine yazılan methodları otomatik olarak abstract olarak
		// kabul eder.
		// interface'de variable'lar initialize, public, static, final olmalı ve mutlaka initialize 
		// edilmelidir. initialize : değer atanmalıdır.
		// Variable oluştururken public,static,final keywordları kullanılsada olur kullanılmasada olur.
		// kullanılmasada kendisi default olarak public, static, final olarak atar.
	
	public void add();
	public abstract void subtract();
	
	public static final int a = 12; 
	int b = 11;
	public int c = 13;
	final int d = 14;
	static int e = 15;
	
	

}
