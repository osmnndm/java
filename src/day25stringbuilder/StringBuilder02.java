package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		
		// substring() methodu atama yapmadan Stringi değiştirmez.
		
		StringBuilder str1=new StringBuilder("animals");
		str1.substring(3);
		System.out.println(str1); // ekrana animals yazar
		
//		str1=str1.substring(3); altını çizer hata verir çünkü substring methodu String class'ından
//		gelir ve bir String return eder. halbuki str1 String değil, StringBuilder dır.
//		java data typeleri uyuşmadığından dolayı atamayı kabul etmez.
//		Bu hatadan kurtulmak için iki yol vardır.
//		I.YOL : String classından yeni bir String üretip atama yapınız.
//		II.YOL :str1.substring(3) ifadesini systemoutprintln(str1.substring(3)) 
//		içerisine yazarak yazdırılabilir
		
		String str2=str1.substring(3);
		System.out.println(str2);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1.substring(1,4));
		
		// indexOf methodu beLli bir character'in index'ini return eder
		System.out.println(str1.indexOf("m")); // 3
		
		// length() methodu String Class'ından gelir ve String'in uzunluğunu return eder.
		System.out.println(str1.length()); // 7
		
		// charAt() methodu belli bir indexteki characteri return eder.
		System.out.println(str1.charAt(5)); // animals da index i 5 olan l harfidir . l return eder.
		
		// insert () methodu istenen indexe istenen characteri ekmeleye yarar.
		// insert () methodu append() gibi StringBuilder'i direkt değiştirir.
		
		str1.insert(0, "X");
		System.out.println(str1); // Xanimals
		
		// delete() methodu istenen index aralığındaki characteri siler.
		str1.delete(0,1); // StringBuilder classından geldiği için 
		                 //atama ihtiyacı duymadan direk değiştirir.
		
		// deletCharAt(); istenen indexteki characteri siler.
		str1.deleteCharAt(6);// s harfini silmeli
		System.out.println(str1);// animal
		
		// reverse() Stringi tersten yazdırır.
		str1.reverse();
		System.out.println(str1);// lamina
		
		//toString() methodu StringBuilder'i String'e çevirmek için kullanılır.
		str1.toString();
		System.out.println(str1);// str1 artık StringBuilder değil String'dir.
		
		//StringBuilder Java'nın 5.versiyonunda oluşturuldu.
		//StringBuffer'lar StringBuilder'ların eski versiyonudur.
		//Stringbuilder'lar daha hızlı çalışır.
		//Bu yüzden StringBuiledr kullanmayı tercih edelim.
		
		
		
	}

}
