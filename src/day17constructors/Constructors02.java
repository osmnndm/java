package day17constructors;

public class Constructors02 {

	
		
		// buyume methodu bu class'da değil Constructors01 class'ında. 
		// O yüzden Java kullanmama müsade etmiyor.
		// ama bazen bu methodu kullanmaya ihtiyacımız olabilir böyle bir durumda
		// eğer siz başka bir class'daki methodu kullanmak istiyorsanız 
		// O class'tan bir tane objeckt oluşturup o objekt sayesinde istediğiniz methodu kullanabilirsiniz.
	
		// static yazılmadığı zaman methodlar objelere bağlanıyor. 
		// static yazılırsa methodlar class"a ait olmuş oluyor.
		
		
		
	// 	buyume(33); BU ŞEKİL YAZARSAM HATA VERİR.
	
	public static void main(String[] args) {
		
		Constructors01 obj1=new Constructors01();
		
		obj1.buyume(33);     
		obj1.isimDegistirme("Kemal Can");
		
		// büyüme methodu static olduğundan Java object kullanarak büyüme() methodunu 
		// çağırmamızı istemez ve kodun altını sarı renkle çizer.
		// sarı renk beğenmedim ama çalıştırıyorum demektir. - mekruh-
		
		
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		// Class ismini yazıp "." koyduğumuzda o classtaki Constructor variable'larına ulaşabiliriz.
		// eğer bir Variable veya method static olarak oluşturulmuşsa, o variable yada method'a
		// objekt oluşturmadan sadece class ismini kullanarak ulaşabilirsiniz.
		// static methodları objekct üzerinde çağırmaya gerek yok class ismi üzerinden çağırmak daha pratiktir.
		
		System.out.println(Constructors03.ad); // Ali Can
		System.out.println(Constructors03.kilo); // 33
		
		Constructors03.artirma(45); //
		Constructors03.degistirme("Ayhan Işık"); // Ayhan Işık
		
	}

}
