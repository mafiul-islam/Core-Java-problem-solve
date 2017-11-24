
package javaclass04;

public class StaticVariable {
    public static double salary;
    int x;
    public static final String DEPERTMENT = "Devlopment";
    
    void test() {
        x = 0;
        salary = 345;
    }
    
    public static void main(String[] args) {
        StaticVariable sv = new StaticVariable();
        sv.x=100;
        
        salary =1000;
        System.out.println(DEPERTMENT + " avarage salary " + salary);
    }
}
