package day14dowhileloop;

public class Day14Odev01 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları do-while loop kullanarak çözünüz.
		// 9 den 190 e kadar 7 nin kati olan tüm tamsayıları ekrana yazdırınız.
		
		int num=9;
		System.out.print("9'dan 190'a kadar 7'nin katları olan sayılar: ");
		do {
			if(num%7==0) {
				System.out.print(num+" ");
			}
			num++;	
		}while(num<90);

	}

}
