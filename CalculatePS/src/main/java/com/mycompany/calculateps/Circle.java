package com.mycompany.calculateps;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Circle extends Shape {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    @Override
    public void getResult() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

        @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    
    
    
}
    
    

