package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    private String name="TBA";
    private String course_id="000000";
    private int max_student=30;
    private String lecturer="TBA";
    private int no_students=0;

    public Course() {

    }

    public Course(String n, String cid) {
        course_id=(cid.matches(idREGEX))?cid:"000000";
        name=(n.equals(""))?"TBA":n;
    }

    public Course(String n, String cid, String l) {
        String r="^[0-9]{6}$";
        course_id=(cid.matches(r))?cid:"000000";
        name=(n.equals(""))?"TBA":n;
        lecturer=(l.equals(""))?"TBA":l;
    }

    public Course(String n, String cid, String l, int max) {
        String r="^[0-9]{6}$";
        course_id=(cid.matches(r))?cid:"000000";
        name=(n.equals(""))?"TBA":n;
        lecturer=(l.equals(""))?"TBA":l;
        max_student=(max>=10)?max:30;
    }

    public String getCourse_name() {
        return name;
    }

    public void setCourse_name(String course_name) {
        this.name = !course_name.equalsIgnoreCase("")?course_name:this.name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = isValidCourse_id(course_id)?course_id:"261344";
    }

    // implement the other get and set methods here
    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String l) {
        lecturer=(l.equals(""))?"TBA":l;
    }

    public int getMax_students() {

        return max_student;
    }

    public void setMax_students(int max) {
        max_student=(max>=10)?max:30;
    }

    public int getNo_students() {

        return no_students;
    }

    public void setNo_students(int i) {
        no_students=(i>=0&&i<max_student)?i:0;
    }

    @Override
    public String toString() {
        String r="";
        if(no_students==0){r="NO";}
        else if(no_students==1){r="ONE";}
        String o = this.name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has "+((no_students==1||no_students==0)?r+" student, ":(no_students+" students, "))
                +"[maximum: "+max_student+"]";

        return o;
    }

    private boolean isValidCourse_id(String id) {
        return id.matches("^[0-9]{6}$");
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "\\d{6}";

    // all private attributes

}
