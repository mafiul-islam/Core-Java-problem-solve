/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass22;

/**
 *
 * @author Fast Access
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        Integer intWrapper = Integer.valueOf("12345");
        //converting from binary to decimal
        Integer intWrapper2 = Integer.valueOf("11011", 2);
        //converting from hexa to dec
        Integer intWrapper3 = Integer.valueOf("D", 16);
        System.out.println("value of intWrapper object: " +intWrapper);
        System.out.println("value of intWrapper object2: " +intWrapper2);
        System.out.println("value of intWrapper object3: " +intWrapper3);
        
        System.out.println("hex value of intWrapper: " + Integer.toHexString(intWrapper));
        System.out.println("binary value of intWrapper2 " + Integer.toBinaryString(intWrapper2));
    }
}
