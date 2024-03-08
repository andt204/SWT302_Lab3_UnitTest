
import com.mycompany.calculateps.Circle;
import com.mycompany.calculateps.Rectangle;
import com.mycompany.calculateps.Triangle;
import java.util.InputMismatchException;
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
public class Main {
    public static void main(String[] args) {
        System.out.println("=====Calculator Shape Program=====");
        //Step 1: Input Rectangle
        Rectangle rectangle = inputRectangle();
        //Step 2: Input Circle
        Circle circle = inputCircle(); 
        //Step 3: Input Triangle
        Triangle triangle = inputTriangle();
        //Step 4: Display infomation
        Display(triangle, rectangle, circle);
    }

    
    
    
    //Check input empty and ưởng format
    private static final Scanner sc = new Scanner(System.in);
    private static double checkInput() {
        while (true) {
            try {
                String inputString = sc.nextLine();
                //Check input empty
                if (inputString.trim().isEmpty()) {
                    System.out.println("Input empty! Please re-enter input!");
                    continue;
                }
                //Check input wrong format
                double input = Double.parseDouble(inputString);
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format! Please re-enter input!");
            }
        }
    }

    
    
    
    
    
    //Input Rectangle
    private static Rectangle inputRectangle() {
        while(true){
            System.out.println("Please input side width of Rectangle: ");
            double width = checkInput();
            System.out.println("Please input length of Rectangle: ");
            double length = checkInput();
            if(width > 0 && length > 0){
            return new Rectangle(width, length);
            } else {
            System.out.println("Rectangle not exist! Please re-enter rectangle!");
            }
        } 
    }

    
    
    
    
    //Input Circle
    private static Circle inputCircle() {
        while (true) {
            System.out.println("Please input radius of Circle: ");
            double radius = checkInput();
            //Check condition exist Circle
            if(radius > 0){
                return new Circle(radius);
            } else {
                System.out.println("Circle not exist! Please re-enter circle!");
            } 
        }
    }

    


    
    //Input Triangle
    private static Triangle inputTriangle() {
        while (true) {
            System.out.println("Please input side A of Triangle: ");
            double a = checkInput();
            System.out.println("Please input side B of Triangle: ");
            double b = checkInput();
            System.out.println("Please input side C of Triangle: ");
            double c = checkInput();
            //Check condition exist Triangle
            if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Triangle not exist! Please re-enter triangle!");
            }
        }
    }
    
    
    
    
    
    //Display result
    private static void Display(Triangle triangle, Rectangle rectangle, Circle circle) {
        System.out.println("-----Rectangle-----");
        rectangle.getResult();
        System.out.println("-----Circle-----");
        circle.getResult();
        System.out.println("-----Triangle-----");
        triangle.getResult();
    }

    
}