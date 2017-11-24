/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass14;

/**
 *
 * @author Fast Access
 */
public class ThisReEx {
    int x;
    String y;

    public ThisReEx(int x, String y) {
        this.x = x;
        this.y = y;
    }
    void sum(int x, int y) {
        System.out.println(x+y);
    }
    
    void doYY(String []args) {
        RecRef recref = new RecRef();
        recref.doXX(this);
        recref.doMM(x);
    }
    
}
class RecRef {
    void doXX(ThisReEx rr){
        rr.sum(4, 5);
    }
    void doMM(int s) {
        
    }
}
