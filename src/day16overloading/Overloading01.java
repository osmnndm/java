package day16overloading;

public class Overloading01 { // Overloading aşırı yükleme demektir.

	public static void main(String[] args) {
		
		// ik sayının toplamını ekrana yazdıran bir method oluşturunuz
		
		toplama(7.2,5.3); // Method 4
		toplama(3,2);	 // Method 1
		toplama(7);		// Method 2
		toplama("Ali");	// Method 3
		
// 1. Method ismini değiştirmeden parametreleri değiştirerek aynı isimli methodlar oluşturabilirsiniz.
// 2. Main method içerisine çağrılan method'larda parametrelere bakar 
// 	  hangi	parametre hangi methoda uyuyorsa onu kullanır.
// 3. Parametre sayısı değiştirerek aynı isimli ayrı method oluşturulabilir.
// 4. Parametre sayısını değiştirmeden herhangi bir parametrenin type'ini değiştirerek 
//		isim değiştirmeden ayrı bir method oluşturabiliriz.
// 5. öncelik olarak data typlerden birebir olarak ölçüşene bakar onu çalıştırır, birebir örtüşen yoksa
//		Auto wideninge göre kullanabileceği methoda bakar yoksa hata verir.
// 6. farklı data type'indeki parametrelerin yerlerini değiştirerek te aynı isimli farklı methodlar oluşturabilirsiniz.
		
	} // Method 1
	
	public static void toplama (int num1,int num2) {
		
		System.out.println(num1+num2);
		
	}// Method 2
	
	public static void toplama (int num1) {
		
		System.out.println(num1+num1);
		
	}// Method 3
	
	public static void toplama (String str) {
		
		System.out.println(str);
		
	}// Method 4
	
	public static void toplama (double num1,double num2) {
		
		System.out.println(num1+num2);
		
	}

}
