/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass12;

/**
 *
 * @author Fast Access
 */
public class MethodExample {
    int x, y;
    double d;
    String s;
    //method name= dispSum
    //method signature dispSum(int x, int y)
    //method interface int dispSum(int x, int y)
    //method body{}
    int dispSum(int x, int y){
        return x +y;
    }
    //mutator method
    void setXY(int x, int y) {
        this.x =x; 
        this.y=y;
    }
    
    public static void main(String[] args) {
        MethodExample obj = new MethodExample();
        obj.setXY(50,30);
        int sum = obj.dispSum(4, 5);
        System.out.println(sum);
    }
    
}
