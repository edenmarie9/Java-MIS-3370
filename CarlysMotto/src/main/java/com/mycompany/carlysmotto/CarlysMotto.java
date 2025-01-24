/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carlysmotto;

/**
 *
 * @author edenfreiku
 */
public class CarlysMotto2 
{
    public static void main(String[] args) 
    {
        // Define the motto
        String motto = "Carly's makes the food that makes it a party.";
        
        // Create the border
        String border = "*".repeat(motto.length() + 4); // Adjust for padding
        
        // Display the motto surrounded by a border
        System.out.println(border);
        System.out.println("* " + motto + " *");
        System.out.println(border);
    }
}
