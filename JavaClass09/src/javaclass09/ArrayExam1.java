/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass09;

import java.util.Arrays;

/**
 *
 * @author Fast Access
 */
public class ArrayExam1 {
    public static void main(String[] args) {
        
    
    int a[] =new int[3];
    a[0]=1;
    a[1]=2;
    a[2]=3;
    int num[] ={50,200,5,82,25,63};
    int m = num.length;
    int i;
        System.out.println("Given num : ");
        for ( i = 0; i < m; i++) {
            System.out.println(" " +num[i]);
            
        }
        System.out.println("\n");
        System.out.println("Accending oder number: ");
        Arrays.sort(num);
        for (i = 0; i  < m; i++) {
            System.out.println(" " +num[i]);
            
        }
    
    }
  }

