package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {
		
		// parantez içindeki koşul(condition) doğru ise body içerisindeki komutu 
		// çalıştırır. değilse bir  sonraki satıra geçer
		
		if(3>2) { System.out.println("if body çalıştı");
			
		}
		
	
		// bir int variable oluşturup ona bir değer atayın
		// eğer atadığınız değer pozitif ise ekrana pozitif yazdırın
		// eğer atadığınız değer negatif ise ekrana negatif yazdırın
		// eğer atadığınız değer sıfır ise ekrana nötr yazdırın
		
		int num1=12;
		
		if(num1>0) {
			System.out.println("Pozitif");}
		if(num1<0) {
			System.out.println("Negatif");}
		if(num1==0) {
			System.out.println("Nötr");
		}

		
		
		
		
		
		
	}

}
