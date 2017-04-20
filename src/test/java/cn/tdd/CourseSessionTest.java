package cn.tdd;

import java.util.Date;

import junit.framework.TestCase;
import cn.tdd.CourseSession;
import cn.tdd.Student;
import cn.util.DateUtils;

public class CourseSessionTest extends TestCase {
  private CourseSession courseSession;
  private Date startDate;
  private final int CREDITS = 3;
  
  public void setUp() {
    startDate = DateUtils.createDate(2017, 1, 6);
    courseSession = new CourseSession("ENGL", "101", startDate);
    courseSession.setNumberOfCredits(CREDITS);
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
    assertEquals(CREDITS, student1.getCredits());
    assertEquals(1, courseSession.getNumberOfStudents());
    assertEquals(student1, courseSession.get(0));

    Student student2 = new Student("lz");
    courseSession.enroll(student2);
    assertEquals(CREDITS, student1.getCredits());
    assertEquals(student2, courseSession.get(1));
    assertEquals(2, courseSession.getNumberOfStudents());
  }

  public void testCourseDates() {
    Date sixteenWeekOut = DateUtils.createDate(2017, 4, 25);
    assertEquals(sixteenWeekOut, courseSession.getEndDate());
  }
}
