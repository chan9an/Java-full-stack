package com.lpu.springbootfirst;

public class Circle {
    
    private float radius; 

    
    public float getRadius() {
        return radius;
    }

    
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }
}
