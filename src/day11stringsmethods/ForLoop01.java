package day11stringsmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		
		// 6,5,4,3,2,1,0,-1 yi ekrana yazdıran bir for loop oluşturunuz.
		
		for(int i=6;i>-2;i-- ) {
			System.out.println(i);
		}

		// 3,4,5,6,7 sayılarını ekrana yazdıran for loot oluşturun
		
		for(int i=3;i<8;i++ ) {
			System.out.println(i);
		}
		
		// ilk 100 sayma sayısını ekrana yanyana yazdıran ve aralarına boşluk koyan programı for loop kullanarak yazınız
		
		
		for(int i=1;i<101;i++) {
			System.out.print(i+" ");
		}
			
		// ilk 100 sayma yazısını 100 den 1 e kadar yan yana bir boşluk bırakarak yazdırın
			
		for(int i=100;i>0;i--) {
			System.out.println("");
			System.out.print(i+" ");
			
		}
			
		// ilk 50 çift sayma sayısın ekrana yazdıran for loop oluşturun
		
		for (int i=2; i<101;i=i+2) {
			System.out.println(i);
		}
		
		// ilk 50 tek sayma sayılarını ekrana yan yana yazdıran for loop oluşturun.
		
		for (int i=1; i<100;i+=2) {
			System.out.print(i+" ");
			
		}
		
		}
		
	}


