package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		// While  => iken demektir.
		// While I go to school ==> Ben okula giderken.
		// Whie I go to Üsküdür, it rained ==> üsküdara giderken yağmur yağdı.
		
		int num=0;
		
		// () parantez içindeki koşula bakar true ise { } içindekini return eder döner 
		// tekrar while parantezine gider.
		// num 4ten küçük iken body'yi çalıştır.
		while(num<4) {
			System.out.println("Ali");
			num++; // Bu satırı unutursanız while loop sonsuz döngüye girer.program kilitlenir.
		}
// While loop kullanarak 1 den 10a kadar tam sayıları ekrana yazdırınız
		
		int num1=1;
		while(num1<11) {
			System.out.println(num1);
			num1++;
		}
		// while loop kullanarak 1 den 20 ye kadar çift tam sayıları ekrana yazdırınız
		
		int num2=1;
		while(num2<21) {
			if(num2%2==0) {
			System.out.print(num2+" ");}
			num2++;
		}
	System.out.println(" ");
	// while loop kullanarak 5 ten 120 ye kadar 3 ile bölünebilen tam sayıları yazdırınız
		
		int num3=5;
		while(num3<121) {
			if(num3%3==0) {
			System.out.print(num3+" ");}
			num3++;
		}
		
	}

}
