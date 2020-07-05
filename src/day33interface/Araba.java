package day33interface;

public abstract class Araba {
	
//	Interface: arayüz demektir.
//	Interface Access modifier sadece public ve default olabilir.
//	multipleInheritence mümkün değil yani Java'da bir child'in birden fazla parenti olamaz
//	ama bazen bir child'in birden fazla parenti olması gerekebilir 
//	bu sorun Java'da Interface ile çözülmüş.
//	bir çok parent'e ihtiyac duyduğumuzda Interface Animal, Interface Mammal yapıyoruz.
//	böylelikle concrete dog child extends olarak Animal ve Mammal'e ulaşabiliyor.
//	body {} si olan methodlara concrete method, body'si olmayan methodlara abstract method denir.
//	Interface kullanımının diğer bir sebebi yapılması gereken zorunlu methodlar Interface
//	içerisine yazılır, Interface içerisine isteğe bağlı methodları koyamıyoruz, mecburi olan
//	methodlar yazılır.
//	bir child'i birden fazla Inheritence bağlamak için implement yazıp Inheritence isimleri 
//	virgül ekleyerek yazıyoruz. public class LuxHonda extends Araba implements IcAraba, DisAraba {
//	Class ==> Interface : emplements     Class'ları Interface'e bağlamak için emplements
//	Class ==> Class : extends            Class'ları Class'a bağlamak için extends
//	Interface ==> Interface : extends    Interface'leri Interface'lere bağlamak için extends
//	Farklı Interface'lerde aynı isimde farklı Return type'lerdeki metodlar yazılırsa 
//	Compile Time Error verir.
//  Farklı Interface'lerde aynı isim ve aynı Return type'lerdeki metodlar olursa implements durumunda
//	sorun olmaz
//	Farklı Interface'lerde Variable'lar için data type ve isimler aynı ama değerler farklı ise
//	implements durumunda bu variable'lara Interface isimleri ile ulaşabiliriz.
//	Bir variable final ise java onu mavi olarak yazar, onu değişteremeyeceğimi anlarım.
//	Normalde Inheritence içinde sadece abstracat method olabilir demiştik ancak java 8 den sonra
//	bir özellik eklenmiş default ve static ekleyerek {} body li concrete method üretebilme imkanı
//	tanımıştır.
//	public default void döseme() {
//		System.out.println("Interface'de default keyword ile döseme yaptım");
//	interface interface'e child olacaksa extends kullanılır
//	interface'lerin Access modifier'i public ve default olabilir, protected ve private olamaz.
	
	public abstract void move();
	
	public void diesel() {
		System.out.println("Diesel 2.0 Turbo");
	}

	public void benzin() {
		System.out.println("Benzin 3.5 Turbo");
	}
}
