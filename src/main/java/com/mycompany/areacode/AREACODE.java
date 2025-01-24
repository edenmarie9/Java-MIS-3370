/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areacode;

/**
 *
 * @author edenfreiku
 */
import javax.swing.JOptionPane;

public class AREACODE 
{
    public static void main(String[] args) 
    {
        // Ask for the user's area code
        String areaCode = JOptionPane.showInputDialog(null, "What is your area code?", "Area Code Input", JOptionPane.QUESTION_MESSAGE);

        // Display information based on the user's input
        if (areaCode != null && !areaCode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You entered area code: " + areaCode, "Area Code Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No area code entered!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}



 