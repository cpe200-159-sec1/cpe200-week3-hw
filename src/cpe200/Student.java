package cpe200;

public class Student {

    String Name;
    String Student_id;
    int YOB;
    boolean Stat;

    public Student() {

        Name = "John Doe";
        Student_id = "560610000";
        YOB = 1990;
        Stat = false;

        // implement here

    }

    // implement all missing constructors here
    public  Student(String name,String id,int y,boolean s){
        this.Name = !name.equalsIgnoreCase("")?name:"John Doe";
        this.Student_id = isValidStudent_id(id)?id:"560610000";
        this.YOB = isValidYOB(y)?y:1990;
        this.Stat = s;
    }

    public Student(String n, String ID, int yob)
    {
        this(n, ID, yob, false);
    }
    public Student(String n, String ID)
    {
        this(n, ID, 1990, false);
    }
    // implement all get and set methods here
    public String getName(){
        return this.Name;
    }
    public  String getStudent_id(){
        return this.Student_id;
    }

    public  int getYearOfBirth(){
        return  this.YOB;
    }
    public  boolean isActive(){
        return this.Stat;
    }



    public void setName(String n){
        this.Name = !n.equalsIgnoreCase("")?n:this.Name;
    }
    public  void  setStudent_id(String id){
        this.Student_id = isValidStudent_id(id)?id:this.Student_id;
    }
    public  void setYearOfBirth(int y){
        this.YOB = isValidYOB(y)?y:this.YOB;
    }
    @Override
    public String toString() {
        String o = this.Name + " (" + this.Student_id + ") was born in " + this.YOB + " is an " + (isActive()?"ACTIVE student.":"INACTIVE student.");

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

}
