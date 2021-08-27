package day19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.of(2001, 10, 11);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yy");
		System.out.println(localDate);
				

	}

}
