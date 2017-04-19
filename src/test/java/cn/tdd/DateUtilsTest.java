package cn.tdd;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import cn.util.DateUtils;
import junit.framework.TestCase;

public class DateUtilsTest extends TestCase{
  
  public void testCreateDate() {
    Date date = DateUtils.createDate(2017,  1, 12);
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.setTime(date);
    System.out.println(gregorianCalendar.get(Calendar.YEAR));
    System.out.println(gregorianCalendar.get(Calendar.MONTH));
    System.out.println(gregorianCalendar.get(Calendar.DAY_OF_MONTH));
    
    assertEquals(2017, gregorianCalendar.get(Calendar.YEAR));
    assertEquals(Calendar.JANUARY, gregorianCalendar.get(Calendar.MONTH));
    assertEquals(12, gregorianCalendar.get(Calendar.DAY_OF_MONTH));
  }
}
