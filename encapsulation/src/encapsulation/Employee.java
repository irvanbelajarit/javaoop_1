/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Irv-PC
 */
public class Employee {
    
    public int baseSalary;
    public int hourlyRate;

    
    public int calculateWage (int extraHours){
        return baseSalary + (hourlyRate*extraHours);
    }
    
    
}
