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
    public void setName(String n){
        if(n.length()>0){
            this.stdname=n;
        }
    }

    public  void setStudent_id(String id){
        if(isValidStudent_id(id)){
            this.stdid=id;
        }
    }

    public void setYearOfBirth(int yob){
        if (isValidYOB(yob)){
            this.year=yob;
        }
    }

    public String getName(){
        return this.stdname;
    }

    public String getStudent_id(){
        return this.stdid;
    }

    public int getYearOfBirth(){
        return this.year;
    }

    public boolean isActive(){
        return this.status;
    }
    @Override
    public String toString() {
        String o = this.stdname+" ("+this.stdid+") was born in "+this.year+" is an "+(isActive()?"ACTIVE":"INACTIVE")+" student.";
        return o;
    }

    private boolean isValidStudent_id(String id) {
        String Check = "[5][6-9][0][6][1][0-2][0-9][0-9][0-9]";
        if (id.matches(Check)) return true;
        else  return false;
    }

    private boolean isValidYOB(int yob) {
        if (yob >= 1989) return true;
        else return false;
    }

    // declare your attributes here

}
