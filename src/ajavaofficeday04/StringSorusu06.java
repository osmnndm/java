package ajavaofficeday04;

import java.util.Scanner;

public class StringSorusu06 {
	
	public static void main(String[] args) {
		// girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
		// kelimeyi tersten yazan ve ilk hali ve son halini karşılaştrına java kodunu yazınız.
		
		// madam == >  12321 == > 12321
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
	    String word = scan.nextLine();
	    StringBuilder sb = new StringBuilder();
	    sb.append(word); // append () methodu String'e yeni bir String eklemek
		                 // için kullanılır. Concatenation yapar.

	    System.out.println(sb.toString().equals(sb.reverse().toString()));
	    
//	    String tersStr = "";
//	    int count = word.length()-1;
//	    
//	    for(;count>=0; count--) { // yukarıdaki count for içinde direk yazılıp kullanılamiyor
//	    	                     //bu şekilde yazılarak kullanılabilir
//	    	tersStr=tersStr + word.charAt(count);
//	    	
//	    }
//	    if(tersStr.equals(word)) {
//	    	System.out.println("true");
//	    }else {
//	    	System.out.println("false");
//	    }
	    
	    
	    
	    scan.close();
		
		
	}

}
