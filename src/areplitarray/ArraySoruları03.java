package areplitarray;

public class ArraySoruları03 {
	
	public static void main(String[] args) {
		
		 Integer arr[] = {20, 30, 25, 35, -16, 60, -100};
		   
		   int sum = 0;
		   int count =0;
		   for(int w:arr){
		     sum = sum +w;
		     count++;}
		    double ort = sum/count;
		    System.out.println("Array Sayılarının ortalaması: "+ ort);
		    
		
		    String num ="0000000000";
		    String ch[]=num.split("");
		    
		    for(String w:ch) {
		    	for(@SuppressWarnings("unused") String j:ch) {
		    		System.out.print(w+" ");
		    	}
		    	System.out.println();
		    }
		    
		   }
		  
		
	}


