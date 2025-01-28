package com.firsthibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class SelectData {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query q = session.createQuery("FROM Employee123"); // Querying based on the entity name
        List l = q.list();
        Iterator i = l.iterator();

        while (i.hasNext()) {
            Employee123 e = (Employee123) i.next();
            System.out.println("ID: " + e.getId() + ", First Name: " + e.getFname() + ", Last Name: " + e.getLname());
        }

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
