/**
 * Created by wyqin on 1/11/16.
 */

package main.java.sis.studentinfo;
import junit.framework.TestCase;

public class StudentTest extends TestCase {
    public void testCreate(){
        final String firstStudentName = "Jane Doe";
        Student firstStudent = new Student(firstStudentName);
        assertEquals(firstStudentName, firstStudent.getName());

        final String secondStudentName = "Joe Blow";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName,firstStudent.getName());
    }

    public void testFullTime(){
        Student student = new Student("a");
        assertFalse(student.isFullTime());
    }

    public void testCredits(){
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        student.addCredits(3);
        assertEquals(3, student.getCredits());
        student.addCredits(4);
        assertEquals(7, student.getCredits());
    }
}
