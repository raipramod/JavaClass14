package day19;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		Instant instant = Instant.now();
		System.out.println(instant);

	}

}
