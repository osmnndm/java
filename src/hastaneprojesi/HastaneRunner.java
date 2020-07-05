package hastaneprojesi;


	// HastaneRunner > Hastane Objesi var
	// Hastane > VeriBankasi extends ( hastane child olarak tüm vreleri elde edbiliyor)
	// Hastane > Doktor
	// Hastane > Hasta
	// Hasta > Durum
	// bunları getter ve setter ile oluşturduk böylece bu bilgilere sadece hastane objesi üzerinden
	// ulaşabileceğim, başka şekilde ulaşılabilir olmayacak.
	// Hasta hasta = new Hasta();
	// Hastane içerisinde hasta var, hasta içerisinde de durum var. ben duruma erişmek istiyorsam
	// önce bir tane hastane objesi oluştururum.
	// Hastane hastane = new Hastane(); 
	// sonrada hastanın durumuna erişebilmek için hastane.hasta.durum(); yazarım
	// bu durum üzerinde değişiklik yapmak istiyorsam hastane.setHasta(); methodunu kullanırım.



//Main metodumuzun hazir oldugundan emin olalim
//Main method da iki variable olusturunuz
//String hastaDurumu
//String unvan
//Ve asagidaki custom methodlari olusturunuz
//public static String doktorUnvan(String aktuelDurum) { }
//Sonra sirasiyla asagidaki adimlari takip ediniz
//If aktuelDurum  Allerji return Allergist
//If aktuelDurum  Bas agrisi return Norolog
//If aktuelDurum  Diabet return Genel cerrah
//If aktuelDurum  Soguk alginligi return Cocuk doktoru
//If aktuelDurum  Migren return Dahiliye
//If aktuelDurum  Kalp hastaliklari return Kardiolog
//else return yanlis unvan
//Sonra bu methodunuzu unvan variable iniza atayiniz



public class HastaneRunner {
	
	private static Hastane hastane = new Hastane();
	
	
	public static void main(String[] args) {
		
		String hastaDurumu = "Soguk alginligi";
		String unvan = doktorUnvan(hastaDurumu);
		
		hastane.setDoktor(doktorBul(unvan));
		System.out.println("Doktor ismi: "+hastane.getDoktor().getIsim());
		System.out.println("Doktor soyismi: "+hastane.getDoktor().getSoyIsim());
		System.out.println("Doktor ünvanı: "+hastane.getDoktor().getUnvan());
	
		
		
		}
		
	public static String doktorUnvan(String aktuelDurum) {
		if(aktuelDurum.equals("Allerji")) {
			return hastane.unvanlar[0];
		}else if(aktuelDurum.equals("Bas agrisi")) {
			return hastane.unvanlar[1];
		}else if(aktuelDurum.equals("Diabet")) {
			return hastane.durumlar[2];
		}else if(aktuelDurum.equals("Soguk alginligi")) {
			return hastane.unvanlar[3];
		}else if(aktuelDurum.equals("Migren")) {
			return hastane.unvanlar[4];
		}else if(aktuelDurum.equals("Kalp hastaliklari ")) {
			return hastane.unvanlar[5];
		}
		return "yanlış durum";
		
	}
	
	public static Doktor doktorBul(String unvan) {
		Doktor doktor = new Doktor();
		for (int i = 0; i < hastane.unvanlar.length; i++) {
			doktor.setIsim(hastane.doctorIsimleri[i]);
			doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
			doktor.setUnvan(hastane.unvanlar[i]);
		}
		return doktor;
	}
	
	
	
	

}
