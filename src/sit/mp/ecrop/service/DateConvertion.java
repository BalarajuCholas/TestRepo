package sit.mp.ecrop.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertion {

	public static
	{
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date parsed = format.parse("20110210");
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
    }
}
