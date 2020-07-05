package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca "İlk harf". B harfini bulunca "İkinci harf"
		// C harfini bulunca "Ücüncü harf", D harfini bulunca "Dördüncü harf"
		// yazdıran programı if else if( ) ve switch () kullanarak yazınız.
		
		char harf='A';
		
		// 1.yol==> if else if
		
		if(harf=='A') {
			System.out.println("İlk harf");
		}else if(harf=='B') {
			System.out.println("İkinci harf");
		}else if(harf=='C') {
			System.out.println("Üçüncü harf");
		}else if(harf=='D') {
			System.out.println("Dördüncü harf");
		}else {
			System.out.println("Bilmiyorum");
			
	
			
		}
		
		// 2.Yol ==> switch()
		
		switch(harf) {
			case 'A':
				System.out.println("İlk harf");
				break;
				
		// üst satırın açılımı: A durumu olduğunda bunu yap dışarı çık.
		// ikiden fazla else if varsa switch kullanılır.
			case 'B': 
				System.out.println("İkinci harf");
				break;
			case 'C':
				System.out.println("Üçüncü harf");
				break;
			case 'D':
				System.out.println("Dördüncü harf");
				break;
			default:
				System.out.println("Bilmiyorum");
		}
	
	} 

}
