package footballclub;

import java.util.Date;

public class Member {
    private String fullname;
    private int age;
    private String nationality;
    private int salary;
    private Date startdate;
    private Date enddate;

    public Member(){}

    public Member(String fullname, int age, String nationality, int salary, Date startdate, Date enddate) {
        this.fullname = fullname;
        this.age = age;
        this.nationality = nationality;
        this.salary = salary;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", salary=" + salary +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }
}
