package CumJava_Review_Turkisch;

import java.util.Scanner;

public class day0202 {

	public static void main(String[] args) {
		/*
		 *  scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
        1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
        2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
        3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
                 1983
                 2020        
        5.Adım Raporu aşağıdaki gibi yazdırınız      
                "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
        6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter uzunluklarını içeren bir şifre oluşturunuz
           //Şifre= 37HEi56        
        */
        
		 
		 Scanner scan=new Scanner(System.in);
			System.out.println("Adınızı giriniz");
			String ad=scan.nextLine();
			System.out.println("Soyadınızı giriniz");
			String soyad=scan.nextLine();
			
			System.out.println("doğum yılınızı giriniz");
			int dy=scan.nextInt();
			System.out.println("şimdiki yılı giriniz");
			int yil=scan.nextInt();
			int yas=yil-dy;
			
			System.out.println("Adınız: "+ ad+"   Soyadınız: "+ soyad+"   Yaşınız: "+yas);
			
	//		char ihad=ad.charAt(0);
	//		char ihsoy=soyad.charAt(0);
	//		int shsoy=soyad.charAt(soyad.length()-1);
	//		int uza=ad.length();
	//		int uzs=soyad.length();
			// String sifre=yas+ad.substring(0,1)+soyAd.charAt(0)
	     //   +soyAd.charAt(soyAd.length()-1)+ad.length()+soyAd.length();
	       //  System.out.println("Şifreniz: "+sifre);
//			System.out.println("Şifre= "yas+ ihad+ihsoy+shsoy+uza+uzs);
			
			String sifre=yas+ad.substring(0,1)+soyad.charAt(0)+soyad.charAt(soyad.length()-1)+ad.length()+soyad.length();
			System.out.println("Şifre= "+sifre);
			
		
			
		
	}

}
