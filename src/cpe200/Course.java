package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {
    protected final static String Course_id = "000000";
    protected final static String Course_name = "TBA";
    protected final static String Coures_lecturer ="TBA";
    protected final static int Students_max = 30;
    protected final static int Students_no = 0;

    public Course() {
        this.course_name = Course_name;
        this.course_id = Course_id;
        this.lecturer = Coures_lecturer;
        this.max_students = Students_max;
    }

    public Course(String n, String cid) {
        this.course_name = n;
        this.course_id = cid;
        this.lecturer = Coures_lecturer;
        this.max_students = Students_max;
    }

    public Course(String n, String cid, String l) {
        this.course_name = n;
        this.course_id = cid;
        this.lecturer = l;
        this.max_students = Students_max;
    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        this.course_id = !cid.equalsIgnoreCase("")?cid:Course_id;
        this.lecturer = !l.equalsIgnoreCase("")?l:Coures_lecturer;
        if(max < 10)
        {
            this.max_students = Students_max;
        }
        else this.max_students = max;
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
        // implement her
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer =!lecturer.equalsIgnoreCase("")?lecturer:this.lecturer;
    }

    public int getMax_students() {

        return Students_max;
    }

    public void setMax_students(int max_students) {
        if(max_students >= 10)
        {
            this.max_students = max_students;
        }
    }

    public int getNo_students() {
        return Students_no;
    }

    public void setNo_students(int no_students) {
        if(no_students >= 0 && no_students <= max_students)
        {
            this.no_students = no_students;
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%s), Teacher: %s, has %s student%s, [maximum: %s]",
                course_name,
                course_id,
                lecturer,
                (no_students==0)?"NO":(no_students==1)?"ONE":String.valueOf(no_students),
                (no_students>1)?"s":"",
                max_students);
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        if(m.find() && id.length() == 6)
        {
            return true;
        }

        return false;
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
