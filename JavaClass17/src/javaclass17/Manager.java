/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass17;

/**
 *
 * @author Fast Access
 */
 class Employee {
    public String name;
    public int employeeId;

  /*
   public Employee() {
        this.name = "mark zukerbug";
        this.employeeId = 420;
    } */

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    } 
    
    String getDetails() {
        return "id is" +employeeId + "name is: " +name;
    }
    
    
}
public class Manager extends Employee {
    public String department;

    public Manager(String department, String name, int employeeId) {
        super(name, employeeId);
        this.department = department;
    }
    
    @Override
    String getDetails(){
        return "life is beautiful";
    }
    public static void main(String[] args) {
        Manager mgr = new Manager("software", "stive jobs", 101);
        mgr.print();
        Employee e = new Manager("multimedia", "johir uddin", 102);
        mgr = (Manager) e;
        System.out.println(mgr.getDetails());
        
        
    }
    void print() {
        System.out.println("name is : " +name);
        System.out.println("department is : " +department);
    }
    
    
}
