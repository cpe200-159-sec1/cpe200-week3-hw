package cpe200;

public class Student {

    private String Name;
    private String Student_ID;
    private int YOB;
    private boolean Sta;

    public Student() {
        Name = "John Doe";
        Student_ID = "560610000";
        YOB = 1990;
        Sta = false;
    }

    public Student(String n, String id, int yob, boolean f) {
        this();
        setName(n);
        setStudent_id(id);
        setYearOfBirth(yob);
        Sta = f;

    }

    public Student(String n, String id) {
        this();
        setName(n);
        setStudent_id(id);
    }

    public Student(String n, String id, int yob) {
        this();
        setName(n);
        setStudent_id(id);
        setYearOfBirth(yob);
    }

    public String getName() {
        return Name;
    }

    public String getStudent_id() {
        return Student_ID;
    }


    public int getYearOfBirth() {
        return YOB;
    }

    public boolean isActive() {
        return Sta;
    }

    public void setName(String name) {
        if (name.length() != 0) {
            Name = name;
        }
    }

    public void setStudent_id(String id) {
        if (isValidStudent_id(id)) {
            Student_ID = id;
        }
    }

    public void setYearOfBirth(int yob) {
        if (isValidYOB(yob)) {
            YOB = yob;
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%s) was born in %d is an %s student.",
                Name, Student_ID,YOB,Sta?"ACTIVE":"INACTIVE");
    }

    private boolean isValidStudent_id(String id) {
        String rx = "[5][6-9][0][6][1][0-2][0-9][0-9][0-9]";
        if (id.matches(rx))
            return true;
        else return false;
    }

    private boolean isValidYOB(int yob) {
        if (yob > 1989) return true;
        else return false;
    }
}