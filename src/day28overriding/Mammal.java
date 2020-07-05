package day28overriding;

public class Mammal extends Animal {

	public boolean birth = true;
	public String name = "Kedi";
	
	public static void main(String[] args) {
		
		Mammal mammal = new Mammal(); // önce parente gider parametresiz constructor arar 
									  // orada birşey olmadığından işlem yapamaz döner Mammal() 
									  // Constructora gider this.bird ü yazdırır.
									  // sonra feed methoduna gider, Yavrularını besler yazdırır.
									  // sonra Animal'daki age variable'ına gider onu yazdırır.
									  // . yazıp methodlar çıktığında yanında parantez işareti varsa
									  // bu methoddur. yoksa bu variable dır. ayrıca yan tarafında 
									  // bu method veya variable'ın hangi Class'ta olduğunu görebiliriz.
									  // sonra move methodunu yazdırır.
		

	}

	public void feed() {
		System.out.println("Yavrularını besler");
	}
	
	public Mammal() {
		System.out.println(this.birth); // true
		this.feed();
		System.out.println(this.age); // this. yazınca bu Class'a ait kullanabileceğimiz gerek bu class
									  // gerekse parent'taki methodları gösterir.
		this.move();
		System.out.println(this.name); // parent Class Animal'dada variable name var, 
									   // bu Class'dada name var.
									   // this kullanınca normalde ikisinide göstermesi lazım 
									   // ama iki taraftada aynı isimli olunca this öncelikli 
									   // olarak içinde bulunduğu class'dakini gösterir.
	
	// this hem içinde bulunduğunuz class hem parent class'larraki 
	// method ve variable'lara ulaşmamızı sağlar.
	// Parantezsiz super ise sadece parent'lardaki variable ve methodlara ulaşmanızı sağlar.
	// Parent super kullanarak ulaşmak daha güvenlidir. çünkü child ve parent'lardaki aynı isimli 
	// variable methodlarda problem yaşayabilirsiniz.
	// bu nedenle genel kullanımdak this class içindekiler için, super parent 
	// içindekiler için kullanılır.
		
		System.out.println(super.age); // 4
		System.out.println(super.name); // Karabas
		super.move(); // Hayvanlar hareket eder.
	}
}
