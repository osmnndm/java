package ajavapracticeday05;

public class HarfTekrari {
	
	public static void main(String[] args) {
		
		
//		Bir method olusturunuz charSayisi ve 2 parameter ekleyiniz
//		1- char
//		2- String
//		char ch = 'p';
//		String str = “Ingilizce’de purple mor ve people insanlar demektir";
//		int count = 0;
//		Yukaridaki String te elinizdeki char ne kadar tekrar etmisse o kadar return etsin
//		for loop, increment ve if statements kullanabilirsiniz
		
		String ch ="p";
		String str = "İngilizce'de purple mor ve people insanlar";
		
		String arr []=str.split(ch);
		System.out.println(arr.length-1);

		// bu method çok sağlam değil en sona p harfi gelmiş olsa hatalı sonuç verir.
	}

}
