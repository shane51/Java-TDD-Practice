/**
 * Created by wyqin on 3/8/16.
 */
public class CourseSessionTest extends junit.framework.TestCase {
    public void testCreate(){
        CourseSession session = new CourseSession("ENGL","101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
    }
    public void testEnrollStudents(){
        CourseSession session = new CourseSession("ENGL","101");

        Student student1 = new Student("Cain DiVoe");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        java.util.ArrayList<Student> allStudents = session.getAllStudents();
        assertEquals(1, allStudents.size());
        assertEquals(student1,allStudents.get(0));

        Student student2 = new Student("Coralee DeVaughn");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(2, allStudents.size());
        assertEuqals(student1, allStudents.get(0));
        assertEuqals(student2, allStudents.get(1));

    }
}
