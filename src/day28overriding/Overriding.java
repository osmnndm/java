package day28overriding;

public class Overriding {

	public static void main(String[] args) {
		
		// Overriding: uyarlamak demektir.
		// Parent'taki bir methodu Child Class'ında 
		// kendimize uyarlayarak kullanmamıza Overriding deniyor.
		// overriding yaparken method ismi ve parametreler değişmemeli. 
		// asla bu signature değiştirilmez.
		// Overriding'de method içerisindeki bodyler { } değiştirilebilir.
		// Parent içindeki method (ses) . bu methoda Method Overridden denir. EZBERLE
		// Child içerisindeki method ses( ). bu methoda Method Overridding Method.
		// 4 Access Modifier var. private, default, protected, public.
		// Overriding yaptığımızda child in access modifier ile aynı olmalı veya daha geniş olmalıdır.
		// Parent Access modifier default olduğunda, 
		// Child Access modifier default, protected, public olabilir.
		// Child Parenta göre durum alır.
		// Parent public olduğunda child default olamaz. Child parent'ı daraltamaz, sınırlandıramaz.
		// IS-A VE HAS-A  Child dan parenta giderken İs-a ilişkis
		// parent'dan child'a gidersek has-a ilişkisi vardır.
		// Dog IS-A Mammal == True  Mammal HAS-A Dog ==> True
		// Return typeları kullanırken bu is-a ve has-a ilişkisi olması lazım.
		// Overriding'de is-a ilişkisi olması lazım.
		// Child daki return type child olması lazım.
		
		// OVERRİDİNG KURALLARI
		// 1) Method signature'ı(name ve parameters) değiştirmeyin.
		// 2) 4 Access Modifier var. private => default => protected => public
		// Overriding yaptığımızda child in access modifier ile aynı olmalı veya daha geniş olmalıdır.
		// 3) Overriding COVARİANT return type olmaldırı. yani İS-A olmaldırı. Child'dakinin return type
		// parent'takinin return type'nın child'i olmalıdır.
		// 4) private,static and final methodları overriding yapılamazlar.
		//  private olan birşey o Class'a özel bir şeydir,Class'a özel olan başka Class'ta kullanılamaz.
		// private overloading yapılabilir.
		// static bütün objelere açıktır, herkese hitap eden bir özelliği var bu özelliği değiştiremezsiniz.
		// final method artık son haline getirilmiş, tamamlanmış, değişime açık değil demektir. overriding olmaz.
		// methodun başına final yazılarak kullanılır.
		
		// OVERRİDİNG KONTROLÜ
		// 1) parent child ilişkisini kontrol et. extends yazıyor mu?
		// 2) method ismi aynımı
		// 3) parametreler aynı mı
		// 4) Accesse Modifier aynı olmalı veya kapsamalı
		// 5) return type'lar int is-a void ? değil false compilation error verir.
		
		// Parametresiz Constructor kullanılmışsa parent varsa önce parent'a gider oradaki 
		// parametresiz constructor'ı çalıştırır.
		
		
//		
//		public void ses() { )// Parent içindeki method. bu methoda Overriding denir.
//			System.out.println("Hayvanlar ses Çıkarır");
//		}
//
//		public void ses() {
//			System.out.println("Kediler miyavlar");
//		}
//		
//		public void ses() {
//			System.out.println("Köpekler havlar");
//		}
	}

}
