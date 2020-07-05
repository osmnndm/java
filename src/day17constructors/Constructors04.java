package day17constructors;

public class Constructors04 {
	
	int num1=12;
	static int num2=22;
	
	

	public static void main(String[] args) {
		
		// static methodların içinde sadece static elemanlar kullanılabilir.
		// num1 static olmadığından main method'da static olduğundan 
		// main method içerisinde kullanılamaz.
		// num2 static içinde kullanmamız problem olmuyor.
		// num1++; nın önündeki commenti kaldırırsanız Java num1++; nın altını kırmızı çizer.
		
	//	num1++;
		num2++;
		}
}
