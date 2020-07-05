package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		
		// Poly: çoklu demek poliklinik gibi
		// Polymorphism : çoklu yapı demek. 
		// Bir metodu çoklu yapı haline getiriyorsanız polymorphism yapıyorsunuz demektir.
		// bir methodu çoklu hale getirmek için Overloading ve Overriding kullanılır.
		// Polymorphism'İ Overloading ile yaparsanız "Compile Time Polymorphism" denir.
		// 			Diğer adı Static Polymorphism'dir.
		// Polymorphism'i Overriding ile yaparsanız "Run Time Polymorphysm" denir.
		// 			Diğer adı Dinamic polymorphism'dir.

	}
	
	public void eat() {
		System.out.println("Ye!");
	}
	
	// Parametreyi değiştirerek Overlaoding yapıp Polymorphism yaptık.
	public void eat(String name) {        
		System.out.println(name+ "Ye!");
	}
	
	class Yeni extends Polymorphism01{
	
	// Body'yi değiştirerek Overriding yapıp polymorphism yaptık.
	public void eat() {
		System.out.println("Lütfen Ye!");
	}
	}
}
