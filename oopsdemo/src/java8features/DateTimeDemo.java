package java8features;

import java.sql.Date;
import java.util.Calendar;

public class DateTimeDemo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		
		// Legacy class to deal with date & Time which is now deprecated
        Date d1=new Date();
        System.out.println(d1);
        System.out.println(d1.getDate());
        System.out.println(d1.getHours() +" : "+d1.getMinutes()+":"+d1.getSeconds());
       
        // Calendar Class
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
		
	}

}
