package cn.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
  private DateUtils() {
    
  }
  
  public static Date createDate(int year, int month, int day) {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.clear();

    gregorianCalendar.set(Calendar.YEAR, year);
    gregorianCalendar.set(Calendar.MONTH, month - 1);
    gregorianCalendar.set(Calendar.DAY_OF_MONTH, day);
    return gregorianCalendar.getTime();
  }
}
