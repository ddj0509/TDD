package test.java.cn.tdd;

import java.util.Date;

import junit.framework.TestCase;
import main.java.cn.tdd.CourseSession;
import main.java.cn.tdd.Student;
import main.java.cn.util.DateUtils;

public class CourseSessionTest extends TestCase {
  private CourseSession courseSession;
  private Date startDate;

  public void setUp() {
    startDate = new DateUtils().createDate(2017, 1, 6);
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
    Date sixteenWeekOut = new DateUtils().createDate(2017, 4, 25);
    assertEquals(sixteenWeekOut, courseSession.getEndDate());

  }
}
