package cpe200;

public class Student {
    private String name= "John Doe",id= "560610000";
    private int yob= 1990;
    private boolean status= false;
    public Student() {
        this.name = "John Doe";
        this.id = "560610000";
        this.yob = 1990;
        this.status = false;
    }

    public Student(String name, String id) {
        this.name = name;
        if(isValidStudent_id(id))
            this.id = id;
    }

    public Student(String name, String id, int yob) {
        this.name = name;
        if(isValidStudent_id(id))
            this.id = id;
        if(isValidYOB(yob))
            this.yob = yob;
    }

    public Student(String name, String id, int yob, boolean status) {
        this.name = name;
        if(isValidStudent_id(id))
            this.id = id;
        if(isValidYOB(yob))
            this.yob = yob;
        this.status = status;
    }
    public String getName()
    {
        return  this.name;
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
        return status;
    }
    public void setName(String name)
    {
        if(!name.equals(""))
            this.name=name;
    }
    public void setStudent_id(String id)
    {
        if(isValidStudent_id(id))
            this.id=id;
    }
    public void setYearOfBirth(int yob)
    {
        if(isValidYOB(yob))
            this.yob = yob;
    }
// implement all missing constructors here

    // implement all get and set methods here

    @Override
    public String toString() {
        String o = this.name+" ("+this.id+") was born in "+this.yob+" is an "+(this.status?"ACTIVE":"INACTIVE")+" student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        if(id.matches("^5[6-9]061[0-2][0-9]{3}$"))
            return true;
        return false;
    }

    private boolean isValidYOB(int yob) {
        if(yob>1989)
            return true;
        return false;
    }

    // declare your attributes here

}