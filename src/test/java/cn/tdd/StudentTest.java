package cn.tdd;

import cn.tdd.Student;
import cn.tdd.Student.Grade;
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

  public void testCalculateGpa() {
    Student student = new Student("a");
    assertGpa(student, 0.0);

    student.addGrade(Student.Grade.A);
    assertGpa(student, 4.0);

    student.addGrade(Student.Grade.B);
    assertGpa(student, 3.5);

    student.addGrade(Student.Grade.C);
    assertGpa(student, 3.0);

    student.addGrade(Student.Grade.D);
    assertGpa(student, 2.5);
  }

  public void testCalculateHonorsStudentGpa() {
    Student student = new Student("a");
    assertGpa(createHonorsStudent(student), 0.0);
    assertGpa(createHonorsStudent(student, Student.Grade.A), 5.0);
    assertGpa(createHonorsStudent(student, Student.Grade.B), 4.5);
    assertGpa(createHonorsStudent(student, Student.Grade.C), 4.0);
    assertGpa(createHonorsStudent(student, Student.Grade.D), 3.5);
  }

  private Student createHonorsStudent(Student student, Grade grade) {
    student.addGrade(grade);
    student.setHonors();
    return student;
  }

  void assertGpa(Student student, double expectedGpa) {
    assertEquals(expectedGpa, student.getGpa(), Student.GRADE_TOLERANCE);
  }

  Student createHonorsStudent(Student student) {
    student.setHonors();
    return student;
  }
}
