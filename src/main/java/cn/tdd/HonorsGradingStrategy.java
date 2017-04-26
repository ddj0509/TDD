package cn.tdd;

import cn.tdd.Student.Grade;

public class HonorsGradingStrategy implements GradingStrategy {

  @Override
  public int getGradePointsFor(Grade grade) {
    if (grade == Student.Grade.A) {
      return 5;
    } else if (grade == Student.Grade.B) {
      return 4;
    } else if (grade == Student.Grade.C) {
      return 3;
    } else if (grade == Student.Grade.D) {
      return 2;
    }
    return 0;
  }
}
