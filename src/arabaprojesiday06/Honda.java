package arabaprojesiday06;

public class Honda extends Car {
	
//	bir class oluşturunuz adı Honda olsun
//	içesinde 3 instance variable olsun
	
	protected String make = "Honda";
	protected String model = "Accord";
	protected int year = 2012;
	
	// buraya @override yazarak override yapıp yapmadığını kontrol edebilirim.
		public String arabaMarkasi(){
		return make;
		}
		public String arabaModeli() {
		return model;
		}
		public int arabaYili () {
		return year;
		}
//	sonra 3 tane String return tipinden method oluşturunuz
			
//	arabaMarkasi
//	arabaModeli
//	arabaYili
	
//	Son olarak bir object oluşturup methodları main method da print ediniz
	
	public Honda() { // Parametresiz Constructor oluşturduk
		
	}
	
	public Honda(String model, int year) { // Parametreli Constructor oluşturduk
		this.model = model;
		this.year = year;
	}
	
	
	public static void main(String[] args) {
		
		Honda newHonda = new Honda();
		System.out.println("Arabanın markası: "+ newHonda.make );
		System.out.println("Arabanın modeli: "+ newHonda.model);
		System.out.println("Arabanın yılı: "+ newHonda.year);
		
		System.out.println();
		
		Honda honda2 = new Honda("Civic", 2014);
		System.out.println("Arabanın markası: "+ honda2.arabaMarkasi() );
		System.out.println("Arabanın modeli: "+ honda2.model);
		System.out.println("Arabanın yılı: "+ honda2.year);
		

	
	}
}
