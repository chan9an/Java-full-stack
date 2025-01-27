package com.firsthibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class UpdateEmp {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("Update Employee123 e set fname=:name where id=:id");
        q.setParameter("name", "Ajit");
        q.setParameter("id", 1);
        q.executeUpdate();
        transaction.commit();
        session.close();



    }

}
