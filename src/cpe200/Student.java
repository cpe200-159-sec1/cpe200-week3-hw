package cpe200;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import com.sun.org.apache.xpath.internal.operations.String;

public class Student {
    private String student_name;
    private String student_id;
    private int yob;
    private boolean sta;

    public Student() {
        this("", "", 1990, false);
    }

    public void setName(String n) {
        this.student_id = !student_name.equalsIgnoreCase("") ? student_name : this.student_name;
    }

    public void setStudent_id(String id) {
        this.student_id = isValidStudent_id(id)? id:this.student_id;
    }

    public void setYearOfBirth(int y) {
        this.yob = isValidYOB(y) ? yob:this.yob;
    }

    public String getName() {
        return student_name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public int getYearOfBirth() {
        return yob;
    }

    public Boolean isActive() {
        return sta;
    }

    public Student(String n, String id) {
        this(n, id, 1990, false);
    }

    public Student(String n, String id, int y) {
        this(n, id, y, false);
    }

    public Student(String n, String id, int y, boolean a) {
        this.student_name = !n.equalsIgnoreCase("") ? n : "John Doe";
        this.student_id = isValidStudent_id(id) ? id : "560610000";
        this.yob = isValidYOB(y) ? y : 1990;
        this.sta = a;
    }

    @Override
    public String toString() {
        String o = this.student_name
                + " (" + this.student_id + ") was born in "
                + this.yob + " is an " + (isActive() ? "ACTIVE" : "INACTIVE")
                + " student.";
        return  o;
    }

    private static final String idREGEX = "5[6-9]061[0-2][0-9]{3}";

    private boolean isValidStudent_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);
        return m.matches();
    }

    private boolean isValidYOB(int y) {
        return (y >= 1990);
    }
    // declare your attributes here
}
