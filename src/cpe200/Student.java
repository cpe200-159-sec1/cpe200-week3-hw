package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    public Student() {
        this("","",1990,false);
    }

    public Student(String name,String sid){
        this(name,sid,1990,false);
    }

    public Student(String name,String sid,int yob){
        this(name,sid,yob,false);
    }

    public Student(String name,String sid,int yob,boolean status) {
        this.student_name = !name.equalsIgnoreCase("") ? name : "John Doe";
        this.student_id = isValidStudent_id(sid) ? sid : "560610000";
        this.YOB = isValidYOB(yob)? yob : 1990;
        this.Status = status;
    }

    public boolean isActive(){
        return  Status;
    }

    public  void setYearOfBirth(int yob){
        this.YOB = isValidYOB(yob) ? yob:this.YOB;
    }


    public int getYearOfBirth(){
        return  YOB;
    }

    public void  setName(String student_name){
        this.student_id = !student_name.equalsIgnoreCase("") ? student_name:this.student_name;
    }

    public String  getName(){
        return  student_name;
    }

    public void setStudent_id(String student_id){
        this.student_id = isValidStudent_id(student_id)? student_id:this.student_id;
    }

    public  String getStudent_id(){
        return student_id;
    }
    @Override
    public String toString() {
        String o = this.student_name + " ("
                + this.student_id +") was born in "
                + this.YOB + " is an "
                + (isActive() ? "ACTIVE":"INACTIVE") + " student.";
        return o;
    }

    private static final String idREGEX = "5[6-9]061[0-2][0-9]{3}";

    private boolean isValidStudent_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);
        return m.matches();
    }

    private boolean isValidYOB(int yob) {
        return (yob>=1990);
    }

    private String student_name;
    private String student_id;
    private int YOB;
    private boolean Status;
}
