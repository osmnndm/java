package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		
		// Constructor02 Class'ı içinden Constructor01 Classından bir Constructor alıyoruz.
		// her objeckt'e oluşturulduğu classtan nokta ile seçenekler bulabiliriz, 
		// başka classta bunlara ulaşılmaz.
		// ama objekt ismi ile constructorı çağırabiliyoruz.
		
		// Başka bir Class'tan ürettiğimiz Objeckt'i object ürettiğimiz class'da kullanabiliriz.
		// Objeckt(in özelliklerini değiştirebiliriz, fakat bu değişim sadece o object ile
		// sınırlı kalır. yeni üretilecek olan objektler bu değişimden etkilenmez.
		// Eğer üretilecek her Objekt'in değişime uğramış olmasını istiyorsanız 
		// class'daki özelliklerini değiştirmelisiniz.
	
		Constructor01 hondaAraba01=new Constructor01();
		System.out.println("Zamlı fiyat: "+ (hondaAraba01.price+1000)); // Arabanın fiyatına zam yaptık.
		
		System.out.println("Year: "+ (hondaAraba01.year-1));
		System.out.println(hondaAraba01.make.replace("Honda", "Toyota"));
		System.out.println("Type: "+ hondaAraba01.type.replace("Civic", "Camry"));
		
		// üstte yapılan değişikliler eski kalıbı bozmaz. bu değişiklikler sadece yukarıya münhasırdır.
		
		Constructor01 hondaAraba02=new Constructor01();
		System.out.println("Zamlı Fiyat: "+(hondaAraba02.price));

	}

}
