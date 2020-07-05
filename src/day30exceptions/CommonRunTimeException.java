package day30exceptions;

public class CommonRunTimeException {
	
	public static void main(String[] args) {
		
		//    COMMEN RUN TİME EXCEPTİONS
		// 1) ArithmeticException: System.out.println(12/0);
		// 2) ArrayIndexOutOfBoundsException : illegal index durumunda, olmayan index istendiğinde
		//    int arr[] = {a,b,c} System.out.println{arr[12]); olmayan 12.indexi yazdır diyor.
		// 3) ClassCastException : String'i integer'a çevirme. 
		//    String name = "Ali";
		//    Integer number=(Integer) name;   Run Time Exception verir.
		// 4) IllegalArgumentException: bir insanın yaşından bahsediyorsunuz -3 diyorsunuz.
		//    if(yumurtasayısı<0){
		//       throw new IllegalArgumentException("yumurta sayısı negatif olmamalı")
		//    normalde java bunun hatalı olduğunu anlamaz biz throw new ile hata mesajı oluşturuyoruz.
		// 5) NullPointerException: String name = null;
		//							public void printLength(){
		//								system.out.println(name.length());
		//								}  String'e null atandığı veya String instance variable'a 
		// değer atanmadığı zaman length() methodu çalışmaz ve NullPointerException alırsınız.
		// 6) NumberFormatException: int num = Integer.parsenlnt("abc");
		//    Bir String'i integera çevirmeye çalışırken ortaya çıkan exception'dır.
		
		
	}
}
