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
public class AutoboxingExample {
    public static void main(String[] args) {
        int pInt = 420;
        Integer wInt = new Integer(pInt);
        int p2 = wInt;
        System.out.println(p2);
    }
}
