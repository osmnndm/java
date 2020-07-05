package day31abstraction;

public class Abstraction02 extends Abstraction01{
	
	// Abstraction01 abstract class oldugundan herhangi bir override 
	// zorunlulugu yok. Compile Time Error almiyorum
	// ama Abstraction02 concrete Class olduğundan ve bu Class’ı abstract bir Class olan 
	// Abstraction01’in Classı yapmak için yanına extends Abstraction01 yazarsam altını çizer 
	// ve hata verir.
	// Abstract bir Class içinde abstract bir method var bunu inherit etmediğimizden hata veriyor.
	// bu methodun inherit edilmesi lazım.(abstract methodların body si olmuyor, 
	// bu methoda body ekleyerek methodu concrete methoda dönüştürme) 
	// bunun için yazının üzerine gidip Add unimplemented methods
	// tıklayınca aşağıdaki methodu body si ile birlikte kendisi oluşturuyor.
	// dikkat ederseniz bu methodu oluşturmadan,kullanmadan bu Class'ı child olarak kullanmamıza
	// izin vermiyor. Honda parent'i bir child class'ına motor methodu olmadan çalışmanı izin vermem
	// demek gibi birşey. bir methodun bir class'ta mutlak surette çalışmasını istiyorsak bu yolu izleriz.
	
		
		public static void main(String[] args) {
		    Abstraction02 obj = new Abstraction02();
		    obj.abstractMethod();
		    obj.concreteMethod();

		
	}

	@Override
	public void abstractMethod() {
		
		
	}

	
		
	}
	
