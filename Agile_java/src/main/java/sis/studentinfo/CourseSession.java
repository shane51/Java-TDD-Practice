/**
 * Created by wyqin on 3/8/16.
 */

package main.java.sis.studentinfo;
import java.util.*;

/**
 * Provides a representation of a single-semester
 * session of a specific university course.
 * @auther Shane Qin
 */

public class CourseSession {

    static int count;

    private String department;
    private String number;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;



    public CourseSession(String department, String number, Date startDate){
        this.department = department;
        this.number = number;
        this.startDate = startDate;
        CourseSession.count += 1;
    }

    public void enroll(Student student){
        students.add(student);
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }
    CourseSession() {
    }

    /**
     * Constructs a CourseSession starting on a specific date
     *
     * @param startDate the date on which the CourseSession begins
     */
    CourseSession(Date startDate){
        this.startDate = startDate;
    }

    String getDepartment(){
        return department;
    }

    String getNumber(){
        return number;
    }

    Date getStartDate(){
        return startDate;
    }

    int getNumberOfStudents(){
        return students.size();
    }



    Student get(int index){
        return students.get(index);
    }



    /**
     * @return Date the last date of the course session
     */
    Date getEndDate() {
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }


}
