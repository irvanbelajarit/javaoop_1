/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gettersetter;

/**
 *
 * @author Irv-PC
 */
public class Employee {
    
    private int baseSalary;
    private int hourlyRate;

    
    public int calculateWage (int extraHours){
        return baseSalary + (hourlyRate*extraHours);
    }
    
    public void setBaseSalary(int baseSalary){
        if(baseSalary <=0)
            throw new IllegalArgumentException("Salary Cannot be 0 or less");
        this.baseSalary = baseSalary;
                    
    }
    
    public int getBaseSalary(){
        return baseSalary;
    }
    
     public void sethourlyRate(int hourlyRate){
        if(hourlyRate <=0)
            throw new IllegalArgumentException("hourlyRate Cannot be 0 or less");
        this.hourlyRate = hourlyRate;
                    
    }
    
    public int gethourlyRate(){
        return hourlyRate;
    }
    
}
