package test.java.cn.tdd;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import main.java.cn.util.DateUtils;
import junit.framework.TestCase;

public class DateUtilsTest extends TestCase{
  
  public void testCreateDate() {
    DateUtils dateUtils = new DateUtils();
    Date date = dateUtils.createDate(2017,  1, 12);
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.setTime(date);
    assertEquals(2017, gregorianCalendar.get(Calendar.YEAR));
    assertEquals(1, gregorianCalendar.get(Calendar.MONTH));
    assertEquals(12, gregorianCalendar.get(Calendar.DAY_OF_MONTH));
  }
}
