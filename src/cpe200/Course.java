package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        this("","","",30);
    }

    public Course(String n, String cid) {
        this(n,cid,"",30);
    }

    public Course(String n, String cid, String l) {
        // implement here
        this.course_id = cid;
        this.course_name = n;
        this.lecturer = l;
    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        // implement the rest here
        this.course_id = cid;
        this.course_name = n;
        this.lecturer = l;
        this.max_students = max;
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
        // implement here
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        // implement here
        this.lecturer = !lecturer.equalsIgnoreCase("")?lecturer:this.lecturer;
    }

    public int getMax_students() {
        // implement here
        return max_students;
    }

    public void setMax_students(int max_students) {
        // implement here
        this.max_students = max_students;
    }

    public int getNo_students() {
        // implement here
        return no_students;
    }

    public void setNo_students(int no_students) {
        // implement here
        this.no_students = no_students;
    }

    @Override
    public String toString() {
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has ";

        // implement the rest here
        return String.format("%s (%s), Teacher: %s, has %s student%s, [maximum: %d]",
                course_name, course_id, lecturer,
                no_students==0?"NO":no_students==1?"ONE":String.valueOf(no_students)
                ,no_students>1?"s":"", max_students);
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        // implement the rest here
        if (id.matches(idREGEX)) return  true;
        else return false;
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "\\d{6}";

    // all private attributes
    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;
}
