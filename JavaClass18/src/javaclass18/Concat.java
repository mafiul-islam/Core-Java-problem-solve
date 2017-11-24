/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass18;

/**
 *
 * @author Fast Access
 */
public class Concat {
    public static String concatwithString() {
        String t = "Cat";
        for (int i = 0; i < 1000; i++) {
            t= t.concat("Dog");
        }
        return t;
    }
    

public static String conatwithStringBuffer() {
  StringBuffer sb = new StringBuffer("Cat");
    for (int i = 0; i < 1000; i++) {
        sb.append("Dog");
    }
    return sb.toString();
}
public static String concatwithStringBuilder() {
    StringBuilder sb = new StringBuilder("Cat");
    for (int i = 0; i < 1000; i++) {
        sb.append("dog");
    }
    return sb.toString();
}
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatwithString();
        System.out.println("concat with string took " +(System.currentTimeMillis() - start +"ms"));
        start =System.currentTimeMillis();
        conatwithStringBuffer();
        System.out.println("concat with stringBuffer took : " +(System.currentTimeMillis() - start +"ms"));
        start = System.currentTimeMillis();
        System.out.println("concat with Stringbuilder took : " +(System.currentTimeMillis() - start +"ms"));
        
        
    }
 
}
    

 

