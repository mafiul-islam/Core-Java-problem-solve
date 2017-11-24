/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass07;

/**
 *
 * @author Fast Access
 */
public class OperatorTest {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;
        
        c = a & b;
        System.out.println("a % b = " +c+ " binary= "+Integer.toBinaryString(c));
        
        c = a | b;
        System.out.println("a | b = " +c+ " binary= "+Integer.toBinaryString(c));
        
        c = a ^ b;
        System.out.println("a ^ b = " +c+  " binary= "+Integer.toBinaryString(c));
        
        c = ~a;
        System.out.println(" ~a = " +c+ " binary= "+Integer.toBinaryString(c));
        
        c = a << 2;
        System.out.println("a << = " +c+ " binary= "+Integer.toBinaryString(c));
        
        c = a >> 2;
        System.out.println("a >> = " +c+ " binary= "+Integer.toBinaryString(c));
        
        c = a >>> 2;
        System.out.println("a >>> = " +c+ " binary= "+Integer.toBinaryString(c));
        
        
    }
}
