package cn.tdd;

import static cn.tdd.RosterReporter.NEWLINE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseReport {
  
  private List<CourseSession> sessions = new ArrayList<CourseSession>();
  
  public void add(CourseSession courseSession) {
    // TODO Auto-generated method stub
    sessions.add(courseSession);
  }

  public String text() {
    StringBuilder builder = new StringBuilder();
    Collections.sort(sessions);
    for (CourseSession session : sessions) {
      builder.append(session.getDepartment() + " " + session.getNumber() + NEWLINE);
    }
    
    return builder.toString();
  }
}
