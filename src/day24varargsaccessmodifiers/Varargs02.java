package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		
		// VARARGS'IN YANLIŞ KULLANIMLARI
		// Kural 1: Varargs her zaman son parametre olmalıdır. çünkü varargs sonsuz elemana sahip
		// for loop ta varargs bitmiyor ki diğer parametreye geçebilsin.
		// çünkü ilk parametreyi varargs yaparsanız girdinğiniz her değer varargs'ın içine düşer.
		// siz asla ikinci parametreye değer verememiş olursunuz bu nedenle hata verir.
		
		// Kural 2: parametre olarak 1'den fazla varargs kullanamazsınız.
		// çünkü varargs en sonda olmalıdır, en sonda olmak tek olmayı gerektirir.
		
		valueChar("Character",'a');
		valueChar("Character",'b','c');
		
//		product(1);
//		product(3);

	}
	
	public static void valueChar(String s, char... c) {
		for(char w: c) {
			System.out.print(s);
			System.out.println(w);
		}
	}

//	public static void product(int... x, int y) {
//		int product=1;
//		for(int w: x) {
//			product=product*w;
//			System.out.println(product);
//		}
		
//		public static void product1(int... x, int... y) {
//			int product1=1;
//			for(int w: x) {
//				product1=product1*w;
//				System.out.println(product1);
//			}
	}

