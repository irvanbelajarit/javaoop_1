/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticmembers;

/**
 *
 * @author Irv-PC
 */
public class Employee {

    public int baseSalary;
    public int hourlyRate;
    
    
    public static int numberOfEmployee;

    public Employee(int baseSalary) {
        this(baseSalary,0);
    }
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        sethourlyRate(hourlyRate);
        numberOfEmployee++;
    }
    
    
    public static void printNumberOfEmployee(){
        System.out.println(numberOfEmployee);
    }
    

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage() {
//        return baseSalary ;
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary Cannot be 0 or less");
        }
        this.baseSalary = baseSalary;

    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void sethourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("hourlyRate Cannot be 0 or less");
        }
        this.hourlyRate = hourlyRate;

    }

    private int gethourlyRate() {
        return hourlyRate;
    }
}
