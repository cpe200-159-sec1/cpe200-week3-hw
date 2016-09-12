package cpe200;

public class Student {

    public Student() {
        // implement here
    }
    // implement all missing constructors here
    public Student(String name, String ID){
        this.setName(name);
        this.setStudent_id(ID);
    }
    public Student(String name, String ID, int yof){
        this.setName(name);
        this.setStudent_id(ID);
        this.setYearOfBirth(yof);
    }
    public Student(String name, String ID, int yof, boolean status){
        this.setName(name);
        this.setStudent_id(ID);
        this.setYearOfBirth(yof);
        this.setStatus(status);
    }

    // implement all get and set methods here
    public void setName(String n){
        if (n.isEmpty()){}
        else name = n;
    }

    public void setStudent_id(String id){
        if (isValidStudent_id(id)) ID = id;
    }

    public void setYearOfBirth(int y){
        if (isValidYOB(y)) yof = y;
    }

    public void setStatus(boolean sta){
        status = sta;
    }

    public String getName(){
        return name;
    }

    public String getStudent_id(){
        return ID;
    }

    public int getYearOfBirth(){
        return yof;
    }

    public boolean isActive(){
        return status;
    }

    @Override
    public String toString() {
        String o = name + " (" + ID + ") " + "was born in " + yof + " is an " + (status == true ? "ACTIVE" : "INACTIVE") + " student.";
        return o;
    }

    private boolean isValidStudent_id(String id) {
        String temp = "^5[6-9]061[0-2][0-9]{3}";
        if (id.matches(temp)) return true;
        else return false;
    }

    private boolean isValidYOB(int yob) {
        if (yob >= 1990) return true;
        else return false;
    }

    // declare your attributes here
    private String name="John Doe", ID="560610000";
    private int yof=1990;
    private boolean status=false;

}
