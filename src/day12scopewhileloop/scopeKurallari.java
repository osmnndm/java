package day12scopewhileloop;

public class scopeKurallari {

	int num; // Class variable veya Instance variable
	
	public static void main(String[] args) {
		
		// Scope kapsam demektir. oluşturduğunuz bir variable'i nerelerde kullanabilceğinizi 
		// gösterir.
		// Class'ın içinde bir variable oluşturduğumuz zaman tüm methodlar o variable ulaşabilir.
		// yeterki methodun içinde olmasın, Class'ın içinde olsun.

	}
	
	public void toplama() {
//		int num=12;
//		System.out.println("Toplama");
	}
	
	public void carpma(int num, String str) {
//		System.out.println("Çarpma");
	}

}
// 1. KURAL  
// Class'ın içinde metodları dışında olan variable'ları bütün metodlar 
// istedikleri zaman istedikleri kadar kullanabilirler.
// bu variable'lara "Class Variable" veya "Instance Variable" denir.
// Instance: görünür demektir.
// Class variable'lara değer ataması yapmazsak Java onlara default değerler verir.
// Java tüm sayılar için default olarak 0 değerini verir.

// 2.KURAL 
// Bir metodun içerisinde oluşturulan variable'lar sadece o metodun içinde kullanılabilir.
// o metodun dışındaki metodlar o variable'i kullanamazlar.
// metodun içinde oluşturulan bu variable'lara "Local Variable" denir.
// Body içerisinde oluşturulan variable'lere değer atamak ZORUNDAYIZ.
// Java onlara default value vermez. 

// 3.KURAL
// Metodların parantezleri içerisinde oluşturulan variable'lar Local variable'lar gibi 
// sadece o metodların bodyleri içinde kullanılabilir.
// bu variable'lara "Local Variable" denir.
// Parantez içinde uluşturulan variable'lara ise değer ataması yapmayınız.

// 4.KURAL
// Java yukarıdan aşağı çalışır. value'nin önce tipini tanımlamyıp, ardından değer
// ataması yapılmalıdır yoksa hata verir.
// Bir variable'i kullanmaya başlamadan önce tanımlamalıyız.
// önce num=num+2; sonra int num=12; diyemeyiz.
// int num=12; sonra num=num+2 demeliyiz.


