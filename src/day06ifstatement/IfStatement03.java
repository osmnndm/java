package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		
		
		// Bir Char variable oluşturup bir büyük harf değer atayın
		// eğer atanan değer haftanın günlerinden herhangi birinin ilk harfi ise
		// o günleri yazdırın.
		// eğer atanan değer haftanın günlerinden herhangi birinin ilk harfi değil ise
		// böyle bir gün yok yazsın.
		
		char gun='C';
		
		if(gun=='P') {
			System.out.println("Pazar,Pazartesi,Perşembe");
			
		}
		if(gun=='S') {
			System.out.println("Salı");
		}
		if(gun=='C') {
			System.out.println("Carsamba,Cuma,Cumartesi");
		}
		if (gun!='P' || gun!='C' || gun!='S') {
			System.out.println("Böyle bir gün yok");
		
			
		
	 // "P" olmamak VEYA "C" olmamak VEYA "S" olmamak ==> VEYA islemi icin || ==> | -> Pipe denir
     // VEYA isleminden True sonucu alabilmek bir tanesinin True olmasi yeterlidir
     // True||True = True <-> True||False = True <-> False||False = False
        // True=1, False=0 ==> VEYA islemi toplamaya benzer
        
        
      // "P" olmamak VE "C" olmamak VE "S" olmamak ==> VE islemi icin &&
     // VE isleminden True sonucu alabilmek icin tum condition'lar true olamalidir
        // True && True = True <-> True && False = False <-> False && False = False
        // True=1, False=0 ==> VE islemi carpmaya benzer
		
		

		
			
		}
		
		

		
		
		
		
		
	}

}
