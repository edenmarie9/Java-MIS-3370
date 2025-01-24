/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arithmeticdemo;

/**
 *
 * @author edenfreiku
 */
import javax.swing.JOptionPane;
public class ArithmeticDemo {
//this example if : performing floating-point arithmetic, which is why we are using double//
    public static void main(String[] args) {
        //in the main method, declare 5 int variables to use for the calculations//
       double firstNumber;
       double secondNumber;
       double sum;
       double difference;
       double average;
       //as the user for and accept 2 integers//
       firstNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Provide a double"));
       secondNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Provide a second double"));
       //add statements to perform the necessary operations//
       sum = firstNumber + secondNumber;
       difference = firstNumber = secondNumber;
       average = sum/2;
       //display the 3 caluculated values//
       System.out.println(sum);
       System.out.println(difference);
       System.out.println(average);
       
       
      
        
 
    }
}
