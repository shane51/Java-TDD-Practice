/**
 * Created by wyqin on 3/8/16.
 */

package studentinfo;
import junit.framework.TestCase;
import java.util.*;

public class CourseSessionTest extends TestCase {
    private CourseSession session;
    private Date startDate;

    Date creatDate(int year, int month, int date){
        return new Date(year - 1900, month - 1, date);
    }

    public void setUp(){
        startDate = creatDate(2003,1,6);
        session = new CourseSession("ENGL", "101", startDate);
    }

    public void testCreate(){

        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
    }
    public void testEnrollStudents(){


        Student student1 = new Student("Cain DiVoe");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1,session.get(0));

        Student student2 = new Student("Coralee DeVaughn");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));

    }

    public void testCourseDates(){
        int year = 103;
        int month = 3;
        int date = 25;
        Date sixteenWeeksOut = new Date(year, month, date);
        assertEquals(sixteenWeeksOut, session.getEndDate());


    }
}