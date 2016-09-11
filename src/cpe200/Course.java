package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {

    }

    public Course(String n, String cid) {
        this.setCourse_name(n);
        this.setCourse_id(cid);
    }

    public Course(String n, String cid, String l) {
        this.setCourse_name(n);
        this.setCourse_id(cid);
        this.setLecturer(l);
    }

    public Course(String n, String cid, String l, int max) {
        this.setCourse_name(n);
        this.setCourse_id(cid);
        this.setLecturer(l);
        this.setMax_students(max);
    }

    public String getCourse_name()
    {
        return course_name;
    }

    public void setCourse_name(String course_name)
    {
        if(!course_name.isEmpty())
        {
            this.course_name=course_name;
        }
    }

    public String getCourse_id()
    {
        return course_id;
    }

    public void setCourse_id(String course_id)
    {
        String test="^[0-9]{1,6}$";
        if(course_id.matches(test))
        {
            this.course_id=course_id;
        }
    }

    public String getLecturer()
    {
        return this.lecturer;
    }

    public void setLecturer(String lecturer)
    {
        if(!lecturer.isEmpty())
        {
            this.lecturer=lecturer;
        }
    }

    public int getMax_students()
    {
        return this.max_students;
    }

    public void setMax_students(int max_students)
    {
        if(max_students>=10)
        {
            this.max_students = max_students;
        }
    }

    public int getNo_students()
    {
        return this.no_students;
    }

    public void setNo_students(int no_students)
    {
        if(no_students>0&&no_students<=this.max_students)
        {
            this.no_students=no_students;
        }
    }

    @Override
    public String toString() {
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has "+((this.no_students==0) ? "NO student":(this.no_students>2) ?
                this.no_students+" students":"ONE student") + ", "
                +"[maximum: " + this.max_students + "]";
        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);
        return m.matches();
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "\\d{6}";

    // all private attributes
    private String course_name="TBA";
    private String course_id="000000";
    private String lecturer="TBA";
    private int max_students=30;
    private int no_students=0;
}
