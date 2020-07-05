package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		// StringBuilder class'ı String üretmeye ve üretilen Stringleri manipüle etmeye yarar.
		// String class'ı kullanarak String üretirseniz eğer yaptığınız değişiklikler ilk ürettiğiniz
		// Stringi etkilemez.Ama illaki ilk ürettiğim string değişsin isterseniz atama
		// yapmak zorundasınız.
		// String class'ını kullanarak ürettiğiniz stringler atamasız değiştirilemedeği için
		// String class'ına "immutable" denir.
		// String ile uretilen Stringlerde yapilan degisiklikler 
		// ilk uretilen (orijinal olan) Stringi degistrmezken 
		// StringBuilder ile uretilen Stringlerde yapilan degisiklikler 
		// ilk uretilen orijinal Stringi degistirir. 
		// Yani Stringlerde degisim ilk Stringi etkilemez ama StringBuilderde etkilenir.
		// StringBuilder Class'ını kullanarak String üretirseniz yaptığınız değişiklikler
		// ilk ürettiğiniz STring'i etkiler. Atama yapmaya gerek yoktur.
		// StringBuilder Class'ı değişimi yansıttığı için ona "mutable" denir.
		
		
		String str="Ali";
		str.substring(1); // ==>li
		System.out.println(str);// ==> Ali yazar çünkü atama yapılmadı.
		
		str=str.substring(1);
		System.out.println(str);// li yazar. çünkü atama yapıldı.
		
		// atama yapmadan değişklik uygulansın istiyorsanız StrinBuilder Class'ı kullanılmalıdır.
		StringBuilder strBld=new StringBuilder("Ayşe");
		strBld.append("Can"); // append () methodu String'e yeni bir String eklemek
		// için kullanılır. Concatenation yapar.
		
		System.out.println(strBld);// AyşeCan
		
		
		// 2.YOL
		StringBuilder strBld2=new StringBuilder();
		strBld2.append("Ali Can"); // boş String'e "Ali Can" ekledim.
		
		// 3.YOL
		StringBuilder strBld3=new StringBuilder(7); // uzunluğu 7 chracter olan bir String ürettim.
		strBld3.append("Ali");
		strBld3.append("Kahraman");
		System.out.println(strBld3);
		
		
		
		

	}

}
