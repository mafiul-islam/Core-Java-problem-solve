/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass09;

/**
 *
 * @author Fast Access
 */
public class MultidimentionArray {
    public static void main(String[] args) {
    
    int arr1[][] =new int [3][];
    arr1[0] = new int[3];
    arr1[1] = new int [2];
    arr1[2] = new int [3];
    
    int arr[][]= {{1 , 2 , 3}, {2, 4}, {4, 4, 5}};
    
    //printing 2d arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            
        }
    
    
    }
}
