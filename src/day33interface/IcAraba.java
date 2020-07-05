package day33interface;

public interface IcAraba {
	
	// 3 şekildede yazılabilir. methodlar public ve abstract olmak zorunda
	
	int price =2000;  //Bir variable final ise java onu mavi olarak yazar, onu değişteremeyeceğimi anlarım.
	boolean old = true;
	
	
	
	public abstract void direksiyon();
	
	public void koltuk();
	
	void klima();
	
	
	public default void döseme() { // obje kullanarak child'de bu methodu çağırabilirim.
		System.out.println("Interface'de default keyword ile döseme yaptım");
	}
	
	public static void  isitma() { // direk Class ismi ile herhangi bir Class'tan bu methodu çağırabilirim.
		System.out.println("Static ile yan ayna isitma özelliği koyduk");
	}

}
