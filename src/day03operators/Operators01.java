package day03operators;

public class Operators01 {

	public static void main(String[] args) {
		
	int i1=12;
	int i2=13;
	int i3=14;
	int i4=15;
	
	System.out.println(i1+i2*i3);
	
	// 1.parantez içi işlemler yapılır.
	// 2. çarhma ve bölmeler yapılır. Carpma ve bölmeden soldaki önce yapılır
	// 3, Toplama ve çıkarmalar yapılır. Toplama ve çıkarmadan soldaki önce yapılır.
				
	System.out.println(i1*i2+i3*i4);
	
	System.out.println((i1+i2)/i4);
		// sonuç 1: 12+13=25   25/15=1.6... sonuc 1 çıkar.
	
	
	System.out.println(i4*(i2+i1/3));
	
	}

}
