/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ch2debugprogram4;

/**
 *
 * @author edenfreiku
 */
import javax.swing.JOptionPane;
public class Ch2DebugProgram4 {

    public static void main(String[] args) {
        String costString;
        double cost;
        final double TAX = 0.06;
        
        costString = JOptionPane.showInputDialog(null, "Enter the price of item you are buying:", "Purchases", JOptionPane.INFORMATION_MESSAGE);
        cost = Double.parseDouble(costString);
        JOptionPane.showMessageDialog(null, "With " + TAX * 100 + "%tax, purchase is $" + (cost+cost*TAX));
    }
}
