package cn.tdd;

import java.util.ArrayList;

public class Student {
  private String name;
  private int credits;
  static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
  static final String IN_STATE = "CO";
  private String state;
  private ArrayList<Grade> grades = new ArrayList<>();
  static final double GRADE_TOLERANCE = 5 / 100;
  private GradingStrategy gradingStrategy = new RegularGradingStrategy();
  
  enum Grade {
    A, B, C, D, F
  };

  public Student(String name) {
    this.name = name;
    this.credits = 0;
    this.state = "";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isFullTime() {
    return credits >= Student.CREDITS_REQUIRED_FOR_FULL_TIME;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public void addCredits(int credits) {
    this.credits += credits;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public boolean isInState() {
    return Student.IN_STATE.equals(this.state.toUpperCase());
  }

  public int gradePointsFor(Grade grade) {
    return gradingStrategy.getGradePointsFor(grade);
  }

  public double getGpa() {
    if (grades.size() == 0) {
      return 0;
    }

    double total = 0.0;
    for (Grade grade : grades) {
      total += gradePointsFor(grade);
    }

    return total / grades.size();
  }

  public void addGrade(Grade grade) {
    grades.add(grade);
  }

  public void setGradingStrategy(GradingStrategy gradingStrategy) {
    this.gradingStrategy = gradingStrategy;
  }
}
