/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass22;

/**
 *
 * @author Fast Access
 * @since 2:08 AM
 */
public class WrapperDemo {
    public static void main(String[] args) {
        Integer intObj1 = new Integer(25);
        Integer intObj2 = new Integer("25");
        Integer intObj3 = new Integer (35);
        //compare to demo
        System.out.println("Compare using CompareTo obj1 to obj2: " +intObj1.compareTo(intObj2));
        System.out.println("Compare using CompareTo obj1 to obj3:  " +intObj3.compareTo(intObj1));
        //equal demo
        System.out.println("Compare using EqualTo obj1 to obj2: " +intObj1.equals(intObj2));
        System.out.println("Compare using EqualTo obj1 to obj3: " +intObj1.equals(intObj3));
        Float f1 = new Float("2.25f");
        Float f2 = new Float("20.43f");
        Float f3 = new Float (2.25f);
        System.out.println("Compare using CompareTo f1 to f2: " + Float.compare(f1, f2));
        System.out.println("Compare using CompareTo f1 to f3: " +Float.compare(f1, f3));
        //adition of integer with float 
        Float f = intObj1.floatValue() + f1;
        System.out.println("Adition of intObj and f1: " +intObj1 + "+" + f1 + "=" +f);
    }
}
