/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass14;

/**
 *
 * @author Fast Access
 */
public class Example1 {
    int data = 50;
    
    void change(int data) {
        data = data + 100;
        System.out.println("data in method: " + data);
    }
    
    void changeByObj(Example1 e) {
        e.data = 200;
    }
    
    public static void main(String[] args) {
        Example1 ex = new Example1();
        System.out.println("Before change: " + ex.data);
        ex.change(55);
        System.out.println("After change by pass by value " +ex.data);
        ex.changeByObj(ex);
        System.out.println("after change by pass by refarence " +ex.data);
    }
        
    }
    

