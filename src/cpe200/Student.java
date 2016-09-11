package cpe200;

public class Student {
    private String name="John Doe";
    private String ID="560610000";
    private int year=1990;
    private boolean status=false;

    public Student() {

    }

    public Student(String in_Name,String in_id)
    {
        if(isValidName(in_Name))
        {
            this.name=in_Name;
        }
        if(isValidStudent_id(in_id))
        {
            this.ID=in_id;
        }
    }

    public Student(String in_Name,String in_id,int in_year)
    {
        if(isValidName(in_Name))
        {
            this.name=in_Name;
        }
        if(isValidStudent_id(in_id))
        {
            this.ID=in_id;
        }
        if(isValidYOB(in_year))
        {
            this.year = in_year;
        }
    }

    public Student(String in_Name,String in_id,int in_year,boolean in_status)
    {
        if(isValidName(in_Name))
        {
            this.name=in_Name;
        }
        if(isValidStudent_id(in_id))
        {
            this.ID=in_id;
        }
        if(isValidYOB(in_year))
        {
            this.year = in_year;
        }
        this.status=in_status;
    }

    @Override
    public String toString() {
        String o = this.name+" ("+this.ID+") was born in "
                +this.year+" is an "+(this.status?"ACTIVE":"INACTIVE")+" student.";
        return o;
    }

    private boolean isValidName(String name)
    {
        if(name.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    private boolean isValidStudent_id(String id) {
        String valid="^[0-9][6-9][0-9][0-9][0-9][0-2][0-9][0-9][0-9]$";
        if(id.matches(valid))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean isValidYOB(int yob) {
        if(yob<=1989)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public String getName()
    {
        return this.name;
    }

    public String getStudent_id()
    {
        return this.ID;
    }

    public int getYearOfBirth()
    {
        return this.year;
    }

    public boolean isActive()
    {
        return this.status;
    }

    public void setName(String in_name)
    {
        if(isValidName(in_name))
        {
            this.name=in_name;
        }
    }

    public void setStudent_id(String in_id)
    {
        if(isValidStudent_id(in_id))
        {
            this.ID=in_id;
        }
    }

    public void setYearOfBirth(int in_year)
    {
        if(isValidYOB(in_year))
        {
            this.year=in_year;
        }
    }
}
