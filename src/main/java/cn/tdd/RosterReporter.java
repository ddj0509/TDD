package cn.tdd;

public class RosterReporter {
  public static final String NEWLINE = System.getProperty("line.separator");
  public static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "-----" + NEWLINE;
  public static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";
  private CourseSession courseSession;

  public RosterReporter(CourseSession courseSession) {
    this.courseSession = courseSession;
  }

  public String getReport() {
    StringBuilder buffer = new StringBuilder();
    buffer.append(ROSTER_REPORT_HEADER);

    for (Student s : courseSession.getStudents()) {
      buffer.append(s.getName());
      buffer.append(NEWLINE);
    }

    buffer.append(ROSTER_REPORT_FOOTER + courseSession.getStudents().size() + NEWLINE);
    return buffer.toString();
  }

}
