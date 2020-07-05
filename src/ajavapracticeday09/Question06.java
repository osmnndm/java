package ajavapracticeday09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question06 {
	
	/*	While döngüsü kullanarak taş kağıt makas oyununu yazınız.
	 *
	 * 1. Adım : TAŞ = 0, MAKAS = 1, KAĞIT = 2
	 * 2. Adım : 3 kere kazanan çıkana kadar while döngüsünü devam ettir.
	 * 3. Adım : While döngüsü içerisinde, bilgisayarın tahminini rastgele oluştur.
	 * 4. Adım : While döngüsü içerisinde, her seferinde kullanıcıdan sayı girmesini
	 * 			 iste.
	 * 5. Adım : Her tahmin sonunda kazananı yazdır, ve kazananın kazanma sayısını
	 * 			 1 artır.
	 * 
	 * ihtimaller: kullanıcı taşı, bilgisayar makası seçerse > taş kazanıyor
	 * 			   kullanıcı taş, bilgisayar kağıtı seçerse > kağıt kazanıyor
	 * 		       kullanıcı makas, bilgisayar kağıt seçerse >makas kazanıyor
	 * 			   aynı olursa kazanan yok
	 * */
	
	
	public static void main(String[] args) {
		
		int kazanmaSayiKullanici =0;
		int kazanmaSayiBilgisayar = 0;
		int bitis = 3;
		Scanner scan = new Scanner(System.in);
		
		List<String> liste = new ArrayList<>();
		liste.add("TAŞ ");
		liste.add("MAKAS ");
		liste.add("KAĞIT ");
		
		System.out.println("TAŞ=0, MAKAS=1, KAĞIT=2");
		
		while(kazanmaSayiBilgisayar<bitis && kazanmaSayiKullanici<bitis) {
			
			int bilgisayarinTahmini = new Random().nextInt(3);// 3 ten daha küçük sayı üretecek 0 1 2
			
			System.out.println("Lütfen tahmininizi yazınız : ");
			int kullanıcınınTahmini = scan.nextInt();
			
			System.out.println("Bilgisayar : " + liste.get(bilgisayarinTahmini));
			System.out.println("Kullanıcı : " + liste.get(kullanıcınınTahmini));
			
			if(bilgisayarinTahmini == kullanıcınınTahmini) {
				System.out.println("Beraberlik");
			}else if( (kullanıcınınTahmini == 0 && bilgisayarinTahmini == 1) || 
			(kullanıcınınTahmini ==1 && bilgisayarinTahmini == 2) || (kullanıcınınTahmini == 2 && bilgisayarinTahmini == 0 )){
				System.out.println("KULLANICI KAZANDI");
				kazanmaSayiKullanici++;
			}else {
				System.out.println("BİLGİSAYAR KAZANDI");
				kazanmaSayiBilgisayar++;
			}
		}
		
		System.out.println();
		System.out.println("BİLİGSAYAR: " + kazanmaSayiBilgisayar + "\nKULLANICI: " + kazanmaSayiKullanici);
		
		scan.close();
		
		
	}

}
