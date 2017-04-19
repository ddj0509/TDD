package test.java.cn.tdd;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import main.java.cn.tdd.CourseSession;
import main.java.cn.tdd.Student;

public class CourseSessionTest extends TestCase {
  private CourseSession courseSession;
  private Date startDate;

  public Date createDate(int year, int month, int day) {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.clear();
    
    gregorianCalendar.set(Calendar.YEAR, year);
    gregorianCalendar.set(Calendar.MONTH, month - 1);
    gregorianCalendar.set(Calendar.DAY_OF_MONTH, day);
    return gregorianCalendar.getTime();
  }

  public void setUp() {
    startDate = createDate(2017, 1, 6);
    courseSession = new CourseSession("ENGL", "101", startDate);
  }

  public void testCreate() {
    assertEquals("ENGL", courseSession.getDepartment());
    assertEquals("101", courseSession.getNumber());
    assertEquals(0, courseSession.getNumberOfStudents());
    assertEquals(startDate, courseSession.getStartDate());
  }

  public void testEnrollStudents() {
    Student student1 = new Student("ddj");
    courseSession.enroll(student1);
    assertEquals(1, courseSession.getNumberOfStudents());
    assertEquals(student1, courseSession.get(0));

    Student student2 = new Student("lz");
    courseSession.enroll(student2);
    assertEquals(student2, courseSession.get(1));
    assertEquals(2, courseSession.getNumberOfStudents());
  }

  public void testCourseDates() {
    Date sixteenWeekOut = createDate(2017,  4, 25);
    assertEquals(sixteenWeekOut, courseSession.getEndDate());

  }
}
