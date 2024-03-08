package com.mycompany.calculateps;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import static java.lang.Math.sqrt;
public class Triangle extends Shape {
    double a,b,c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void getResult() {
         System.out.println("Side A: " + a);
         System.out.println("Side B: " + b);
         System.out.println("Side C: "+ c);
         System.out.println("Area: "+ getArea());
         System.out.println("Perimeter: "+ getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
    
    @Override
    public double getArea() {
        double p = (a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
