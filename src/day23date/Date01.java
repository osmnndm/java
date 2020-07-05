package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		
		// Bugünün tarihini ekrana yazdıralım.
		
		System.out.println(LocalDate.now());
		
		System.out.println(LocalTime.now());
		
		System.out.println(LocalDateTime.now());
		// 2020-05-20T17:03:01.519  buradaki "T" tarih ile zamanı ayırmak için konuluyor.
		
	}

}
