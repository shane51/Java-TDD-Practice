package sis.report;
import junit.framework.*;
/**
 * Created by wyqin on 3/16/16.
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(RosterReportTest.class);
        return suite;
    }

}
