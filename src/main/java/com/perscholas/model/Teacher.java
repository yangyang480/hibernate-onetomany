package com.perscholas.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    //@Column (name = "TEACHERID_PK") using column we can rename the PK name
    //variables
    private int tit;
    private String salary;
    private String Teachername;

    //contructor
    public Teacher(int tit, String salary, String teachername) {
        this.tit = tit;
        this.salary = salary;
        this.Teachername = teachername;
    }

    public Teacher(){

    }

    //getter and setter
    public int getTit() {
        return tit;
    }

    public void setTit(int tit) {
        this.tit = tit;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeachername() {
        return Teachername;
    }

    public void setTeachername(String teachername) {
        Teachername = teachername;
    }

}
