package studentinfo;

/**
 * Created by wyqin on 3/16/16.
 */
public class RosterReport {
    static final String NEWLINE = System.getProperty("lines.separator");
    static final String ROSTER_REPORT_HEADER =
            "Student" + NEWLINE +
                    "----" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER =
            NEWLINE + "# students = ";

    private CourseSession session;

    RosterReport(CourseSession session) {
        this.session = session;
    }

    String getRosterReport(){
        StringBuilder buffer = new StringBuilder();

        buffer.append(ROSTER_REPORT_HEADER);

        for (Student student: session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }

        buffer.append(ROSTER_REPORT_FOOTER + session.getAllStudents().size() + NEWLINE);

        return buffer.toString();
    }
}
