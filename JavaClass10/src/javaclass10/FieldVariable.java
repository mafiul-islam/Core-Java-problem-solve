/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass10;

import java.util.Date;

/**
 *
 * @author Fast Access
 */
public class FieldVariable {
    
    double d;
    Date date = new Date(); //explicit value
    String s;

    public FieldVariable(String s) {
        this.s = s;
    }
    
    
    public static void main(String[] args) {
        FieldVariable  obj = new FieldVariable("hello man");
        System.out.println(obj.d);
        System.out.println(obj.date);
        System.out.println(obj.s);

        
    }
}
