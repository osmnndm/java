package arabaprojesiday06;

public class Toyota extends Car {
	
//	bir class oluşturunuz adı Honda olsun
//	içesinde 3 instance variable olsun
	
	protected String make = "Toyota";
	protected String model = "Corolla";
	protected int year = 2009;
	
	
	public String arabaMarkasi() {
		return make;
	}
	
	public String arabaModeli() {
		return model;
	}
	
	public int arabaYili() {
		return year;
	}
	
	public Toyota() {
		
	}
	
	public Toyota(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	// parametreli constructor oluştursak bile bir tane parametresiz constructor oluşturmak lazım
	// kullanıcı bunu bilmeyebilir.
	
//	sonra 3 tane String return tipinden method oluşturunuz
			
//	arabaMarkasi
//	arabaModeli
//	arabaYili
	
//	Son olarak bir object oluşturup methodları main method da print ediniz
	
	
	public static void main(String[] args) {
		
		Toyota newToyota = new Toyota();
		System.out.println("Arabanın Markası: "+ newToyota.arabaMarkasi());
		System.out.println("Arabanın Modeli: "+ newToyota.model);
		System.out.println("Arabanın yılı: "+ newToyota.year);
		
		System.out.println();
		
		Toyota toyota2 = new Toyota("Corona", 2015);
		System.out.println("Arabanın Markası: "+ toyota2.arabaMarkasi());
		System.out.println("Arabanın Modeli: "+ toyota2.model);
		System.out.println("Arabanın yılı: "+ toyota2.year);
		
		System.out.println();
		
		
		
	}
	
	

}
