/**
 * Created by wyqin on 3/8/16.
 */

package main.java.sis.studentinfo;
public class Student {
    private String name;
    private int credits;
    public Student(String name){
        this.name = name;
        credits = 0;
    }
    public String getName(){
      return name;
    }
    public boolean isFullTime() {
        return credits >= 12;
    }
    public int getCredits(){
        return credits;
    }
    public void addCredits(int credits) {
        this.credits += credits;
    }
}
