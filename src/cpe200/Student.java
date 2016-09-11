package cpe200;

public class Student {
    String name, studentID;
    int year;
    boolean status;

    //Constructor
    public Student() {
        setName("John Doe");
        setStudent_id("560610000");
        setYearOfBirth(1990);
        setStatus(false);
    }

    public Student(String n, String id) {
        setName(n);
        setStudent_id(id);
        setYearOfBirth(1990);
        setStatus(false);
    }

    public Student(String n, String id, int yob) {
        setName(n);
        setStudent_id(id);
        setYearOfBirth(yob);
        setStatus(false);
    }

    public Student(String n, String id, int yob, boolean s) {
        setName(n);
        setStudent_id(id);
        setYearOfBirth(yob);
        setStatus(s);
    }

    //set_function
    public void setName(String n) {
        if (!n.isEmpty())
            name = n;
    }

    public void setStudent_id(String id) {
        if (isValidStudent_id(id))
            studentID = id;
        if (studentID == null)
            studentID = "560610000";
    }

    public void setYearOfBirth(int yob) {
        if (isValidYOB(yob))
            year = yob;
        if (year == 0)
            year = 1990;
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
        String ID = "[5][6-9][0][6][1][0-2][0-9]{3}";

        return id.matches(ID);
    }

    private boolean isValidYOB(int yob) {

        return (yob > 1989);
    }

    // declare your attributes here

}
