package cpe200;

public class Student {

    private String name;
    private String student_id;
    private int yearOfBirth;
    private boolean active;
    private static final String STUDENT_ID_PATTERN = "^5[6-9]061[0-2][\\d]{3}$";

    public Student() {
        name = "John Doe";
        student_id = "560610000";
        yearOfBirth = 1990;
        active = false;
    }


    public Student(String name, String id) {
        this();
        setName(name);
        setStudent_id(id);
    }

    public Student(String name, String id, int yob) {
        this();
        setName(name);
        setStudent_id(id);
        setYearOfBirth(yob);
    }

    public Student(String name, String id, int yob, boolean status) {
        this();
        setName(name);
        setStudent_id(id);
        setYearOfBirth(yob);
        active = status;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) was born in %d is an %s student.",
                name, student_id, yearOfBirth, (active) ? "ACTIVE" : "INACTIVE");
    }

    private boolean isValidStudent_id(String id) {

        return id.matches(STUDENT_ID_PATTERN);
    }

    private boolean isValidYOB(int yob) {
        return yob > 1989;
    }

    public String getName() {
        return name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public boolean isActive() {
        return active;
    }

    public void setName(String name) {
        if(name.length()>0)
            this.name = name;
    }

    public void setStudent_id(String student_id) {
        if (isValidStudent_id(student_id))
            this.student_id = student_id;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (isValidYOB(yearOfBirth))
            this.yearOfBirth = yearOfBirth;
    }


}