/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clubpenguincurrencycalculator;

/**
 *
 * @author edenfreiku
 */
import javax.swing.JOptionPane;

public class ClubPenguinCurrencyCalculator {

    public static void main(String[] args) {
        double coinValue = 0.0045; 
        String coins;
        
        coins = JOptionPane.showInputDialog(null, "How many coins do you have?", 
                "Coin amount: ", JOptionPane.QUESTION_MESSAGE);
        double coinCount = Double.parseDouble(coins);
        double money = coinValue * coinCount;
        JOptionPane.showMessageDialog(null, "You have " + money + " in USD.");
        
        
            
    }
}
