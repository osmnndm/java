package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		
		// Arrays: tepsi demektir.
		// birden fazla varriable'i aynı anda kullanmak istediğimiz zaman arrays kullanıyoruz.
		// Array'ler object'tir bu yüzden Heap Memory'de depolanır.
		// Array'ler object'tir. bu yüzden valueların yanında methodlar da vardır.
		// Array'ler object'tir bu yüzden runtime'a oluşturulurlar.
		// Primitiveleri Java oluşturur. non primitive lardan ise istediğimiz kadar üretebiliriz.
		// bu non primitivelerden biriside arraysdir.
		// Arraysler hipte depolanır.
		// hip büyük bir alan olduğu için bulunabilmesi için adreslenmesi gerekir.
		// Arrays içinde tüm variable'lar aynı data type'ınde olmalıdır.
		// arrays sadece Primitive type (byte, short...8 tane) ve objeckt referans konulabilir.
		// arrays'ın içinde Stringin adresi olur, kendisi olmaz.
		// array'in içine stackdekiler konulabilir.
		// Bir array oluşturmadan önce o Array'in içine kaç variable koyacağımıza karar vermeliyiz.
		// Bir Array içine koyabileceğimiz variable sayısına o Array'in "length"i denir.
		// bir Array'in length=2 gibi
		// O Array içine length'den fazla variable koyamayız.
		
		// int x; declare denir.
		// Array oluşturmak için iki yol vardır:
		// 1) int myArray[ ]; daha cok kullanılır
		// 2) int [ ]myArray; Dat Type isim [ ];
		// [ ] Array sembolü
		// bu yazılınca Stack Memory'de bir adres oluşturulur.
		// eclipse de run butonuna basılınca Array oluşturulur.
		
		// BİR ARRAY NASIL OLUŞTURULUR?
		// array bir objeckt olduğu için new kullanılarak oluşturulur.
		// int myArray [ ] = new int[7]; 
		// 7 lenght uzunluğudur, değer yazılmazsa compile error verir.
		// int olarak öncesinde bir değer atanmamışsa default değer olarak 7 tane 0 atar.
		// 7 değer atanacak siz 3 değer atarsanız gerisini yazmazsanız 2 3 4 0 0 0 0  yapar.
		// boolean b[]=new boolean[3]; false false false gibi çünkü boolean default değeri falsedir.
		// array'ler index kullanır. bu nedenle array içindeki elamanlardan birini görmek istiyorsak
		// index ini yazarak print yapabiliriz, 
		// index olmadan sadece array ismini yazarsak reference'ını (adresini) görürürüz.
		
	
		
		// Integer Array oluşturalım
		
		int arr1[]=new int[5];
		System.out.println(arr1); // [I@1540e19d yazar bu adrestir. 
								  //  array in ismini yazarak yazdırmaya çalışırsak adresi alırız.
		
		System.out.println(arr1[0]); // ekranda 0 görürüz.
		
	
		arr1[0]=12; // indexi 0 olana 12 ata demektir.
		
		System.out.println(arr1[0]); // 12 görürüz
		
	
		
		arr1[1]=13;
		System.out.println(arr1[1]);
		arr1[2]=14;
		System.out.println(arr1[2]);
		arr1[3]=15;
		System.out.println(arr1[3]);
		arr1[4]=22;
		System.out.println(arr1[4]); // 0
//		12
//		13
//		14
//		15
//		22
		
		
		// for loop kullanarak array'deki elemanları ekrana yazdırın
		
		for (int i=0; i<5;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		// Array'de olmayan indexe değer ataması yapılırsa Run Time Error alınır.
		// Array/de olmaya indexi kullanmaya çalışırsak ArrayIndexOutOfBoundsException hatası alırız.
		
		arr1[5]=23;
		System.out.println(arr1[5]);
		

	}

}
