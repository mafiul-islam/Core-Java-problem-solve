
package javaclass04;

public class LocalTest {
    int y;
    
    public void calAge(){
    int age = 0;
    age = age + 7;
    y = y + 7;
    System.out.println("age is : "  + age);
    
  
    
  }
    public static void main(String[] args) {
        LocalTest test = new LocalTest();
        test.calAge();
    }
    
}
