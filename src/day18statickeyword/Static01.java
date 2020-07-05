package day18statickeyword;

public class Static01 {
	
	static int en=12;
	static int boy=10;
	static int yaricap=10;
	static double pi;
	static int alan;
	
//	int alan=en*boy;
	
	// eğer bir Variable oluştururken hesap yapmamız gerekirse 
	// " static block" oluşturmak iyidir. Yani; int alan=en*boy demek yerine
	// "static block" oluşturup bu işlemleri static block'in içine yazmak daha iyidir.
	// "static block" variable'lara değer atamak içinde kullanılabilir.
	// "static block" Class'ın içinde bütün methodların(main dahil) ve 
	// Constructorların dışında oluşturulmalıdır.
	// "static block" Class oluşturulduğu zaman oluşturulur.
	// "static block" tüm methodlardan önce çalıştırılır.
	// birden fazla static block varsa üstteki önce çalışır.
	// static class oluşturulabilir ama alt classlar(inner class) static Class olabilir.
	// üst class'lar static olamazlar.
	// static class main method dışında olması gerekir.
	
	static {
		pi=3.14;
	}
	
	static {
		alan=en*boy;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	static class AltClass{ // alt Class
		
	}
}


	
