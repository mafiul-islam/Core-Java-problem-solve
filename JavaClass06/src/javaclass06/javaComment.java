/*

*/

package javaclass06;


public class javaComment {
    /**
     * this is a method to display sum of two integer number 
     * @param numA this is 1st parameter to pass the method
     * @param numB this is 2nd parameter to pass the method
     * @return this methods returns an integer value
     */
    
    public int addNum(int numA, int numB) {
        return numA + numB;
    }
    public static void main(String[] args) {
        
        javaComment cm = new javaComment();
        int sum = cm.addNum(10, 20);
        System.out.println("Sum of 10 & 20 is: " +sum);
    }
}
