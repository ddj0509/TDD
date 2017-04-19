package main.java.cn.tdd;

import java.util.ArrayList;

public class CourseSession {
  private String department;
  private String number;
  private ArrayList<Student> students = new ArrayList<Student>();

  public CourseSession(String department, String number) {
    this.department = department;
    this.number = number;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void setStudents(ArrayList<Student> students) {
    this.students = students;
  }

  public int getNumberOfStudents() {
    return students.size();
  }

  public void enroll(Student student) {
    students.add(student);

  }
}
