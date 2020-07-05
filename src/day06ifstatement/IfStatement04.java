package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// bir tane string variable oluşturun ve bir gün ismini küçük harflerle
		// değer olarak atayın
		// eğer atadığınız değer hafta içi günlerinden biri ise
		// ekrana hafta içi yazdırın
		// değilse hafta sonu yazdırın
		
		String gun = "pazartesi";
		if(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("perşembe") || gun.equals("cuma")) {
			System.out.println("HAFTA İÇİ");
		}
		if(gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("HAFTA SONU");
		}
		
		
	}

}
