package ajavapracticeokul_hamza;

import java.util.Scanner;

public class OkulSistemiGiris {
	
	/*
	 * Öğretmen, öğrenci ve okul genel bilgilerinden oluşan JAVA programı yazınız.
	 * 
	 * 1. Adım : Okulun sabit bilgilerini içerisine ekleyeceğimiz SabitBilgiler adlı bir class oluşturalım
	 * 			 Buradaki verileri public static final olarak tutalım.
	 * 			 MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	 * 
	 * 2. Adım : Ogretmen adlı bir class oluşturalım.
	 * 			 Bu classta öğretmenin adı, branşı ve telefon numaralarını tutalım.
	 * 			 String isim, brans, telefon ;
	 * 			 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman öğretmenlerin bilgilerini yazdıralım
	 * 
	 * 3. Adım : Ogrenci adlı bir class oluşturalım.
	 * 			 Bu classta pgrencinin adı, okulnumarası bulunsun.
	 * 			 String isim;
	 *   		 int ogrenciNo;
	 *   		 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman ogrencilerin bilgilerini yazdıralım
	 * 
	 * 4. Adım : Ogretmenler adlı class oluşturalım.
	 * 			 Bu classta tüm öğretmenleri tutualım.
	 * 			 İçerisine List<Ogretmen> ogrentmenListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	 * 		     Bu class'ın içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öğretmen ekleyebilelim.
	 * 
	 * 5. Adım : Ogrenciler adlı class oluşturalım.
	 * 			 Bu classta tüm öğrenciler tutualım.
	 * 			 İçerisine List<Ogrenci> ogrenciListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	 * 		     Bu class'ın içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öğrenci ekleyebilelim.
	 * 	 
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println("****OKUL SİSTEMİNE HOŞGELDİNİZ*****");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Okul ismi : " + SabitBilgiler.OKUL_ISIM);
		System.out.println("Okul müdürü : " + SabitBilgiler.MUDUR);
		System.out.println("Telefon No : " + SabitBilgiler.TELEFON_NO);
		System.out.println("Web Adresi : " + SabitBilgiler.WEB_ADRES);
		System.out.println("Teknik Destek : " + SabitBilgiler.TEKNIK_DESTEK);
		
		
		System.out.println("\n****ÖĞRETMEN OLUŞTURALIM*****");
		
		Ogretmen ogretmenSuleymanBey = new Ogretmen();
		ogretmenSuleymanBey.setIsim("Süleyman Alptekin");
		ogretmenSuleymanBey.setBrans("Java");
		ogretmenSuleymanBey.setTelefon("05395353463");
		
		System.out.println("\nİsim : " + ogretmenSuleymanBey.getIsim());
		System.out.println("\nBrans : " + ogretmenSuleymanBey.getBrans());
		System.out.println("\nTelefon : " + ogretmenSuleymanBey.getTelefon());
		
		Ogretmen ogretmenHamza = new Ogretmen();
		ogretmenHamza.setIsim("Hamza Yılmaz");
		ogretmenHamza.setBrans("Practice");
		ogretmenHamza.setTelefon("05435346346");
		
		
		System.out.println("\nİsim : " + ogretmenHamza.getIsim());
		System.out.println("\nBrans : " + ogretmenHamza.getBrans());
		System.out.println("\nOgretmenHamza : " + ogretmenHamza.toString());
		System.out.println("\nTelefon : " + ogretmenHamza.getTelefon());
		
		Ogretmen1 ogretmenAyseHanim = new Ogretmen1("AyseHanım","Selenium","05323534646");
		System.out.println("\nİsim : " + ogretmenAyseHanim.getIsim());
		System.out.println("\nBrans : " + ogretmenAyseHanim.getBrans());
		System.out.println("\nTelefon : " + ogretmenAyseHanim.getTelefon());
		
	}

}
