package cn.tdd;

import cn.tdd.Student.Grade;

public class RegularGradingStrategy implements GradingStrategy {

  @Override
  public int getGradePointsFor(Grade grade) {
    if (grade == Student.Grade.A) {
      return 4;
    } else if (grade == Student.Grade.B) {
      return 3;
    } else if (grade == Student.Grade.C) {
      return 2;
    } else if (grade == Student.Grade.D) {
      return 1;
    }
    return 0;
  }

}
