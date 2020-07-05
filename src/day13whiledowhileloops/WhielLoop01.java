package day13whiledowhileloops;

public class WhielLoop01 {

	public static void main(String[] args) {
		
		// While loop kullanarak ilk 5 sayma sayısının toplamını 
		// ekrana yazdıran programı yazınız
		
		
		int sum=0;
		int i=1;
		while(i<6) {
			sum=sum+i;
			i++;
		}System.out.println("Toplam="+sum);

	}

}
