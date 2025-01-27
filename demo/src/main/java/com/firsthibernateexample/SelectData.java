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
        Query q = session.createQuery("From employeeq");
        List l = q.list();
        Iterator i = l.iterator();

        while (i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj);
        }

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
