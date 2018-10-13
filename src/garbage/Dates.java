package garbage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by expertzlab9 on 24/7/18.
 */
public class Dates {

    protected  void finalize(){
        System.out.println("date of today");
    }

    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(format.format(date));
        System.out.println(date);
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        GregorianCalendar calen=new GregorianCalendar();
        int year=calen.get(Calendar.YEAR);
        System.out.println("year"+ year);
        System.out.println(calen.getTime());
    }
}
