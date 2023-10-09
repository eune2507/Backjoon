package B10600.q10699;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("YYYY-MM-dd");
		format.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.print(format.format(date));

	}

}
