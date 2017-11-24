
package javaclass02;

import java.util.Scanner;
import java.io.*;


public class JavaClass02 {

    public static void main(String[] args) throws IOException {
     
        int a;
         BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
         a = Integer.parseInt(br.readLine());
         
                 for( int i = 2 ; i<= a ;i++){
                     if(i==a){
                         System.out.println(a+ " is prime number");
                     }  else    {
                         if(a % i==0){
                             System.out.println(a+ " is not prime");
                             break;
                         }
               }
        
    }
}
} 
