package employeeexample;
public abstract class Employee {
    public String firstName;
    public String lastName;
    public String socialSecurityNumber;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return getFirstName()+" "+getLastName()+"\n"+getSocialSecurityNumber(); //To change body of generated methods, choose Tools | Templates.
    }
   
    public abstract double earnings();
    public abstract String name();
    
    
    
}
