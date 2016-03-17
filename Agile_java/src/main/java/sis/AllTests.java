/**
 * Created by wyqin on 3/9/16.
 */
package main.java.sis;
import junit.framework.TestSuite;

public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(main.java.sis.report.AllTests.suite());
        suite.addTest(main.java.sis.studentinfo.AllTests.suite());
        return suite;
    }
}
