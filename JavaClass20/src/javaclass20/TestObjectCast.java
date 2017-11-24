/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass20;

/**
 *
 * @author Fast Access
 */
 class Animal {
    int health =100;
}
class Cat extends Animal {
    
}
public class TestObjectCast{
    public static void main(String[] args) {
        Animal aml = new Animal();
        Cat c = new Cat();
        aml = c;
        c = (Cat) aml;
        System.out.println(c.health);
    }
}
