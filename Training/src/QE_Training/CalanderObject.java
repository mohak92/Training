package QE_Training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalanderObject {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy HH:mm:ss");
		String date = sdf.format(new Date());
		System.out.println(date);
		System.out.println("===============================");
		sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		Date dateObj = sdf.parse(dateInString);
		System.out.println(dateObj);
		System.out.println("================================");
		Calendar calendar = Calendar.getInstance();
		System.out.println(dateObj);
		calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
	}

}
