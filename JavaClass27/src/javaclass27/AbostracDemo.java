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
abstract class A {
    abstract void callme();
    void callmetoo () {
        System.out.println("this is concrit method ");
    }
}
class B extends A {

    @Override
    void callme() {
        System.out.println("B's implementation of call me ");
    
   }
}
public class AbostracDemo {
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}
