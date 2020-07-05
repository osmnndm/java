package day38interviewhazirlik;

public class InterviewHazirilik01 {
	
	// 1) Java "Platform Independent" (ortamdan bağımsız ) progralama dilidir.
	// yani herhangi bir platformda yazılan Java kodu diğer platformlarda da çalışır.
	// mesela kodu mac'te yazdınız, windowsta da çalışır.
	
	// 2) IDE ==> Integrated Development Enviroment (entger edilmiş kod yazma ortamı)
	// Eclipse ve IntelliJ piyasada kullanılan meshur iki IDE'dir.
	
	// 3) Constructor ==> Yeni bir obje üretilirken Constructor aktive olur ve objeyi üretir.
	// Return type'ı yoktur. İsmi Class ismi ile aynı olmalıdır. Obje üretmek için Constructor 
	// üretmek zorunda değiliz. Çünkü Java her Class için default bir Constructor üretmiştir.
	// Default Constructor'lar parametresizdir. Biz herhang bir Constructor ürettiğimizde default
	// Constructorlar yok olur. Constructor'lar overload edilebilir. Constructor'ların isimlerini 
	// değiştirmeden parametreleri değiştirilebilir. Constructor'ı başka Class'tan çağırabiliriz ama
	// override edilemez, body'yi değiştirmiş oluruz. Constructor'lar child Class'lardan çağırılabilir
	// ama override edilemezler.
	
	// 4) OOP Concept nedir? Object Oriented Programing
	// OOP Concept a) Inheritance b) Encapsulation c) Polymorhism d) Abstraction e) Interface içerir.
	
	// 5) Inheritence nedir?
	// Inheritance parent(super class) -child(sub class) ilişkisidir. A class'I B class'ına extends
	// ederse A child olur, B parent olur. A class'ı B interface'ina extends ederse A child olur, 
	// B parent olursa child parent'taki kodların public ve protected kullanabilir.
	// Reusability(tekrar kullanabilme), short coding, maintenance(tamir) faydaları vardır.
	
	// 6) Encapsulation nedir?
	// Data hiding(data gizleme) demektir.Data'lar private yapılarak gizlenir.
	// gizlenen bu datalar getter ile okunur setter ile update edilir.
	// değiştirilmesini istemediğimiz kodları koruma altına almak için kullanılır.
	// maintenance faydasıda vardır. Bir application yaptık pi sayısını 3 olarak kullanmak
	// istiyoruz, böyle bir durumda pi sayısında kolayca değişiklik yaparız. ama asıl amacı 
	// kodları korumaktır.kodun hiç değiştirilmesini istemiyor, sadece okunmasını istiyorsanız o zaman
	// setter oluşturulmaz. kodun ne değiştirilmesi ne de okunması istenmiyorsa o zaman getter() da 
	// setter da oluşturulmaz.
	
	// 7) Polymorphism nedir?
	// Polymorphism(Çoklu yapı) overloading ve overriding'dir.
	
	// 8) Abstraction Class nedir? 
	// a) Abstract Class üretmek için abstract keyword kullanılır.
	// b) Abstract Class'lardan obje üretilemez.(instantiate-görünürlülük-yapılamaz).
	// c) Abstract Class'larda hem abstract hem de concrete methodlar bulunabilir.
	// d) Abstract methodun olduğu Class kesinlikle abstract olmak zorundadır.
	// e) Abstract methodların(bodysiz) concrete child'lar tarafından override edilme
	// zorunluluğu vardır. Concrete'ler override edilmesede olur.
	// f) Abstract Class'ı child class'ları bazı görevleri bazı görevleri yapmak zorunda bırakmak
	// için oluştururuz.!!! en önemli detay
	
	// 9) Interface nedir?
	// Java normalde multiple inheritance'a müsade etmez bu yüzden abstract Class kullandığımızda
	// multiple Inheritence yapamayız. Fakat bazı projelerde multiple Inherintence kullanmak zorunda 
	// kalırız. Bunu Java bize Interface kullanma hakkı vererek halletmiştir. Çünkü Interface'lere 
	// multiple implement/extends yapılabilir.
	
	// 10) Overloading nedir?
	// method ismi aynı tutularak parametrelerin sayıları, yerleri veya data type'leri değiştirilerek
	// methodlar oluşturmadır. Overloading Compile Time'dır. Yani overloading'te yaptığınız hata kod 
	// yazarken belli olur. Aynı isme sahip methodlarla farklı işlemler yapabilmek için. mesela
	// substring(4) ve substring(4,7) methodlarının fonksiyonları esasında aynıdır. İkiside bir String'in
	// belli bir bölümünü almaya yarar.Fakat bazı durumlarda bitiş indexini söylemek gerekir bazı 
	// durumlarda gerekmez. Bunun için parametreleri farklılaştırırız. Bu da overolading'i doğurur.
	
	// 11) Overriding nedir?
	// method Signatur'a(Method ismi+Parametreler) dokunmadan sadece body'yi değiştirme işlemidir.
	// Overriding inheritance olunca olur. Aynı methodun farklı kullanımları için Overriding gereklidir.
	// Animal da ses() {Ses çıkarır} ==> Dog() {Havlama} == Kedi(){Miyavlama}
	// Overriding Run Time Error verir.
	
	// 12) Array ile ArrayList arasındaki farklar nelerdir?
	// Array oluşturulurken uzunluğu belli edilmek zorundadır ve daha sonra uzunluk değiştirilemez.
	// Fakat ArrayList'lerde başlangıcta uzunluğu belirtme zorunluluğumuz yok, eleman ekledikçe 
	// uzunluk artar, eleman sildikçe uzunluk azalır.
	
	// 13) String ile StringBuilder arasındaki fark nedir?
	// Stringler immutable dır. StringBuilder ise mutable'dır.(değişime açıktır)
	// StringBuilder class'ı daha fazla kullanışlı methodlara sahiptir.
	// mesela bir String'i tersten yazdırmak için kullanılan reverse() methodu gibi
	
	// 14) Access Modifier nedir açıklarmısınız?
	// Bir class'a, variable'a veya method'a ulaşımı düzenler. 4 tane Access modifier vardır.
	// Bunlar; 1) Public: herkes ulaşabilir. 2) Protected:Aynı package içinden ve farklı package'lerdeki
	// child class'lardan ulaşılabilinir. 3) Default: sadece aynı package'dan ulaşılabilinir. 
	// 4) Private: Sadece class içinden ulaşılabilinir.
	
	// 15) Pass by Value ve Pass by Reference ne demektir?
	// bir methoda variable yollandığında Java o variable'ın kopyasını oluşturur ve 
	// methoda kopyayı yollar.Bu yüzden variable'ın orjinal değeri method çalıştıktan sonrada
	// aynı kalır. Buna Java'da Pass by value denir. 
	// pass by value da value değişmez, pass by reference'da value değeri değişir, java pass by
	// reference kullanmaz.
	// pass by reference'da ise reference'in kopyası oluşturulur ve methoda yollanır
	// fakat reference'ın kopyasıda kendisi gibi aynı object'i gösterdiği için 
	// orjinal değer değişir.
	
	// 16) Abstract class ile Interface farkları nedir?
	// Abstract class'lar multiple inheritence'a müsade etmez, Interface'ler eder.
	// Interface'de abstract methodlar olur, concrete methodlar static ve default keyword'ları ile 
	// oluşturulur. Halbuki abstract class'larda normal concrete methodlar bulunabilir.
	
	
	
	
	
	
	

}
