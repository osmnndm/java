package areplitConditionalStatement;

public class Cs10 {

	public static void main(String[] args) {
		
//		5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
//
//		Beklenen Çıktı: 
//		      1                                                                          
//		     1 1                                                                         
//		    1 2 1                                                                        
//		   1 3 3 1                                                                       
//		  1 4 6 4 1 
	
		
	String bos= " ";
	
	for(int a=0; a<5; a++) {
	int sayi = (int) Math.pow(11, a);
	String sayi1=Integer.toString(sayi);
	String sayi2=sayi1.replace(""," ");
		
	for(int j=a+1; j<5; j++) {
	
	System.out.print(bos);
}
	System.out.println(sayi2);
}
	}
	
	}
