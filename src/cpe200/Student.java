package cpe200;

public class Student {
    String stdname;
    String stdid;
    int year;
    boolean status;

    public Student() {
        stdname ="John Doe";
        stdid = "560610000";
        year = 1990;
        status = false;
    }
    public Student(String n,String id){
        this(n,id,1990,false);
    }

    public Student(String n,String id,int yob){
        this(n,id,yob,false);
    }

    public Student(String n,String id,int yob,boolean stat){
        this.stdname = !n.equalsIgnoreCase("")?n:"John Doe";
        this.stdid = isValidStudent_id(id)?id:"560610000";
        this.year = isValidYOB(yob)?yob:1990;
        this.status =stat;
    }

    public boolean isActive(){
        return this.status;
    }
    @Override
    public String toString() {
        String o = this.stdname+" ("+this.stdid+") was born in"+this.year+"is an"+(isActive()?"Active":"Not active")+"student.";
        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    // declare your attributes here

}
