package com.perscholas.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class MyController {
    public void createOnetoMany(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        factory.close();
        session.close();
    }

    public void InsertInfo()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Teacher teacher1 = new Teacher();
        teacher1.setTeachername("Yangyang");
        teacher1.setSalary("50000");

        Teacher teacher2 = new Teacher();
        teacher2.setTeachername("Kyle");
        teacher2.setSalary("60000");

        Teacher teacher3 = new Teacher();
        teacher3.setTeachername("Crastal");
        teacher3.setSalary("75000");

        Teacher teacher4 = new Teacher();
        teacher4.setTeachername("Jared");
        teacher4.setSalary("85000");

        Teacher teacher5 = new Teacher();
        teacher5.setTeachername("Jessica");
        teacher5.setSalary("68000");

        Teacher teacher6 = new Teacher();
        teacher6.setTeachername("Alex");
        teacher6.setSalary("6000");

        //create an object of teacher
        Set<Teacher> teacherlist = new HashSet<>();
        //add object to the list
        teacherlist.add(teacher1);
        teacherlist.add(teacher2);
        teacherlist.add(teacher3);
        Set<Teacher> teacherList2 = new HashSet<>();
        teacherList2.add(teacher4);
        teacherList2.add(teacher5);
        teacherList2.add(teacher6); //each list has 3 teachers

        Department department1 = new Department();
        department1.setDname("Chines");
        department1.setTeacherList(teacherlist); //we pass teacherlistone here

        Department department2 = new Department();
        department2.setDname("Math");
        department2.setTeacherList(teacherList2); //we pass teaacherlist2 here

        Department department3 = new Department();
        department3.setDname("English");

        session.save(department1);
        session.save(department2);
        session.save(department3);
        session.save(teacher1);
        session.save(teacher2);
        session.save(teacher3);
        session.save(teacher4);
        session.save(teacher5);
        session.save(teacher6);

        t.commit();
        session.close();
        factory.close();
    }
}
