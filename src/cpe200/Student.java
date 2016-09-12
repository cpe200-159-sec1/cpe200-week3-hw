package cpe200;

import java.time.Year;

public class Student {

    String Name;
    String StudentID;
    int YB;
    boolean Status;

    public Student() {
        Name = "John Doe";
        StudentID = "560610000";
        YB = 1990;
        Status = false;

    }

    // implement all missing constructors here
    public Student(String n, String ID)
    {
        this(n, ID, 1990, false);
    }

    public Student(String n, String ID, int yob)
    {
        this(n, ID, yob, false);
    }

    public Student(String n, String ID, int yob, boolean status)
    {
        this.Name = !n.equalsIgnoreCase("")?n:"John Doe";
        this.StudentID = isValidStudent_id(ID)?ID:"560610000";
        this.YB = isValidYOB(yob)?yob:1990;
        this.Status = status;
    }

    // implement all get and set methods here

    public String getName()
    {
        return this.Name;
    }

    public String getStudent_id()
    {
        return this.StudentID;
    }

    public int getYearOfBirth()
    {
        return this.YB;
    }

    public boolean isActive()
    {
        return this.Status;
    }

    public void setName(String name)
    {
        this.Name = !name.equalsIgnoreCase("")?name:this.Name;
    }

    public void setStudent_id(String id)
    {
        this.StudentID = isValidStudent_id(id)?id:this.StudentID;

    }

    public void setYearOfBirth(int yob)
    {
        this.YB = isValidYOB(yob)?yob:this.YB;
    }

    @Override
    public String toString() {
        String o = this.Name + " (" + this.StudentID + ") was born in " + this.YB + " is an " + (isActive()?"ACTIVE student.":"INACTIVE student.");

        return o;
    }

    private boolean isValidStudent_id(String id) {
        String Check = "[5][6-9][0][6][1][0-2][0-9][0-9][0-9]";
        if (id.matches(Check)) return true;
        else  return false;
    }

    private boolean isValidYOB(int YB) {

        if (YB > 1989) return true;
        else return false;
    }
}
