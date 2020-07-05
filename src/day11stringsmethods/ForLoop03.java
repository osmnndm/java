package day11stringsmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		
		// ilk 4 sayma sayısının çarpımını veren for loop oluşturunuz
		int product=1;
		for(int i=1;i<5;i++) {
			product=product*i;
		}
		System.out.println("Çarpım:"+product);
		System.out.println();
		
		// ilk 5 çift sayma sayısının çarpımını veren for loop oluşturunuz
		int product2=1;
		for(int i=2;i<11;i+=2) {
			product2=product2*i;
		}
		System.out.println("Çarpım:"+product2);
		System.out.println();
		
		// Matematikte 1 er 1 er geri sayım yapıp çarpmaya faktoriyel denir.
		// 6!=6*5*4*3*2*1
		// interview sorusu
		
		
		// 9! i hesaplayan for loop yazınız
		int product3=1;
		for(int i=1;i<10;i++) {
			product3=product3*i;
		}
		System.out.println("9!="+product3);
		System.out.println();
	}

}
