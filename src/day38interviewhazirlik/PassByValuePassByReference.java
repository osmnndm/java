package day38interviewhazirlik;

public class PassByValuePassByReference {
	
	public static void main(String[] args) {
		
		// bir methoda variable yollandığında Java o variable'ın kopyasını oluşturur ve 
		// methoda kopyayı yollar.Bu yüzden variable'ın orjinal değeri method çalıştıktan sonrada
		// aynı kalır. Buna Java'da Pass by value denir. 
		// pass by value da value değişmez, pass by reference'da value değeri değişir, java pass by
		// reference kullanmaz.
		// pass by reference'da ise reference'in kopyası oluşturulur ve methoda yollanır
		// fakat reference'ın kopyasıda kendisi gibi aynı object'i gösterdiği için 
		// orjinal değer değişir.
		
		
		int x = 12;
		increment(x);
		System.out.println(increment(x));
		System.out.println(x);
	}
	
	public static int increment(int a) {
		a = a+1;
		return a;
	}

}
