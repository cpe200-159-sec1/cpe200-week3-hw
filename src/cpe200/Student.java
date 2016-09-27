package cpe200;

public class Student {
    private String name = "John Doe", studentID = "560610000";
    private int year = 1990;
    private boolean status = false;

    //Constructor
    public Student() {
    }

    public Student(String n, String id) {
        this(n, id, 1990, false);
    }

    public Student(String n, String id, int yob) {
        this(n, id, yob, false);
    }

    public Student(String n, String id, int yob, boolean s) {
        setName(n);
        setStudent_id(id);
        setYearOfBirth(yob);
        setStatus(s);
    }

    //set_function
    public void setName(String n) {
        if (n != null && (!n.equals("")))
            name = n;
    }

    public void setStudent_id(String id) {
        if (id != null && (isValidStudent_id(id)))
            studentID = id;
    }

    public void setYearOfBirth(int yob) {
        if (isValidYOB(yob))
            year = yob;
    }

    public void setStatus(boolean s) {
        status = s;
    }

    //get_function
    public String getName() {
        return name;
    }

    public String getStudent_id() {
        return studentID;
    }

    public int getYearOfBirth() {
        return year;
    }

    public boolean isActive() {
        return status;
    }
    @Override
    public String toString() {
        String o;
        if (status) o = name + " (" + studentID + ") was born in " + year + " is an ACTIVE student.";
        else o = name + " (" + studentID + ") was born in " + year + " is an INACTIVE student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        String ID = "5[6-9]061[0-2][0-9]{3}";

        return id.matches(ID);
    }

    private boolean isValidYOB(int yob) {

        return (yob > 1989);
    }

    // declare your attributes here

}
