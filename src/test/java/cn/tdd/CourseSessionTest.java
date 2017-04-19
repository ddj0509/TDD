package test.java.cn.tdd;

import junit.framework.TestCase;
import main.java.cn.tdd.CourseSession;
import main.java.cn.tdd.Student;

public class CourseSessionTest extends TestCase{
  public void testCreate() {
    CourseSession courseSession = new CourseSession("ENGL", "101");
    assertEquals("ENGL", courseSession.getDepartment());
    assertEquals("101", courseSession.getNumber());
    
    Student student1 = new Student("ddj");
    courseSession.enroll(student1);
    
    Student student2 = new Student("lz");
    courseSession.enroll(student2);
    
    assertEquals(2, courseSession.getNumberOfStudents());
  }
}
