package areplitarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySorular10 {
	
//	Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın 
//	ve tersine ters çevrilmiş String'e atayın.
//
//	Test Data:
//	sentence -> "Java is fun" 
//	reversed -> "fun is Java" 
	
	public static void main(String[] args) {
		
		String kelime = "Java is fun";
		String arr[] = kelime.split(" ");

		List<String> ters = new ArrayList<>();
	
		for(int i=1; i<=arr.length; i++) {
			ters.add(arr[(arr.length)-i]);
			ters.add(" ");
			if(i==arr.length) ters.remove(arr.length-1);
			
		}
		System.out.println(ters);
		String kelimeTers = ters.toString();
		System.out.println(kelimeTers);
			
	}

}
