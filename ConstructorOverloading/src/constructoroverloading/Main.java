/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructoroverloading;

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
        Employee employee2 = new Employee(10000);
        var employee = new Employee(50000, 20);
        int wage = employee.calculateWage();
        int wage2 = employee2.calculateWage();
        System.out.println(wage);
        System.out.println(wage2);
    }
    
}
