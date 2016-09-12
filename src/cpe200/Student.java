package cpe200;

public class Student {

    public Student() {
        // implement here
        this("","",1990,false);
    }

    // implement all missing constructors here
    public Student(String name, String id){
        this(name,id,1990,false);

    }
    public Student(String name, String id, int yb){
        this(name,id,yb,false);


    }

    public Student(String name, String id, int yb, boolean stat){
        this.student_name = !name.equalsIgnoreCase("")?name:"John Doe";
        this.student_id = isValidStudent_id(id)?id:"560610000";
        this.yob = isValidYOB(yb)?yb:1990;
        this.status = stat;

    }

    // implement all get and set methods here

    public String getName(){

        return this.student_name;
    }

    public String getStudent_id(){

        return this.student_id;
    }

    public int getYearOfBirth(){

        return this.yob;
    }

    public boolean isActive(){

        return this.status;
    }

    public void setName(String name){

        this.student_name = !name.equalsIgnoreCase("")?name:this.student_name;
    }

    public void setStudent_id(String id){

        this.student_id = isValidStudent_id(id)?id:this.student_id;

    }

    public void setYearOfBirth(int yb){

        this.yob = isValidYOB(yb)?yb:this.yob;
    }


    @Override
    public String toString() {
        String o = this.student_name + " (" + this.student_id + ") was born in " + this.yob + " is an " + (isActive()?"ACTIVE student.":"INACTIVE student.");

        return o;
    }

    private boolean isValidStudent_id(String id) {
        String Check = "[5][6-9][0][6][1][0-2][0-9][0-9][0-9]";
        if (id.matches(Check)) return true;
        else  return false;
    }

    private boolean isValidYOB(int yob) {

        if (yob > 1989) return true;
        else return false;
    }

    // declare your attributes here
    private String  student_name;
    private String  student_id;
    private int     yob;
    private boolean status;


}
