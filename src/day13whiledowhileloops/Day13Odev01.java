package day13whiledowhileloops;

public class Day13Odev01 {

	public static void main(String[] args) {
		
		//Aşağıdaki soruları hem for loop hem de while loop kullanarak çözünüz
		// 8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
		
		System.out.println("For Loop ile çözüm:");
		for(int i=8; i<181;i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("While Loop ile çözüm");
		
		int i=8;
		while(i<181) {
				if(i%5==0) {
					System.out.print(i+" ");
				}
				i++;
		}
	

	}

}
