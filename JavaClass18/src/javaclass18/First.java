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
public class First {
    public static void main(String[] args) {
       
    String s = "Dhaka";
    s = s.concat(" Bangladesh");
        System.out.println(s);
        
        StringBuffer sb = new StringBuffer("Dhaka");
        sb.append(" Bangladesh");
        System.out.println(sb);
    }
}
