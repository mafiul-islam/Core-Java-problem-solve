/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass17;

/**
 *
 * @author Fast Access
 */
class Parent {
    int pi, pj;
    void showpipj() {
        System.out.println("pi and pj is: " + pi + " " +pj);
    }
}
class Child extends Parent {
    int pk;
    void showpk() {
        System.out.println("pk is: " +pk);
        
    }
    void sum() {
        System.out.println("pi+pj+pk is: " +(pi +pj +pk));
    }
}
class InheritExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.pi=2;
        p.pj=7;
        System.out.println("content of parent class");
        p.showpipj();
        System.out.println("");
        c.pi=100;
        c.pj=300;
        c.pk=500;
        c.showpipj();
        c.showpk();
        c.sum();
    }
}
