/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arithmeticdemo;

/**
 *
 * @author edenfreiku
 */
import javax.swing.JOptionPane;
public class ArithmeticDemo2 {

    public static void main(String[] args) {
        //in the main method, declare 5 int variables to use for the calculations//
       int firstNumber;
       int secondNumber;
       int sum;
       int difference;
       int average;
       //as the user for and accept 2 integers//
       firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Provide an integer"));
       secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Provide a second integer"));
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
