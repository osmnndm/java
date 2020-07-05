package arabaprojesiday06;

public class Car {
	
	
		
//		bir class oluşturunuz adı Car olsun
//		içesinde 3 instance variable olsun
		
		protected String make;
		protected String model;
		protected int year;
		
		
		public String arabaMarkasi() {
			return make;
		}
		
		public String arabaModeli() {
			return model;
		}
		
		public int arabaYili() {
			return year;
		}

		
//		sonra 3 tane String return tipinden method oluşturunuz
				
//		arabaMarkasi
//		arabaModeli
//		arabaYili
//		ve iki constructor oluşturunuz
//		1 parametreli
//		1 parametresiz
//		String model
//		int yera
		
//		Son olarak bir object oluşturup methodları main method da print ediniz
		
		public Car() {
			
		}
		
		public Car(String model, int year) {
			this.model = model;
			this.year = year;
		}
		
		public static void main(String[] args) {
			
			Car newcar = new Car();
			System.out.println("Arabanın markası: "+newcar.make);
			System.out.println("Arabanın modeli: "+newcar.model);
			System.out.println("Arabanın yılı: "+ newcar.year);
			System.out.println();
			
			Car car2 = new Car("Mercedes",2019);
			System.out.println("Arabanın markası: "+car2.make);
			System.out.println("Arabanın modeli: "+car2.model);
			System.out.println("Arabanın yılı: "+car2.year);
			System.out.println();
	}
		
		
}
