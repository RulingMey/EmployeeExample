/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeexample;

/**
 *
 * @author omero
 */
public class BasePlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;

    public BasePlusComissionEmployee(double baseSalary, double comissionRate, double grossSales, String firstName, String lastName, String socialSecurityNumber) {
        super(comissionRate, grossSales, firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary()+super.earnings();
    }
    
    @Override
    public String name(){
        return "Base-Plus Comission Employee";
    }
    @Override
    public String toString(){
        return super.toString()+"\nBase Salary: "+getBaseSalary();
    }
    
    
}
