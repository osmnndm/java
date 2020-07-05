package day22arrayList;

public class Odev2201 {

	public static void main(String[] args) {
	
		// For-each loop Soru 1:
		// Bir integer array oluşturunuz 
		// ve bu array’deki tum sayıların çarpımını 
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		
		int arr[]= {1,2,3,4,5};
		int mult=1;
		
		for(int w:arr) {
			mult=mult*w;
		}
		System.out.println("arr!= "+mult);
	}

}
