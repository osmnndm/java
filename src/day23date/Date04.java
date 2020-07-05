package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		
		// Date formatını değiştirmek
		// Java minute için "m" kullanır, ay için "M" kullanır.
		
		LocalDate date=LocalDate.now();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd.MMM.yyyy"); 
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd.MM.yyyy"); 
		System.out.println(dtf1.format(date.plusMonths(7)));
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyy/M/dd"); 
		System.out.println(dtf2.format(date));
		
		
		// Time Formatını değiştirme
		// HH kullanırsanız 24 saatlik dilimi kullanır. hh olursa pm am kullanır.
		
		LocalTime time=LocalTime.now();
		
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf3.format(time.plusHours(3)));
		
		// Başka ülkenin local zamanını almak
		
	//	time.now(zone); bir ülkenin zone değerini GMT-3
		LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		
		
		
		
	}

}
