/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass11;

import java.util.Date;

/**
 *
 * @author Fast Access
 */
public class ConstractorExample {
    double d ;
    Date date = new Date();
    String s;
//no argument constractor
    public ConstractorExample() {
    }

    public ConstractorExample(double d) {
        this.d = d;
    }
    int sum() {
        return 0;
    }
    
    int sum(int x) {
        return 0;  
    }
    
    
    
    public static void main(String[] args) {
        ConstractorExample obj = new ConstractorExample(50);
    }
    
}
