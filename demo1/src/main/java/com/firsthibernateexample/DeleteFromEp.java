package com.firsthibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class DeleteFromEp {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("Delete Employee123 e where id=:id");
        q.setParameter("id", 3);
        q.executeUpdate();
        transaction.commit();
        session.close();



    }

}
