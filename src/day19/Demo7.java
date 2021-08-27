package day19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		System.out.println(date);
		LocalDateTime localDateTime = LocalDateTime.now();
		date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(date);

	}

}
