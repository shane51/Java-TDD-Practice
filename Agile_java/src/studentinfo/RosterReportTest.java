package studentinfo;
import junit.framework.TestCase;
import java.util.*;
/**
 * Created by wyqin on 3/16/16.
 */
public class RosterReportTest extends TestCase {
    public void testCreate(){
        CourseSession session = new CourseSession("ENL", "101", createDate(2003,1,6));

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = session.getRosterReport();
        assertEquals(
                CourseSession.ROSTER_REPORT_HEADER +
                        "A" + CourseSession.NEWLINE +
                        "B" + CourseSession.NEWLINE +
                        CourseSession.ROSTER_REPORT_FOOTER +
                        "2" + CourseSession.NEWLINE,
                rosterReport
        );


    }
    Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }
}
