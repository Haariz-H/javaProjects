package logistcs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/***
 * 
 * @author root
 * 1.Collect inputs
 * 2.
 * 
 *
 */
public class Logistcs {
	
	public static void main(String[] args) throws ParseException {
		CollInputs inp = new CollInputs();
		inp.input();
		inp.dateCov();
		inp.calTime();
		//changeDate chDate = new changeDate();
		//chDate.dateChange(inp);
		
		
	}
}

class CollInputs{
	public String depTime;
	public Date depDate;
	public int speed;
	public int distance;

	void input() throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Departure place:");
		String depPlace = sc.nextLine();
		System.out.println("Arrival place:");
		String arrPlace = sc.nextLine();
		System.out.println("departure Time:");
		String depTime = sc.nextLine();
//		Date depDate = new SimpleDateFormat("dd-MM-yyyy").parse(depTime);
		System.out.println(depTime);
		System.out.println("Distance:");
		int distance = sc.nextInt();
		System.out.println("speed:");
		int speed = sc.nextInt();	
	}
		void dateCov() {
		try {
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(depTime,df);
			LocalDate date2= date.plusDays(5);
			System.out.println(date2);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		}
		void calTime() {
			float days = distance % speed;
			System.out.println(days);
		}
}
//class changeDate{
//	void dateChange(CollInputs inp) throws ParseException {
////		Calendar cal = Calendar.getInstance();
////		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
////		try {
////		cal.setTime(inp.depDate);
////		}catch (Exception e) {
////			// TODO: handle exception
////		}
////		cal.add(Calendar.depDate, 3);  
////		String dateAfter = sdf.format(cal.getTime());
//		LocalDate date= LocalDate.parse((CharSequence) inp.depDate);
//		LocalDate date1 = date.plus(5, null);
//		System.out.println(date1+" is the date after adding 3 days.");  
//	}
//}