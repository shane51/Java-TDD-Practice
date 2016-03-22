package main.java.sis.report;
import main.java.sis.studentinfo.*;

import junit.framework.TestCase;
import java.util.*;
/**
 * Created by wyqin on 3/16/16.
 */
public class RosterReportTest extends TestCase {
    public void testCreate(){
        CourseSession session = CourseSession.create("ENL", "101", DateUtil.createDate(2003,1,6));

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = new RosterReport(session).getRosterReport();
        System.out.println(rosterReport);
        assertEquals(
                RosterReport.ROSTER_REPORT_HEADER +
                        "A" + RosterReport.NEWLINE +
                        "B" + RosterReport.NEWLINE +
                        RosterReport.ROSTER_REPORT_FOOTER +
                        "2" + RosterReport.NEWLINE,
                rosterReport
        );


    }
}
