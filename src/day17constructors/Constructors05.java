package day17constructors;

public class Constructors05 {
	
	
	// instance variable aynı classta object oluşturulmadan çağırılabilir.
	// static olmayanlar static içinde kullanılamazlar. bunun için object oluşturmanız lazım.
	// Static bir variable'i object ile çağırırsak çalışır ama tavsiye edilmez,calışır ama
	// compile error gösterir altını sarı olarak çizer.
	// return type yoksa isim class ismi ile aynı ise bu Constructor dır.
	// metod static ise class ismi ile başka bir classtan bu metod çağırılabilir
	// static method içesinde static ile tanımlama yapmıyoruz.
	// local variable'lara değer ataması yapılmak zorunda.
	// Constructor da access modifier olabilir ama return typ olamaz
	// public Constructor05() {} gibi
	// static variable oluşturmanın diğer bir sebebi; 
	// ne kadar az variable kullanılırsa hafızada o kadar az yer kaplar
	// static olunca daha az variable kullanılmış olur.

	public static void main(String[] args) {
		
		Constructors04 obj1=new Constructors04();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);  // num2 static olduğundan object kullanarak 
										// Java istemiyor.
		
		System.out.println(Constructors04.num2); // Class ismi ile çağırınca sarı çizgi kayboldu.

	}

}
