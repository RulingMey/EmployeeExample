
package employeeexample;

public class SalariedEmployee extends Employee {
    
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    @Override
    public String name(){
        return "Salaried Employee";
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+getWeeklySalary(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
    
}
