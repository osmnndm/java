package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
	
		byte by=101;
		int sayi=by;
		
		System.out.println(sayi);
		
		// küçük data tipini büyük data tipine çevirmek için extra bir kod yazmaya gerek yok.
		// java bunu otomatik olarak yaparak buna Auto widining denir.
		
		
		int sayi2=53;
		byte by2= (byte)sayi2;
		System.out.println(by2);
		// büyük data tipini küçük data tipine çevirmek, java tarafından yapılmaz, örnekteki gibi sağ tarafa parantez içinde dönüştürmek istediğimiz data tipini yazmalıyız.

		
		double sayi3=23.9;
		int by3=(int)sayi3;
		System.out.println(by3);
		
		float sayi4=-23.9f;
		short by4=(short)sayi4;
		System.out.println(by4);
		
		
		double sayi5=4.8;
		double sayi6=1.4;
		double sonuc=sayi5/sayi6;
		System.out.println(sonuc);
		
		//sonuc: 3.428571428571429
		
		
		int sonuc2=(int)sonuc;
		System.out.println(sonuc2);
		
		
		int sayi7=5;
		int sayi8=3;
		int sonuc3=sayi7/sayi8;
		System.out.println(sonuc3);
		// data tipi int olduğu için yuvarlama yapmadan sadece tam sayı kısmı çıkar.
		
		
		int sayi9=255;
		byte by5=(byte) sayi9;
		System.out.println(by5);
		// sonuç -1 verdi.
		// Normalde byte da (-128/127)256 sayı var.
		// biz 255 yazdık, bir eksik olunca -1 yazdı.sınırı geçen sayılara 
		// böyle bir mulamele yapıyor.
		// 255 i 256 ya böler kalanı yazar
		
		
				
		
		
		
		

	}

}
