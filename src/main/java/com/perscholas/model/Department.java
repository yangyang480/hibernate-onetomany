package com.perscholas.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Department {//this time this class is target entity, the teacher class is the source entity.
    //we will use@OnetoMany in target entity always.

    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    private int did; //variables
    private String dname;

    //create relationship between department and teacher, have to use cascade
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Teacher> TeacherList;//we create a new variable we use set because we can't have duplicate value. If we want to have duplicate value then we can use list.

    //constructors
    public Department(int did, String dname) {
        super();
        this.did = did;
        this.dname = dname;
    }

    public Department()
    {

    }

    //getters and setters
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Set<Teacher> getTeacherList() {
        return TeacherList;
    }

    public void setTeacherList(Set<Teacher> teacherList) {
        this.TeacherList = teacherList;
    }
}
