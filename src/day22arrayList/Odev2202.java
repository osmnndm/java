package day22arrayList;

import java.util.ArrayList;
import java.util.List;

public class Odev2202 {

	public static void main(String[] args) {
		
		// For-each loop Soru 2:
		// Bir integer list oluşturunuz 
		// ve bu list’deki tum sayıların karesinin toplamını 
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız
		
		List<Integer> list=new ArrayList<>();
		
		list.add(2);
		list.add(4);
		list.add(6);
		
		int sum=0;
		int mult=1;
		
		for(int w: list) {
			mult=w*w;
			sum=sum+mult;
		}
		System.out.println(sum);
	}

}
