package day26encapsulation;

public class Cat extends Mammal {
	
	// Cat Class'ının kullanabileceği methodlar: meow, feed, move, eat
	// Dog Class'ının kullanabileceği methodlar: bark, feed, move, eat
	// kardeşler arasında Inheritance olmaz. Dog Class'ında meow methodu kullanılamaz.
	
	public boolean clean = true;

	public static void main(String[] args) {
		Cat cat=new Cat();
		System.out.println("Animal Class'dan geldi: "+cat.age);
		System.out.println("Animal Class'dan geldi: "+cat.name);
		cat.move();
		cat.eat();
		System.out.println("Animal Class'dan geldi: "+cat.dogum);
		cat.feed();
		System.out.println(cat.dogum);
		cat.meow();
		}
	
	public void meow() {
		System.out.println("Kediler miyavlar");
	}

}
