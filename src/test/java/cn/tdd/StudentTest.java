package test.java.cn.tdd;

import main.java.cn.tdd.Student;
import junit.framework.TestCase;

public class StudentTest extends TestCase {
  
  public void testCreate() {
    final String firstName = "ddj";
    Student student = new Student(firstName);
    assertEquals(firstName, student.getName());
  
    final String secondName = "lz";
    Student student2 = new Student(secondName);
    assertEquals(secondName, student2.getName());
  }


}
