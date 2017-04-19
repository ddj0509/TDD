package main.java.cn.tdd;

import java.util.*;

public class CourseSession {
  private String department;
  private String number;
  private ArrayList<Student> students = new ArrayList<Student>();
  private Date startDate;

  public CourseSession(String department, String number, Date date) {
    // TODO Auto-generated constructor stub
    this.department = department;
    this.number = number;
    this.startDate = date;
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

  public Student get(int index) {
    return students.get(index);
  }

  public int getNumberOfStudents() {
    return students.size();
  }

  public void enroll(Student student) {
    students.add(student);

  }

  public Date getEndDate() {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.setTime(startDate);

    int numberOfDays = 16 * 7 - 3;
    gregorianCalendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
    return gregorianCalendar.getTime();
  }

  public Date getStartDate() {
    return startDate;
  }
}
