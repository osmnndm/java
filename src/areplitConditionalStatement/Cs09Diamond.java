package areplitConditionalStatement;

public class Cs09Diamond {

	public static void main(String[] args) {
		
//		Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
//		Test Data:
//		Yarım elmas uzunluğu : 7
//		Beklenen Çıktı: 
//		      *                                                                          
//		     ***                                                                         
//		    *****                                                                        
//		   *******                                                                       
//		  *********                                                                      
//		 ***********                                                                     
//		*************                                                                    
//		 ***********                                                                     
//		  *********                                                                      
//		   *******                                                                       
//		    *****                                                                        
//		     ***                                                                         
//		      * 
	
		for(int j=0;j<7;j++) {
		for(int i=1;i<14;i++) {
			String bosluk= i<7-j || i>7+j ? " " :"*";
			System.out.print(bosluk);
		}
		System.out.println();
		}
		
		for (int k=1; k<7; k++) {
			for(int l=1; l<14; l++) {
			String yildiz = (l>k && l<14-k) ? "*" : " ";
			System.out.print(yildiz);
		}
		System.out.println();	
		}
		
	}

}
