/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeexample;

import javax.swing.JOptionPane;

/**
 *
 * @author omero
 */
public class EmployeeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String output="";
        SalariedEmployee e=new SalariedEmployee(40, "Ömer", "Köroğlu", "12345678901");
        HourlyEmployee h=new  HourlyEmployee(15, 15.2, "Ömer", "Köroğlu", "12345678901");
        ComissionEmployee c=new ComissionEmployee(1, 26.3, "Ömer", "Köroğlu", "12345678901");
        BasePlusComissionEmployee b=new BasePlusComissionEmployee(15, 1, 26.3, "Ömer", "Köroğlu", "12345678901");
        
        Employee arrayOfEmployee[]=new Employee[4];
        arrayOfEmployee[0]=e;
        arrayOfEmployee[1]=h;
        arrayOfEmployee[2]=c;
        arrayOfEmployee[3]=b;
        
        for (int i = 0; i < arrayOfEmployee.length; i++) {
            
            output += "\n\n"+arrayOfEmployee[i].name()+"\n"+arrayOfEmployee[i].toString();
        }
        JOptionPane.showMessageDialog(null, output);
        
        }
        
    }
    
