/**
 * Created by wyqin on 3/8/16.
 */

package main.java.sis.studentinfo;
public class Student {
    private String name;
    private int credits;
    static final String IN_STATE = "CO";
    static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    private String state = "";

    public Student(String name){
        this.name = name;
        credits = 0;
    }
    public String getName(){
      return name;
    }
    public boolean isFullTime() {
        return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }
    public int getCredits(){
        return credits;
    }
    public void addCredits(int credits) {
        this.credits += credits;
    }
    public boolean isInState() {
        return state.equals(Student.IN_STATE);
    }
    public void setState(String state){
        this.state = state;
    }
}
