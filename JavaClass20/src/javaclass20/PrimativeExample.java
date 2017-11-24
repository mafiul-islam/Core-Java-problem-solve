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
public class PrimativeExample {
    public static void main(String[] args) {
        
    
    String s = "13";
    int stoi =Integer.parseInt(s);
    stoi =Integer.valueOf(s).intValue();
        System.out.println(" string to int " +stoi);
        
        //int to string 
        int i = 14;
        String itos =Integer.toString(i);
        System.out.println("int to string " +itos);
        //string to double
        String ss ="13";
        double stod = Double.valueOf(ss).doubleValue();
        System.out.println("string to double " +stod);
        //double to string
        double d = 13.5d;
        String dtos =Double.toString(d);
        System.out.println("double to string" +dtos);
        char c = 'a';
        int ctoi = c; //no need to explicit cast
        System.out.println("char to integer " +ctoi);
        
        //int to char
        int ii= 97;
        char itoc =(char) ii;
        System.out.println("integer to char " +itoc);
        //anotherway
        System.out.println(Character.toChars(97));
        
        //string to charecter
        String sss ="welcome";
        char stoc =(char) sss.charAt(0);
        System.out.println("string to char " +stoc);
        
        //charecter to string
        char cc ='X';
        System.out.println("charecter to string" +String.valueOf(cc));
        
        //int to double
        int iii = 5;
        double itod =5.4d;
        int dtoi =(int) iii;
        System.out.println("doble to int " +dtoi);
        
        
        

    }
}
