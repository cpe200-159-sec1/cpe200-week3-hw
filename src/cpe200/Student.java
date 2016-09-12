package cpe200;

public class Student {

    public Student() {
    }

    // implement all missing constructors here
    public Student(String student_name, String student_id) {
        this.setName(student_name);
        this.setStudent_id(student_id);
    }

    public Student(String student_name, String student_id, int yob) {
        this.setName(student_name);
        this.setStudent_id(student_id);
        this.setYearOfBirth(yob);
    }

    public Student(String student_name, String student_id, int yob, boolean status) {
        this.setName(student_name);
        this.setStudent_id(student_id);
        this.setYearOfBirth(yob);
        this.setStatus(status);
    }

    // implement all get and set methods here
    public String getName() {
        return student_name;
    }

    public void setName(String student_name) {
        if (student_name.length()!=0){
            this.student_name = student_name;
        }
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        if (isValidStudent_id(student_id)){
            this.student_id = student_id;
        }
    }

    public int getYearOfBirth() {
        return yob;
    }

    public void setYearOfBirth(int yob) {
        if (isValidYOB(yob)){
            this.yob = yob;
        }
    }

    public boolean isActive() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String o = getName() + " (" + getStudent_id() + ") was born in " + getYearOfBirth() + " is an " + (isActive()?"ACTIVE":"INACTIVE") + " student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        String regx = "^5[6-9]061[0-2][0-9]{3}$";
        return id.matches(regx);
    }

    private boolean isValidYOB(int yob) {
        return yob > 1989;
    }

    // declare your attributes here
    private String student_name = "John Doe";
    private String student_id = "560610000";
    private int yob = 1990;
    private boolean status = false;
}
