public class Student {

    private String nameOfStudent;
    private String idOfStudent;
    private int yearOfBirth;
    private boolean active;


    public Student() {

        nameOfStudent = "John Doe";
        idOfStudent = "560610000";
        yearOfBirth = 1990;
        active = false;

    }
    public Student(String name,String studentId){
        this();
        setName(name);
        setStudent_id(studentId);
    }
    public Student(String name,String studentId,int yearOfBirth){
        this();
        setName(name);
        setStudent_id(studentId);
        setYearOfBirth(yearOfBirth);
    }
    public Student(String name,String studentId,int yearOfBirth,boolean active){
        this();
        setName(name);
        setStudent_id(studentId);
        setYearOfBirth(yearOfBirth);
        setActive(active);
    }



    // implement all missing constructors here

    public void setStudent_id(String idOfStudent) {
        if(isValidStudent_id(idOfStudent))
            this.idOfStudent = idOfStudent;
    }

    public void setName(String nameOfStudent) {
        if(nameOfStudent.length() > 0)
            this.nameOfStudent = nameOfStudent;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(isValidYOB(yearOfBirth))
            this.yearOfBirth = yearOfBirth;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return nameOfStudent;
    }

    public String getStudent_id() {

        return idOfStudent;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public boolean isActive() {
        return active;
    }

        @Override
    public String toString() {
        String o = String.format("%s (%s) was born in %d is an %s student.",getName(),getStudent_id(),getYearOfBirth(),(isActive())?"ACTIVE":"INACTIVE");

        return o;
    }

    private boolean isValidStudent_id(String id) {

        String reg_ex = "^5[6-9]061[0-2][0-9]{3}$";
        return id.matches(reg_ex);
    }

    private boolean isValidYOB(int yob) {
        if(yob > 1986)
            return true;
        else return false;
    }

    // declare your attributes here

}
