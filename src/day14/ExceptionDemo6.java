package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		parseDateToString();
		
		// TODO Auto-generated method stub
//
//		try {
//			
//		}catch(Exception e) {
//			
//		}finally {
//			
//		}
		
		
	}

	private static void parseDateToString() {
		// TODO Auto-generated method stub
		
		Date currentDate = new Date ();
		System.out.println(currentDate);
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yy");
		String fDate = sdf.format(currentDate);
		System.out.println(fDate);
		
	}
	public static void parseStringToDate() throws ParseException {
		String date = "2001-01-02 ";
		System.out.println(date);
		//int yy;
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yy");
		Date pDate = sdf.parse(date);
	}

}
