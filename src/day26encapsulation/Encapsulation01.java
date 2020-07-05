package day26encapsulation;

public class Encapsulation01 {
	
	private String kimlikNo="34298567399";
	private int krediKartNo= 12345678;
	private boolean soguk = true;

	public static void main(String[] args) {
		
		// programcılıkta herşeyi herkesin görmesi iyi değildir.Program kodları 
		// herkese açık olunca başkaları içine girip değişiklik yapıp programı bozabilir.
		// program yazarken bazı şeyleri mesela variable'lerı saklamak isteriz.
		// bu saklama işlemi başkalarına kapalı iken bizim için açık, ulaşılabilir olmalı.
		// Encapsulation data saklama(data-hiding) yöntemidir.
		// Encapsulation iki stepte yapılır.
		// 1) Data'yı(Variable, method) private yapmalısınız.Bu şekilde başkaları ulaşamaz.
		// 2) bu sakladığım dataya kendim ulaşabilmem için 
		// public olan getter() ve setter() methodlar üretmeliyim
		// getter()methodu data'yı sadece okumamıza yarar, getter() methodu data'da değişiklik yapamaz.
		// setter() methodu data'yı değiştirmemize yarar.
		
		// GETTER() METHODU ÜRETMEK
		// getter üretmek için 1) Access Modifier public olmalı.
		//					   2) Return type'i variable'in return type'i ile aynı olmalı.
		//					   3) Method ismi "get+variable ismi" şeklinde olmalı
		// return type boolean ise getter() method ismi "is" ile başlar "get" kullanılmaz.
		
		// SETTER() METHODU ÜRETMEK
		// Datayı değiştirmek için kullanılır.
		// void iki yerde kullanılır. konsola yazdırma ve action'larda kullanılır.
		// void kullanılınca return kullanılmaz.
		// setter() methodun data type'i her zaman void'dir. action için.
		// parametre yerine mutlaka birşey yazılmalıdır.
		// setter() üretmek için;
		// 1) Access modifier public olmalı
		// 2) Return type void olmalı.
		// 3) Method ismi "set+variable ismi" şeklinde olmalı
		// 4) Parametre kullanılmalı()
		// 5) setter() methodların ismi boolean'lar içinde set ile başlar.
		
		
	}
	
	public String getKimlikNo() {
		return kimlikNo;
	}

	public int getKrediKartNo() {
		return krediKartNo;
	}
	
	public boolean isSoguk() {
		return soguk;
	}
	
	
	
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo =kimlikNo;
	}
	
	public void setKredikartNo(int krediKartNo) {
		this.krediKartNo = krediKartNo;
	}
	
	public void setSoguk(boolean soguk) {
		this.soguk = soguk;
	}
	
}
