package day27constructorCall01;

public class Dog extends Mammal {
	
	public boolean sadik = true;

	public static void main(String[] args) {
		
		// inheritenceda main method içerisinde object oluşturulunca önce grandparent sonra parent'ın 
		// sırasıyla constructorlarını kullanır ve çalıştırır.
		// kaç tane üst parent varsa hepsini return eder.
		// altta constructor oluşturulunca "Dog();" parentlerda "()" parametresiz ne kadar 
		// constructor varsa hepsini çağırıyor. en büyük atasından aşağıya doğru çalışır.
		// dog: object ismi  Dog():Constructor ismi
		// main methodu içine yazılan methodlar çalışır, yazılmayanlar çalışmaz.
	
		Dog dog = new Dog();
		
	}
	public void bark() {
		System.out.println("Köpekler havlar");
	}
	
	Dog(){
		System.out.println("Dog parametresiz constructor");
	}
	
}
