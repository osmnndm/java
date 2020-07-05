package day18statickeyword;

public class Test1 {
	
	// for loop'un içerisinde Test1.i static i'yi kullanır.
	// 2 şer olarak artırılan i ise local variable artırır.
	// static i 9 defa çalışıp 9 sayı yazdırır.

	
	static int i=1;
	

	public static void main(String[] args) {
		
		int i=1;
		for (Test1.i=1; Test1.i<10; Test1.i++) {
			i=i+2;
			System.out.print(i+" ");
		}

	}


}
