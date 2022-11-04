/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java1;

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
        TextBox textBox1 = new TextBox();
        var textBox2 = new TextBox();
       
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

//        allocation memory
        var textBox3 = textBox1;
        textBox3.setText("hallo Dunia");

        textBox2.setText("Box 2");

        System.out.println(textBox2.text);

        System.out.println(textBox1.text);
    }

}
