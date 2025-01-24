/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weeklypayexample;

/**
 *
 * @author edenfreiku
 */
import javax.swing.JOptionPane;
public class WeeklyPayExample {

    public static void main(String[] args) 
    {
        String wageString, dependentsString;
//list the types of strings you will use (is what will show in the GUI window pane and your first bit of code)//
        double wage, weeklyPay;
//use double for the numeric values we will use to perform the calculations for wage and weekly pay//
        int dependents;
//use integer for the number of dependents as it is a smaller number//        
        final double HOURS_IN_WEEK = 37.5;
 //use the named constant method because the hours in a week are not changing/is permanent to this question//
        wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage:", "HOURLY WAGE", JOptionPane.INFORMATION_MESSAGE);
        weeklyPay = Double.parseDouble(wageString)* HOURS_IN_WEEK;
        dependentsString = JOptionPane.showInputDialog(null, "How many dependents are there?", "Number of Dependents", JOptionPane.QUESTION_MESSAGE);
        dependents = Integer.parseInt(dependentsString);
        JOptionPane.showMessageDialog(null, "Your weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
    }
}
