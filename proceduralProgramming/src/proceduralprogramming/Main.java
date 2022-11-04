/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proceduralprogramming;

/**
 *
 * @author Irv-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int baseSalary = 50000;
        int extraHours=10;
        int hourlyRate =20;
        
      int wage =   calculateWage(baseSalary, extraHours, hourlyRate);
      
        System.out.println(wage);
        
    }
    
    public static int calculateWage(
    int baseSalary,
    int extraHours,
    int hourlyRate
    ){
        return baseSalary + (extraHours*hourlyRate);
    }
    
}
