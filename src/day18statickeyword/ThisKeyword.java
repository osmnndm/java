package day18statickeyword;

public class ThisKeyword {
	
	int x =12;
	static int y = 13;
	
	ThisKeyword(int x){
		// this kullandığım zaman içinde bulunduğum class'taki
		// instance veya static variable'lara ulaşmak istiyorum demektir.
		// this constructorlar arasında geçiş yapmanın yoludur.
		
		
		this(); // bu classın içinde parametresiz constructor'ı çağır demektir.
				// this() kullanılacaksa mutlaka Constructor'ın ilk satıra yazılmalıdır.
				// aksi takdirde compile Time Error verir.
		this.x=x;
		System.out.println("Parametreli constructor");
	}
	ThisKeyword(){
		System.out.println("Parametresiz constructor");
	}
	
	ThisKeyword(String str){
		System.out.println("String Parametreli constructor");
	}

	public static void main(String[] args) {
		
		ThisKeyword obj1=new ThisKeyword(15);
		System.out.println(obj1.x); // 15

	}

}
