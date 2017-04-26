package cn.tdd;

import java.util.*;

public class CourseSession implements Comparable<CourseSession> {
  private String department;
  private String number;
  private List<Student> students = new ArrayList<Student>();
  private Date startDate;
  private int numberOfCredits;

  public CourseSession(String department, String number, Date date) {
    // TODO Auto-generated constructor stub
    this.department = department;
    this.number = number;
    this.startDate = date;
    this.numberOfCredits = 0;
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
    return getStudents().get(index);
  }

  public int getNumberOfStudents() {
    return getStudents().size();
  }

  public void enroll(Student student) {
    student.addCredits(this.numberOfCredits);
    getStudents().add(student);
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

  public List<Student> getStudents() {
    return students;
  }


  public void setNumberOfCredits(int cREDITS) {
    this.numberOfCredits = cREDITS;
  }


  public int compareTo(CourseSession o) {
    int result = this.getDepartment().compareTo(o.getDepartment());
    if (result == 0) {
      result = this.getNumber().compareTo(o.getNumber());
    }
    return result;
  }
}
