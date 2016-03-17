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
}
