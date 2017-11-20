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
public class ComissionEmployee extends Employee{
    
    private double comissionRate;
    private double grossSales;

    public ComissionEmployee(double comissionRate, double grossSales, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.comissionRate = comissionRate;
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    
    @Override
    public double earnings(){
        return getComissionRate()*getGrossSales();
    }
    
    @Override
    public String name(){
        return "Comission Employee";
    }
    @Override
    public String toString(){
        return super.toString()+"\nGross Sales: "+getGrossSales()+" Comission Rate: "+getComissionRate();
    }
}
