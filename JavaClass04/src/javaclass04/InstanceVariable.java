/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass04;

/**
 *
 * @author Fast Access
 */
public class InstanceVariable {
    
    public String name;
    private double salary;
    
    public InstanceVariable(String empname){
        name = empname;
    }
    public void setSalary(double empsalary) {
        salary =empsalary;
    }
    
    public void printEmp(){
        System.out.println("name    :" +name);
        System.out.println("salary  :" +salary);
    }
    public static void main(String[] args) {
        InstanceVariable empone = new InstanceVariable("mark zukerburg");
        empone.setSalary(100);
        empone.printEmp();
    }
}
