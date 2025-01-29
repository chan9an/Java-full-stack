package com.manytoone;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectData {

	public static void main(String[] args) {
		Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        
        Answer a1 = new Answer();
        a1.setAnswername("Java is a Programming Language");
        a1.setPostedBy("Pappu Kumar");
        
        Answer a2 = new Answer();
        a2.setAnswername("Java is Platform Independent Language");
        a1.setPostedBy("Rohit Mishra");
        
        Question q1 = new Question();
        q1.setQname("What is Java");
        
        ArrayList<Answer> l1 = new ArrayList<Answer>();
        l1.add(a1);
        l1.add(a2);
        q1.setAnswer(l1);
        
        
        Answer a3 = new Answer();
        a3.setAnswername("OOP is a Programming Language");
        a3.setPostedBy("Akash Maurya");
        
        Answer a4 = new Answer();
        a4.setAnswername("OPP is Platform Independent Language");
        a4.setPostedBy("Nitish Mishra");
        
        Question q2 = new Question();
        q2.setQname("What is OPP");
        
        ArrayList<Answer> l2 = new ArrayList<Answer>();
        l2.add(a3);
        l2.add(a4);
        q2.setAnswer(l2);
        
        session.save(q1);
        session.save(q2);
        t.commit();
        session.close();
        sf.close();
        
        System.out.println("Success");
        
        
        


	}

}