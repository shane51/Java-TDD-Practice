/**
 * Created by wyqin on 3/8/16.
 */
public class CourseSessionTest extends junit.framework.TestCase {
    public void testCreate(){
        CourseSession session = new CourseSession("ENGL","101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
    }
}
