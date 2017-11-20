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
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    
    public HourlyEmployee(double wage, double hours, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    @Override
    public double earnings(){
        return (hours <= 40 ? wage*hours :(hours>40 ? 40 * wage +( hours - 40 ) * wage * 1.5 : -1));
    }
    @Override
    public String name(){
        return "Hourly Employee";
    }
    @Override
    public String toString() {
        return super.toString()+"\nHourly wage: "+getWage()+" Hours: "+getHours(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
