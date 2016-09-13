package cpe200;

public class Student {
    String name="John Doe";
    String studentID="560610000";
    int yearofbirth=1990;
    boolean status=false;

    public Student() {

    }
    public Student(String a,String b) {
        name=(a.equals("")?"John Doe":a);studentID=(isValidStudent_id(b))?b:"560610000";
    }
    public Student(String a,String b,int c) {
        name=(a.equals("")?"John Doe":a);studentID=(isValidStudent_id(b))?b:"560610000";
        yearofbirth=(isValidYOB(c))?c:1990;
    }
    public Student(String a,String b,int c,boolean d) {
        name=(a.equals("")?"John Doe":a);studentID=(isValidStudent_id(b))?b:"560610000";
        yearofbirth=(isValidYOB(c))?c:1990;
        status=d;
    }


    @Override
    public String toString() {
        String a=(status)?"ACTIVE":"INACTIVE";
        String o =name+" ("+studentID+") was born in "+yearofbirth+" is an "+a+" student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        long y;
        y=(id.length()==9)?Integer.parseInt(id):0;
        return (y>=560000000&&y<600000000)&&(y%10000>=0&&y%10000<=2999);
    }

    private boolean isValidYOB(int yob) {
        return (yob>1989)?true:false;
    }

    public String getName(){return name;}
    public String getStudent_id(){return studentID;}
    public int getYearOfBirth(){return yearofbirth;}
    public boolean isActive(){return status;}
    public void setName(String a){name=a.equals("")?"John Doe":a;}
    public void setStudent_id(String a){studentID=isValidStudent_id(a)?a:"560610000";}
    public void setYearOfBirth(int i){yearofbirth=(isValidYOB(i))?i:1990;}
}