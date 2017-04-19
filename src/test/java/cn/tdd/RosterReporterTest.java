package cn.tdd;

import cn.tdd.CourseSession;
import cn.tdd.RosterReporter;
import cn.tdd.Student;
import cn.util.DateUtils;
import junit.framework.TestCase;

public class RosterReporterTest extends TestCase {
  public void testRosterReport() {
    CourseSession courseSession = new CourseSession("ENGL", "101", DateUtils.createDate(2017, 1, 6));
    courseSession.enroll(new Student("A"));
    courseSession.enroll(new Student("B"));

    String report = new RosterReporter(courseSession).getReport();
    assertEquals(RosterReporter.ROSTER_REPORT_HEADER + "A" + RosterReporter.NEWLINE + "B"
        + RosterReporter.NEWLINE + RosterReporter.ROSTER_REPORT_FOOTER + "2"
        + RosterReporter.NEWLINE, report);
  }


}
