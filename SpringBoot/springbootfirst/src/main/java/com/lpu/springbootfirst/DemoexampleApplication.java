package com.lpu.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import differentpack.Cricket12;

@SpringBootApplication
public class DemoexampleApplication implements CommandLineRunner { // Implement CommandLineRunner

    @Autowired
    @Qualifier("first") 
    private Cutter c;



    @Autowired
    Cricket12 c12;

    @Autowired
    Player p;


   

    public static void main(String[] args) {
        SpringApplication.run(DemoexampleApplication.class, args);
        System.out.println("This is my first console output");
        
    }

    @Override
    public void run(String... args) throws Exception {
        c.cutting(); 
        p.display();
        c12.getCricketInfo();
        
        
    }

   
}
