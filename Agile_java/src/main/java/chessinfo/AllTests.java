package main.java.chessinfo;
import main.java.chessinfo.pieces.*;
import junit.framework.TestSuite;
/**
 * Created by wyqin on 3/16/16.
 */
public class AllTests {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(BoardTest.class);
        return suite;
    }
}
