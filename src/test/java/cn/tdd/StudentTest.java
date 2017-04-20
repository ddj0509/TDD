package cn.tdd;

import cn.tdd.Student;
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

  public void testFullTime() {
    Student student = new Student("a");
    assertFalse(student.isFullTime());
    
    student.addCredits(20);
    assertTrue(student.isFullTime());
  }

  public void testStudentStatus() {
    Student student = new Student("a");
    assertEquals(0, student.getCredits());
    
    assertFalse(student.isFullTime());
    
    student.addCredits(3);
    assertEquals(3, student.getCredits());
    assertFalse(student.isFullTime());
    
    student.addCredits(4);
    assertEquals(7, student.getCredits());
    assertFalse(student.isFullTime());
    
    student.addCredits(5);
    assertEquals(Student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());
    assertTrue(student.isFullTime());
  }
  
  public void testInState() {
    Student student = new Student("a");
    assertFalse(student.isInState());
    student.setState(Student.IN_STATE);
    assertTrue(student.isInState());
    
    student.setState("MD");
    assertFalse(student.isInState());
  }
}
