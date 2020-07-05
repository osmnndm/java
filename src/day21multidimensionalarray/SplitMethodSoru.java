package day21multidimensionalarray;

public class SplitMethodSoru {

	public static void main(String[] args) {
		
		// Verilen bir cümledeki boşluklar hariç karakter sayısını bulunuz
		// her zaman boşluk sayısı kelime sayısından bir eksiktir.
		
		// 1.YOL
		String str1="karakter sayısını bulma";
		str1=str1.replace(" ", "");
		String harf[]=str1.split("");
		System.out.println(harf.length);
		
	//	2.YOL
		//Bosluk sayisi kelime sayisindan bir azdir
	    //Bosluk sayisi = Kelime sayisi - 1
	    String str2 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
	    
	    String kelime[] = str2.split(" ");
	    int boslukSayisi = kelime.length - 1;
	    System.out.println();
	    System.out.println(boslukSayisi);
	    
	    String character[] = str2.split("");
	    System.out.println(character.length - boslukSayisi);

	}

}
