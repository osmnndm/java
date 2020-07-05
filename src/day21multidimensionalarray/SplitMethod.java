package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		// split bir string methodudur.
		// str.split( ); methodunu seçip parametre içine hangi karakteri yazarsak
		// boşluklara göre Stringi parçalayıp kaç parça olduğunu bize yazar.
		// girilen karakteri çıkarır aradaki kelimeleri sayar.
		// " " koyduğumuzda kelimeler ortaya çıkar. aşağıdak bu şekilde 4 tane String oluşmuş olur.
		// Split methodu kullandığınızda mutlaka bir Array oluşturmunuz gereklidir.
		
		// Kelimeleri sayma
		String str="Ali Can okula basladi";
		
		String kelime[]=str.split(" ");
		
		System.out.println("Cümlemiz: "+str);
		System.out.println("Kelimelerim: "+ Arrays.toString(kelime));
		System.out.println("kelime sayıs: "+ kelime.length);
		
		// harfleri sayma
		String str2="Kahramanmaraş";
		String harf[]=str2.split("");
		
		System.out.println();
		System.out.println("Kelimem: "+str2);
		System.out.println(Arrays.deepToString(harf));
		System.out.println("Harf sayısı: "+harf.length);

	}

}
