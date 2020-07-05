package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		
		// manipule değiştirmek demektir.
		// Date Manipulation (Date üzerinde değişiklikler yapmak)
		
		LocalDate date=LocalDate.now();
		
		System.out.println(date);
		System.out.println(date.plusDays(1)); 
		System.out.println(date.plusDays(13));
		System.out.println(date.plusDays(-1)); // çok kullanılmaz bunun için başka bir method var.
		
		System.out.println(date.plusMonths(2));
		System.out.println(date.plusYears(3));
		System.out.println(date.plusWeeks(4));
		
		System.out.println(date.minusDays(3));
		System.out.println(date.minusMonths(2));
		
	}

}
