package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		
		// Abstract: soyut
		// Concrete: somut-beton
		
		// abstract class'lar obje üretemeyen class'lardır.
		// Bir Abstract Class'dan obje üretilemez, Constructor'ları yoktur.
		// public abstract class Animal(){} ==> Animal animal = new Animal(); 
		// new Animal altını çizer hata gösterir. obje üretilemez çünkü
		// abstract method {} body si olmayan methoddur.
		// body si olmayan methodlara abstract method denir.
		// bizim şu ana kadar bildiğimiz method lar body si olan Concrete methodlardı
		// ikisi arasındaki fark birisinde body si var ne yapılacağı tarif ediliyor.
		// diğerinde body si yok ne yapılacağı tarif edilmiyor. yapılacak işin ismi söylenir
		// nasıl yapılacağından bahsedilmez.
		// Abstract class concrete ve abstract child'i olur ama child'in içinden parent'daki abstract
		// methodlar mutlaka override edilmelidir. override: bir methodun body si değiştirilerek yapılır.
		// Child abstract ise herhangi bir override zorunluluğu yok.
		// araba için abstract class oluşturdunuz, motorun çalışması gibi zorunlu methodlar vardır.
		// bütün arabalar motoru çalışır olması lazım, bunun için Child Class'lar override ederek mecburen 
		// motor methodunu kullanıp bunu çalıştırması istenir yoksa child olarak kabul etmez.
		// abstract olunca bu method mutlaka bulunmak zorunluluğu koyulmuş oluyor.
		// concrete class ın icine abstract method konmaz,sadece concrete konur.
		// Abstract Class'lar concrete(body'li) ve abstract(body'siz) methodlar içerebilir.
		// abstarct methoda body koymaya calısırsam CompiletimeError alırım.
	    // concrete methoda body koymazsam CompiletimeError alırım.
		// Abstract Class'ların hem concrete class hem de abstract Class olan child'leri olabilir.
		// Abstract Class'ın child'i concrete class ise Abstract class'daki abstract methodalrı
		// mutlaka override etmeli ve onlara body eklemelidir.
				// ==> bunun faydası şudur; child Class'larda mecburen olması gereken methodları 
				//                          bu şekilde belirlemiş oluruz.
		// Abstract Class'ı child'i abstract Class ise Abstract Class'daki herhangi bir şeyi 
		// override etmek zorunda değildir.
		// Java’da kalıtım(inheritence) bir sınıfın kendine ait özellikleri başka bir sınıfa 
		// aynen aktarması ya da bazı özelliklerin kullanılmasına diğer sınıflara izin vermesidir.
		
	
	}
	
	public void concreteMethod() {
		System.out.println("Ben concrete'im");
	}

	public abstract void abstractMethod();
	
}
