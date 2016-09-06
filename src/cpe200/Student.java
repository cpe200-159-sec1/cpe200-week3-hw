package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    public Student() {
        // implement here
        this("", "", 1990, false);
    }

    // implement all missing constructors here
    public Student(String n, String id)
    {
        this(n, id, 1990, false);
    }

    public Student(String n, String id, int yob)
    {
        this(n, id, yob, false);
    }

    public Student(String n, String id, int yob, boolean stat)
    {
        this.name = !n.equalsIgnoreCase("")?n:"John Doe";
        this.id = isValidStudent_id(id)?id:"560610000";
        this.yob = isValidYOB(yob)?yob:1990;
        this.status = stat;
    }

    // implement all get and set methods here
    public String getName()
    {
        return this.name;
    }

    public String getStudent_id()
    {
        return this.id;
    }

    public int getYearOfBirth()
    {
        return this.yob;
    }

    public boolean isActive()
    {
        return this.status;
    }

    public void setName(String name)
    {
        this.name = !name.equalsIgnoreCase("")?name:this.name;
    }

    public void setStudent_id(String id)
    {
        this.id = isValidStudent_id(id)?id:this.id;
        //this.id = id;
    }

    public void setYearOfBirth(int yob)
    {
        this.yob = isValidYOB(yob)?yob:this.yob;
    }

    @Override
    public String toString() {
        String o = this.name + " (" + this.id + ") was born in " + this.yob + " is an " + (isActive()?"ACTIVE student.":"INACTIVE student.");

        return o;
    }

    private boolean isValidStudent_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        return m.matches();
    }

    private boolean isValidYOB(int yob) {
        return (yob>1989);
    }

    // declare your attributes here
    private static final String idREGEX = "^5[6-9]061[0-2]\\d{3}";
    private String name;
    private String id;
    private int yob;
    private boolean status;
}
