package test.java.cn.tdd;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import main.java.cn.tdd.CourseSession;
import main.java.cn.tdd.RosterReporter;
import main.java.cn.tdd.Student;
import junit.framework.TestCase;

public class RosterReporterTest extends TestCase {
  public Date createDate(int year, int month, int day) {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.clear();

    gregorianCalendar.set(Calendar.YEAR, year);
    gregorianCalendar.set(Calendar.MONTH, month - 1);
    gregorianCalendar.set(Calendar.DAY_OF_MONTH, day);
    return gregorianCalendar.getTime();
  }

  public void testRosterReport() {
    CourseSession courseSession = new CourseSession("ENGL", "101", createDate(2017, 1, 6));
    courseSession.enroll(new Student("A"));
    courseSession.enroll(new Student("B"));

    String report = new RosterReporter(courseSession).getReport();
    assertEquals(RosterReporter.ROSTER_REPORT_HEADER + "A" + RosterReporter.NEWLINE + "B"
        + RosterReporter.NEWLINE + RosterReporter.ROSTER_REPORT_FOOTER + "2"
        + RosterReporter.NEWLINE, report);
  }


}
