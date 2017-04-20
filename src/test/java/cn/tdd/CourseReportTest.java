package cn.tdd;

import java.util.Date;

import junit.framework.TestCase;
import static cn.tdd.RosterReporter.NEWLINE;

public class CourseReportTest extends TestCase {

  public void testReport() {
    Date date = new Date();
    CourseReport courseReport = new CourseReport();
    courseReport.add(new CourseSession("ENGL", "101", date));
    courseReport.add(new CourseSession("CZEC", "200", date));
    courseReport.add(new CourseSession("ITAL", "410", date));
    courseReport.add(new CourseSession("CZEC", "110", date));
    courseReport.add(new CourseSession("ITAL", "420", date));
    assertEquals("CZEC 110" + NEWLINE + "CZEC 200" + NEWLINE + "ENGL 101" + NEWLINE + "ITAL 410"
        + NEWLINE + "ITAL 420" + NEWLINE, courseReport.text());
  }
}
