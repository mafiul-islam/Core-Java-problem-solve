/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass27;

/**
 *
 * @author Fast Access
 */
abstract class Figure {
    double dim1;
    double dim2;
    int x = 4;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    //area is now an abstract method 
    abstract double area(); 
        void sum(){}
        
    }
class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
        int d;
    }

    @Override
    double area() {
        System.out.println("Inside area for rectangle ");
        return dim1 * dim2;
    }
    
}
class Triangle extends Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.println("inside area for triangle. ");
        return dim1 *dim2 / 2;
    }
    
}

public class AbstractExample {
    public static void main(String[] args) {
        // Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        figref = r;
        System.out.println("Area is " +figref.area());
        figref = t;
        System.out.println("Area is " +figref.area());
            
        
        
    }
}
