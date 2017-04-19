package test.java.cn.tdd;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase {

  public static TestSuite suite() {
    TestSuite testSuite = new TestSuite();
    testSuite.addTestSuite(StudentTest.class);
    testSuite.addTestSuite(CourseSessionTest.class);
    testSuite.addTestSuite(RosterReporterTest.class);
    return testSuite;
  }
}
