/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gettersetter;

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
           var employee = new Employee();
          
           employee.setBaseSalary(50000);
           employee.sethourlyRate(20);
           
       // employee.baseSalary = 50_000;
        //employee.hourlyRate = 20;

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
    
}
