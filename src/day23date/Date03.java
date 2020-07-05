package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		
		// Time Manipilation (Zamanı değiştirme)
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		System.out.println(time.plusSeconds(45));
		System.out.println(time.plusMinutes(20));
		System.out.println(time.plusHours(10));
		System.out.println(time.minusSeconds(33));
		System.out.println(time.minusMinutes(12));
		System.out.println(time.minusHours(12));
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
	}

}
