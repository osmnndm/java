package day24varargsaccessmodifiers;

public class Varargs01 {

	public static void main(String[] args) {
		
		// Varargs: Variable Arguments
		// Bir method oluşturduğumuzda argüment olarak istediğimiz kadar
		// kadar argüment girebilmemizi sağlar.
		// int den sonra ... koyunca java bunun Varargs olduğunu anlar.
		// sonu açık olan bir Array gibi düşünebiliriz.
		
		
		countNum(5); // length uzunluğu 1
		countNum(5,7,9); // length uzunluğu 3
		countNum(5,7,8,11,13,15,17,19,21); // length uzunluğu 9
		
		sumNums(1,2,3,4,5,6,7,8,9,10);
		
		printName("Ali","Kahraman");
		printName("Ayşe Yılmaz Kahraman");

	}
	
	public static void countNum(int... a) { // Vararg'ın ismi a
		System.out.println(a.length);
	}
	
	public static void sumNums(double... b) { // Varargs'ın içine koyduğumuz tüm sayıları toplayan prog.
		double sum=0;
		for(double w:b) { // w 0.indexten başlayıp son indexe kadar uygular.
			sum=sum+w;
		}
		System.out.println(sum);
	}
	
	public static void printName(String...n) {
		for(String w:n) {
			System.out.println(w+" ");
		}
		
	}
	
}
