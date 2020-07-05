package day11stringsmethods;

public class StringMethods04 {

	public static void main(String[] args) {
		
		// valueOf() rakamlarla oluşturulan Stringleri sayıya dönüştürür. 
		// böylece rakamlarla oluşturulan stringlerle matematiksel işlemler yapılabilmesini sağlar.
		// Value of hem Integer wrapper classınınn içinde hemde String içinde var.
		// Integer wrapper Classının içinde olan valueof() methodu String'i integer'a çevirir.
		// String'in içindeki valueof() methodu integer'i String'e çevirir.
		
		String paraErkek="1900";
		String paraKadın="2000";
		
		// Bu ailenin toplam gelirini bulunuz
		
		System.out.println(paraErkek+paraKadın); // 19002000
		System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKadın));
		
		// maasErkek ve maasKadın sayılarını String'e dönüştürün ve concaenation yapın.
		
		int maasErkek=1900;
		int maasKadın=2000;
		//3900
		
		System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKadın));
		//19002000
		

	}

}
