/**
 * Created by wyqin on 3/8/16.
 */
public class CourseSession {
    private String department;
    private String number;

    CourseSession(String department, String number){
        this.department = department;
        this.number = number;
    }

    String getDepartment(){
        return department;
    }

    String getNumber(){
        return number;
    }
}
