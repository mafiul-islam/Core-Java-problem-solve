/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass25;

/**
 *
 * @author Fast Access
 */
public class TestMemberOuter1 {
    private int data = 30;
    
    class Inner {
        void msg() {
            System.out.println("data is " +data);
            //display
        }
    }
    void disply() {
        Inner in = new Inner();
        in.msg();
    }
    public static void main(String[] args) {
        TestMemberOuter1 obj = new TestMemberOuter1();
        obj.disply();
    }
}
