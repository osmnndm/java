package ajavapracticeday09;

import java.util.ArrayList;
import java.util.List;

public class Kutular {
	
//	 * 3. Adım : Kutuları ekleyebilmek, ve kutular üzerinde işlemler yapabilmek için Kutular classı oluşturulım
//	 * 			 Oluşturduğumuz tüm Kutu nesnelerini Kutular a ekleyelim.
//	 * 			 Bunun için Kutular class'ı içerisinde çeşitli methodlar oluşturalım.
//	 * 			 Ayrıca yapımcinin teklifini de bu class içerisinden alalım.
//	 * 
//	 * 			 public void kutuEkle(Kutu kutu)
//	 * 			 kalanKutuSayisiniAl() 
//	 * 			 kutulardakiToplamParaMiktari()
//	 * 			 secilenKutuyuKutularListesindenKaldir(int kutuNumarasi)
//	 * 			 public String acilmamisKutulariGoster()
//	 * 			 public void kutuActir(int kutuNumarasi)
//	 * 			 public int yapimcininTeklifAl(Kutular kutular , int kendiParaMiktarim)

	
	private List<Kutu> kutuListesi = new ArrayList<>();
	
	public void kutuEkle(Kutu gelenKutu) {
		kutuListesi.add(gelenKutu);
	}
	
	public int kalanKutuSayisiniAl() {
		return kutuListesi.size();
	}
	
	public int kutulardakiToplamPara() {
		int toplamPara = 0;
		
	for(Kutu kutu : kutuListesi) {
		toplamPara +=kutu.getKutudakiParaMiktari();
	}
	return toplamPara;
	
	}
	
	public String acilmamisKutulariGoster() {
		String acilmamislar="";
		
		for(Kutu kutu : kutuListesi) {
			acilmamislar +=" " + kutu.getKutuNumarasi();
		}
		return acilmamislar;
	}
	
	public void kendiKutumuKaldir(int kutuNumarasi) {
		for(Kutu kutu: kutuListesi) {
			if(kutu.getKutuNumarasi()== kutuNumarasi) {
				kutuListesi.remove(kutu);
				break;
			}
		}
				
	}
	
	
	public void kutuActir(int kutuNumarasi) {
		for(Kutu kutu: kutuListesi) {
			if(kutu.getKutuNumarasi()== kutuNumarasi) {
				System.out.println("Kutudaki Para Miktarı : " + kutu.getKutudakiParaMiktari());
				kutuListesi.remove(kutu);
				break;
			}
		}
				
	}
	
	public int teklifAl() {
		return kutulardakiToplamPara() / 7 ;
	}
}
