package cpe200;

public class Student {
    String name;
    String sid;
    int yrb;
    boolean status;
    public Student() {
        // implement here
        this.name = "John Doe";
        this.sid = "560610000";
        this.yrb = 1990;
        this.status = false;
    }

    // implement all missing constructors here
    public Student(String n, String ssid){
        this(n, ssid, 1990, false);
    }

    public Student(String n, String ssid, int yrbi){
        this(n, ssid, yrbi, false);
    }

    public Student(String n, String ssid, int yrbi, boolean sts){
        this.name = n.matches("")?"John Doe":n;
        this.sid = isValidStudent_id(ssid)?ssid:"560610000";
        this.yrb = isValidYOB(yrbi)?yrbi:1990;
        this.status = sts;
    }

    // implement all get and set methods here
    public String getName(){
        return this.name;
    }

    public String getStudent_id(){
        return this.sid;
    }

    public int getYearOfBirth(){
        return this.yrb;
    }

    public boolean isActive(){
        return this.status;
    }


    public void setName(String n){
        this.name = (n.matches(""))?this.name:n;
    }

    public void setStudent_id(String ssid){
        this.sid = isValidStudent_id(ssid)?ssid:this.sid;
    }

    public void setYearOfBirth(int yrsi){
        this.yrb = isValidYOB(yrsi)?yrsi:this.yrb;
    }

    @Override
    public String toString() {
        return this.name    + " (" + this.sid + ") was born in "
                            + this.yrb + " is an "
                            + (isActive()?"ACTIVE student.":"INACTIVE student.");
    }

    private boolean isValidStudent_id(String id) {
        if (id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$")) return true;
        return false;
    }

    private boolean isValidYOB(int yrbi) {
        return (yrbi >= 1990);
    }

    // declare your attributes here
}
