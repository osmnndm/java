package day26encapsulation;

public class Dog extends Mammal {
	
	// Dog ==> Mammal ==> Animal
	// Dog için bark, feed, move, eat methodları kullanılabilir hale geldi.
	
	public boolean sadik = true;

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Animal Class'dan geldi"+dog.age);
		System.out.println("Animal Class'dan geldi"+dog.name); // Stringler için default değer null
		System.out.print("Animal Class'dan geldi: ");
		dog.eat();
		System.out.print("Animal Class'dan geldi: ");
		dog.move();
		
		System.out.println("Mammal Class'dan geldi: "+ dog.dogum); // true
		dog.feed(); // çocuklarını besler
		
		System.out.println("Dog Class'dan geldi: "+dog.sadik);// true
		dog.bark();

	}

	public void bark() {
		System.out.println("Köpek havlar");
	}
}
