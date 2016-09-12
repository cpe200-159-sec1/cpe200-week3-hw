package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {

    }

    public Course(String n, String cid) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        this.setCourse_name(n);
        this.course_id = !n.equalsIgnoreCase("")?n:"000000";
        this.setCourse_id(cid);
        this.lecturer = !n.equalsIgnoreCase("")?n:"TBA";
        max_students = 30;
        no_students = 0;
    }

    public Course(String n, String cid, String l) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        this.setCourse_name(n);
        this.course_id = !n.equalsIgnoreCase("")?n:"000000";
        this.setCourse_id(cid);
        this.lecturer = !n.equalsIgnoreCase("")?n:"TBA";
        this.setLecturer(l);
        max_students = 30;
        no_students = 0;
    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        this.setCourse_name(n);
        this.course_id = !n.equalsIgnoreCase("")?n:"000000";
        this.setCourse_id(cid);
        this.lecturer = !n.equalsIgnoreCase("")?n:"TBA";
        this.setLecturer(l);
        max_students = 30;
        this.setMax_students(max);
        no_students = 0;
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
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = !lecturer.equalsIgnoreCase("")?lecturer:this.lecturer;
    }

    public int getMax_students() {
        return max_students;
    }

    public void setMax_students(int max_students) {
        if(max_students>=10)
            this.max_students=max_students;
    }

    public int getNo_students() {
        return no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students>=0 && no_students <= max_students)
            this.no_students=no_students;
    }

    @Override
    public String toString() {
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has "+(no_students==0?"NO student":(no_students==1?"ONE student":(no_students+" students")))+", [maximum: "+ max_students+"]";

        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);
        if(m.find())
            return true;
        else return false;
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "^[0-9]{6}$";

    // all private attributes
    private String course_name="TBA";
    private String course_id="000000";
    private String lecturer="TBA";
    private int max_students=30;
    private int no_students=0;
}
