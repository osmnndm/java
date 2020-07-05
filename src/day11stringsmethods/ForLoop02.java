package day11stringsmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		
		// 100 den küçük 3 ün katı olan sayma sayılarını ekrana yan yana yazdıran for loop oluşturunuz
		
		for(int i=3;i<100;i+=3) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// ilk 5 sayma sayısının toplamını veren programı for loop ile yazınız.
		// 1,2,3,4,5
		// int sum=0 0+1=1 ==> 1+2=3 ==> 3+3=6 ==> 6+4=10 ==> 10=5=15
		// 1+2+3+4+5
		
		int sum=0;
		for(int i=1;i<6;i++) {
			sum=sum+i;
		}
		System.out.println("Toplam:"+sum);
		System.out.println();
		
		// 10 dan büyük ilk 3 sayma sayısının toplamını veren for loopu yazınız
		
		int sum1=0;
		for(int i=11;i<14;i++) {
			sum1=sum1+i;
		}
		System.out.println("Toplam:"+sum1);
		System.out.println();
		
		
	// 20 den büyük ilk 5 sayma sayısının toplamını veren for loop yazınız
		
		int sum3=0;
		for(int i=21; i<26;i++) {
			sum3=sum3+i;
		}
		System.out.println("Toplam:"+sum3);
		System.out.println();
				
		// ilk 50 sayma sayısının toplamını veren for loop oluşturunuz
		
		int sum4=0;
		for(int i=1;i<51;i++) {
			sum4=sum4+i;
			System.out.println();
		}
		
		System.out.println("Toplam:"+sum4);
		
		// 5 ile bölünebilen 100 den küçük sayma sayılarının toplamını veren for loop oluşturunuz
		
		int sum5=0;
		for(int i=5;i<100;i+=5) {
			sum5=sum5+i;
		}
		System.out.println("Toplam:"+sum5);
		
	}

}
