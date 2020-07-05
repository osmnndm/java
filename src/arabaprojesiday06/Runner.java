package arabaprojesiday06;

public class Runner {
	
	public static void main(String[] args) {
		
		// polymorphism : Car araba1 = new Toyota();
//		   Car araba1 ==>	reference type  new Toyota() ==> obje type denir.
		
		Car araba1 = new Honda(); // Honda objectinde ne varsa onu getirir. buna polymorphism deniyor.
		// Car class'ı ayrı bir yerde, Honda obje si ayrı bir yerde
		// Car Class'ında Honda Class'ndaki aynı methodlar olduğu için çağırabiliyoruz.
		// buna polymorphism deniyor.
		// en başa parent Class Car'ı yazarsam lazım olduğunda Honda'dan lazım olduğunda da Toyota'dan
		// istediğimizi çağırabiliriz.
		
		
		
		
		System.out.println(araba1.arabaMarkasi());
		
		Car araba = new Toyota(); 
		System.out.println("Arabanın markası"+ araba.arabaMarkasi());
		System.out.println("Arabanın modeli: "+ araba.model);
		System.out.println("Arabanın yılı: "+ araba.year);
		System.out.println();
		
		Car araba3 = new Honda("Yaris", 2020);
		System.out.println("Arabanın markası"+ araba3.arabaMarkasi());
		System.out.println("Arabanın modeli: "+ araba3.model);
		System.out.println("Arabanın yılı: "+ araba3.year);
		System.out.println();
		
	}

}
