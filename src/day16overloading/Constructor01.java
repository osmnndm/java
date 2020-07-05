package day16overloading;

public class Constructor01 {

	
		
		// Objeckt nasıl üretilir.
		// Consructor: inşaatçı, usta, yapıcı, kalıp demektir.
		// Consructor Classtan object oluşturmaya yarayan şeye denir.
		// bir method değildir, variable değildir
		// bir kod parçasıdır.
		// Constructor Class'ın body'si içinde olmalıdır.
		// Constructor'ın ismi Class'ın ismi ile aynı olmalıdır.
		// Constructor'larda return type olmaz.
		// Consructori hangi Classta ürettiğimi unutursam 
		// cmd tuşana basıp constructor ismine tıklarsam üretildiği class'a götürüyor.
		// aşağıda objekt oluşturup default Constructor kullanıyoruz.
	
		
		int price = 20000;
		int year= 2020;
		String make="Honda";
		String type="Civic";
		
		public static void main(String[] args) {
		
		Constructor01 hondaAraba=new Constructor01();  // bir tane objeckt üretildi.
		
		// isimden önce data type yazılır. int, String gibi. bu primitive data typlerdir 
		// bunları java üretmiştir.
		// yukarıdaki Constructor01 de bir data typedir. non primitive dir. biz üretmiş olduk.
		// bu şekilde istenildiği kadar data type üretilebilir.
		// new objekct üretmeye yarar. ne zaman objeckt üretmek istersek new yazmamız gerekiyor. 
		// bir yerda new görüyorsak orada objekt üretilmiş demektir.
		// Constructor01() en sondaki bu kelime javaya bu kalıpla bir objekt üret demektir.
		// hondaAraba yazıp nokta koyduğumuzda seçenekleri görürüz.
		// bir insan Class oluşturuyorsa Objeckt üretmek içindır. 
		// Java Classla beraber bir constructor oluşturur.
		// buna "default constructor" denir.
		// default Constructor'larda parametre olmaz.
		// Scanner scan=new Scanner(System.in); içinde System.in şekinde bir parametre olduğundan
		// default Constructor değildir.
		// Default Constructor Class oluşturulduğu anda Java tarafından oluşturulur. 
		// Biz kendimiz bir Constructor oluşturduğumuzda Java default Constructor'ı imha eder.
		
		
		System.out.println(hondaAraba.price);
		System.out.println(hondaAraba.year);
		System.out.println(hondaAraba.make);
		System.out.println(hondaAraba.type);
	

	}

}
