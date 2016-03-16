/**
 * Created by wyqin on 3/9/16.
 */
package studentinfo;
import junit.framework.TestSuite;

public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();

        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(RosterReportTest.class);
        suite.addTestSuite(DateUtilTest.class);
        return suite;
    }
}
