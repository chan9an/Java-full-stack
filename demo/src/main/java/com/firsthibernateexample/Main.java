package com.firsthibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee123 employee = new Employee123();
        employee.setFname("Akash");
        employee.setLname("Thakur");

        session.save(employee); 
        transaction.commit();

        session.close();
        sessionFactory.close();

        System.out.println("Employee data saved successfully!");
    }
}
