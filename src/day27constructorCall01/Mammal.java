package day27constructorCall01;

public class Mammal extends Animal {
	
	public boolean dogum = true;
	

	public static void main(String[] args) {
		
		Mammal mammal = new Mammal();
		Mammal mammal01 = new Mammal(15);
		
	}

	public void feed() {
		System.out.println("Çocuklarını besler");
	}
	
	Mammal(){    // Parent'daki parametresiz constructor'ı çağır demektir.
		super(); 
				 // super() keyword'unu kullanırsanız tekrar parenta git demektir.
			     // super() kullanılacaksa mutlaka ilk satırda olmalıdır.
		         // super() parenta git demektir.
				 // super() ve this() aynı constructor içinde aynı anda kullanılamaz.
				 // çünkü ikisininde ilk satırda olma zorunluluğu var.
		         // aynı class içindeki parametresiz constructorı çağırmak için kullanıyoruz.
				
		System.out.println("Mammal parametresiz constructor");
	}
	
	Mammal(int age){ // inheritance olduğu için önce Animal Class'a gider Animal'da parametreli
					 // constructor olmadığı için aşağı satıra iner
		super(); // tekrar parenta yani Animal Class'ına gider orada parametresiz constructor araştırır.
			     // varsa parametresiz constructor'ı çalıştırır.
		System.out.println("Mammal parametreli constructor");
	}
	
}
