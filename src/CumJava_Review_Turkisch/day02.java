package CumJava_Review_Turkisch;

import java.util.Random;
import java.util.Scanner;

public class day02 {

	public static void main(String[] args) {
		// verilen iki sayının yerlerini değiştiriniz
	/*	
		int num1=11; // ==> 33
		int num2=33; // ==>11
		
		System.out.println("__Değişiklik öncesi___");
		System.out.println("1.Sayı= "+num1);
		System.out.println("2.Sayı= "+num2);
		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		
System.out.println("__Değişiklik sonrası___");
System.out.println("1.Sayı= "+num1);
System.out.println("2.Sayı= "+num2);
		

 //*** interview question***
// Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz

int  x = 50; //=>10
int  y  = 10; //=>50
System.out.println("ilk durum");
System.out.println("x= "+x);
System.out.println("y= "+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("son durum");
System.out.println("x= "+x);
System.out.println("y ="+y);

*/


/*

//0 ile 1000 arasında random(rastgele) bir sayı oluşturarak 
 * bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?	
//random sayi= 185  toplamları = 14



 

// int randomSayi=(int)(Math.random()*10)+10; // 10 ile 19 arası değerler
// Random random=new Random(); // Random üzerine gelip import yapıyoruz.

//int randomSayi=random.nextInt(1000);
// Random r=new Random()*1000; //0 ile 999 arası rastgele sayı atıyor.
		
int num=(int)(Math.random()*1000);
System.out.println("Rastgele atanan sayı= "+num);
int yuz=num%100/10;
int toplam= num%10+num/100+yuz;
System.out.println(num+" sayısınının rakamları toplamı= "+ toplam);





 scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
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
        
		












	}

}
