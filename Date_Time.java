import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Date_Time {

	public static void main(String args[]) {
		// Create a SimpleDateFormat with a specific date and time format
		SimpleDateFormat cdt = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss.SSS");
		
		// Set the time zone for the calendar to GMT
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));
		
		// Display the current date and time in the specified format
		System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));
	}
}
