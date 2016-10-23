package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;

    public Course() {
        course_name ="TBA";
        course_id ="000000";
        lecturer ="TBA";
        max_students =30;
    }

    public Course(String n, String cid) {
        this(n,cid,"TBA",30);
    }

    public Course(String n, String cid, String l) {
        this(n,cid,l,30);
    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";

        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
        setMax_students(max);
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = !course_name.equalsIgnoreCase("")?course_name:this.course_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = isValidCourse_id(course_id)?course_id:this.course_id;
    }

    // implement the other get and set methods here
    public String getLecturer() {
        return this.lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer =  !lecturer.equalsIgnoreCase("")?lecturer:this.lecturer;
    }

    public int getMax_students() {
        return this.max_students;
    }

    public void setMax_students(int max_students) {
        if(max_students > 10){
            this.max_students = max_students;
        }
    }

    public int getNo_students() {
        return this.no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students <= getMax_students() && no_students>=0){
            this.no_students = no_students;
        }
    }

    @Override
    public String toString() {
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has "
                +((this.no_students>0)?(this.no_students==1)?"ONE student":this.no_students
                + " students":"NO student")+", " +"[maximum: "+ this.max_students +"]";
        return o;
    }

    private boolean isValidCourse_id(String id) {
        return id.matches(idREGEX);
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "^[0-9]{6}$";

    // all private attributes

}
