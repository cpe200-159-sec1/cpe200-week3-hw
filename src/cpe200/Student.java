package cpe200;

public class Student {

    private String name;
    private String student_id;
    private int yob;
    private boolean isActive;

    public Student() {
        this.name = "John Doe";
        this.student_id = "560610000";
        this.yob = 1990;
        this.isActive = false;
    }
    public Student(String newName, String id) {
        setName(newName);
        setStudent_id(id);
        this.yob = 1990;
        this.isActive = false;
    }
    public Student(String newName, String id,int newYob) {
        setName(newName);
        setStudent_id(id);
        setYearOfBirth(newYob);
        this.isActive = false;
    }
    public Student(String newName, String id,int newYob, boolean active) {
        setName(newName);
        setStudent_id(id);
        setYearOfBirth(newYob);
        this.isActive = active;
    }

    // implement all missing constructors here

    public String getName(){
        return this.name;
    }
    public String getStudent_id(){
        return  this.student_id;
    }
    public int getYearOfBirth(){
        return this.yob;
    }
    public boolean isActive(){
        return isActive;
    }

    public void setName(String name){
        if(name.isEmpty() && this.name == null)
            this.name = "John Doe";
        else if(this.name == null)
                this.name = name;
    }
    public void setStudent_id(String student_id){
        if(isValidStudent_id(student_id)){
            this.student_id = student_id;
        }else if(this.student_id == null)
                    this.student_id = "560610000";
    }
    public void setYearOfBirth(int yob){
        if(isValidYOB(yob))
            this.yob = yob;
        else if(this.yob == 0)this.yob = 1990;

    }
    // implement all get and set methods here

    @Override
    public String toString() {
        String o = "" +getName()+" ("+getStudent_id()+") was born in "+Integer.toString(getYearOfBirth())+" is an ";
        if(isActive())
            o = o+"ACTIVR student.";
        else o = o+"INACTIVE student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        String Check = "[5][6-9][0][6][1][0-2][0-9][0-9][0-9]";
            if (id.matches(Check))
                return true;
            return false;
    }

    private boolean isValidYOB(int yob) {
        if(yob > 1989)
        return true;
        else return false;
    }

    // declare your attributes here

}
