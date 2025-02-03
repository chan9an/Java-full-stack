package com.lpu.springbootfirst;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component

public class AreaCircle implements CommandLineRunner{
   
    @Override
    public void run(String... args) throws Exception{
        Circle circle = new Circle();
        circle.setRadius(5.0f); 
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
    }

}
