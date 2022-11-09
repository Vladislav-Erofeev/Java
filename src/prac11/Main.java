/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main
{
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        System.out.println(" Date with month changed :"+ sdf.format(cal.getTime()));
    }
}
