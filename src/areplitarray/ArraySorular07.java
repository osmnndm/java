package areplitarray;

import java.util.Arrays;
import java.util.List;

public class ArraySorular07 {
	
	public static void main(String[] args) {
		
//		Array i ARRAYLIST e çeviren Java Kodunu yazınız.
//		Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
//
//		Beklenen Çıktı: 
//		[Python, JAVA, PHP, Perl, C#, C++] 
		
		String Array[] = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
		
		List <String> list = Arrays.asList(Array);
		System.out.println(list);
		
	}

}
