package ajavapracticeokul_hamza;

public class SabitBilgiler {
	
	
	// eğer nesne üreterek başka bir classtan bilgi almak istiyorsak yada methodlara ve değişkenlere
	// erişmek istiyorsak, verilemizi private yapabilir, onlara public methodlar ile erişebiliriz.
	// buna encapsilation denir.(getter ve setter methodları)
	

	static final String OKUL_ISIM = "Techproed"; 
	// tüm class'lardan herhangi bir obje üretmeye gerek duymadan, extend de etmeden variable'lar 
	// ulaşabilmek için static yaptık.böylelikle programın istediği yerinden ulaşabiliriz.
	// değiştirmeyeceğimiz veriler için final kullanırız.
	// static final => heryerden uluşabilsin ama değiştirilemesin.
	// bir variable ismini static final ise büyük harf ve alt çizgi ile yazılıyor genelde
	
	public static final String MUDUR = "Mesut bey";
	public static final long TELEFON_NO = 03123434355l;
	public static final String WEB_ADRES = "http://techproed.com";
	public static final String TEKNIK_DESTEK = "Nazmi bey";
	public static final String ADRES = "Güneş Dogacak Sokak, 2020 / 7";
	
	// eğer bir class'ın constructor'ını private yapınca başka classlardan ulaşılamaz
	// böylelikle bu Class'tan obje üretilememiş olur.bazı güvenlik önlemleri için kullanılır.
	// Singleton Class deniyor buna
	
	private SabitBilgiler() {
		
	}
	
	

}
