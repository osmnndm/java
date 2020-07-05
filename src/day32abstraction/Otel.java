package day32abstraction;

public abstract class Otel {
	
	// Abstract Class'ın her child'inde oluşturulan abstract method mutlaka kullanılması gerektiğinden
	// ve bu method Class'a göre uyarlanabilir olduğundan body konulmayıp bu body içeriği Class'larda
	// oluşturalacak inheritence metodlara bırakılmıştır.
	// herhangi bir parent tarafından override edilen abstract method alttaki Concrete child'lar
	// tarafından override edilmesede olur.
	// bir Class'ı final yaptığımız zaman daha onun child'i olamaz.
	// Bizim abstract Class oluşturmamızın sebebi içine methodlar koyalım o metodlarıda child Class'lar
	// kullansın amaçlı. bu nedenle abstract Class'lar final olamazlar.
	// aynı şekilde abstract methodlar final edilemezler.
	// abstract method private da olamaz, private methodlar override edilemezler.
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	public abstract void kahvalti();
	
	public int wifi(int kişiSayisi) {
		return kişiSayisi*2;
	}

}
