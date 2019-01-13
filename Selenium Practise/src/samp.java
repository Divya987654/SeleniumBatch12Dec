import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class samp {

	
	public static void main(String args[])
	{
		
		DateFormat d1= new SimpleDateFormat("MM/DD/YY HH:MM:SS");
		
		Date d = new Date();
		System.out.println(d);
		
		String d2=d1.format(d);
		System.out.println(d2);
	}
}
