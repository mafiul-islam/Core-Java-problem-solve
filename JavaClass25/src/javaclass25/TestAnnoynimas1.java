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
interface Eatable {
    void eat();
}
public class TestAnnoynimas1 {
    public static void main(String[] args) {
        Eatable eat = new Eatable() {
            @Override
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        eat.eat();
    }
    
}
