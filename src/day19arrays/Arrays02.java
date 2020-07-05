package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// 4 elemanlı char bir array oluşturalım.
		// Tüm elemanları for döngüsü kullanarak ekrana yazdırın
		
		char arr3 []=new char[4];
		
		arr3[0]='A';
		arr3[1]='D';
		arr3[2]='E';
		arr3[3]='M';
		
		for(int i=0;i<4;i++) {
			System.out.print(arr3[i]);
			
			System.out.println();
			System.out.println(arr3[3]);
			
			// Array'in length'ini bulmak için "ArrayIsmi.length" yazmak yeterlidir.
			// Stringlerde de lengeth methodu kullanılır ama Stringlerde kullanılan length methodu parantezlidir.
			// Stringlerde length( )  arraylerde sadece length şeklinde yazılıyor.
			
			System.out.println(arr3.length);
			
			// Arraydeki son elemanı yazdırmak için length kullanınız.
			System.out.println(arr3[arr3.length-1]); // M görmemiz lazım.
			
		}

		
		
		
		
		
	}

}
