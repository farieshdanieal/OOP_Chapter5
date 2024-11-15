/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitconversionprogram;

/**
 *
 * @author User
 */

import java.util.Scanner; //put library
public class Formula { 


        public void converter() { //main class will call this domain
        Scanner reader = new Scanner(System.in); //create object for scanner
     
        
        System.out.print("Choose your converter : "); //display for user input
        int choice = reader.nextInt(); //read user input
        
        switch (choice) { //user can choose case 1 until 3
            case 1: //display for user prompt
                System.out.print("\nInsert temperature in Celsius : ");
                int choice2 = reader.nextInt(); //scanner will read user input
                float tmp = (float) ((choice2 * 1.8) + 32); //formula
                System.out.println(+choice2+" Celsius is "+tmp+ " Fahrenheit");
                //line 28 will display result
                break; //break for this prompt
            
            case 2: //display for user prompt
                System.out.print("\nInsert Amount/Quantity (KM): ");
                int choice4 = reader.nextInt(); //scanner will read user input
                float meter = (float) (choice4 * 1000); //formula
                System.out.println("\n"+choice4+ " KM = " +meter+ " M"); 
                //line 36 will display result
                break; //break for this prompt
                
            case 3:
                System.out.print("\nInsert Amount/Quantity (KG): ");
                int choice3 = reader.nextInt();
                float pounds = (float) (choice3 * 2.205); //formula
                System.out.println(+choice3+ " KG = " +pounds+ " lbs");
                //line 44 will display result
                break; //break for this prompt
                
            default:
                System.out.println("Invalid Input"); //Display if input is not 1-3
                break; //break for this prompt
                 

    }
       
}
}
