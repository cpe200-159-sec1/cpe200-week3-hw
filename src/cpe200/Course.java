package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        course_name = "TBA";
        course_id = "000000";
        lecturer = "TBA";
        max_students = 30;
        no_students = 0;
    }
/*
    ##Course Class
    Attributes:
            * Course name : name of the course, CANNOT be empty (""), default value is "TBA"
            * Course ID : course id number, default value is "000000", MUST be in the pattern of "NNNNNN" where ...
            * N is a number in [0-9]
            * Lecturer : name of lecturer(s), CANNOT be empty (""), default value is "TBA"
            * Maximum #Student : maximum number of students, CANNOT be less than 10, default value is 30
            * Current #Student : current number of students, MUST be in the range of [0-MAX], default value is 0
    */
    public Course(String n, String cid) {
        this();
        setCourse_name(n);
        setCourse_id(cid);
    }

    public Course(String n, String cid, String l) {
        this();
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
    }

    public Course(String n, String cid, String l, int max) {
        this();
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
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        if(lecturer.length() > 0)
            this.lecturer = lecturer;
    }

    public int getMax_students() {
        return max_students;
    }

    public void setMax_students(int max_students) {
        if(max_students>10)
            this.max_students = max_students;
    }

    public int getNo_students() {
        return no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students>=0 && no_students <= max_students)
            this.no_students = no_students;
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
        return id.matches(idREGEX);
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
