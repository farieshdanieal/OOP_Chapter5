/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discountratemainclass;

/**
 *
 * @author User
 */
public class DiscountCalculator {

    public float getDiscountRate(int choice) {
        float discountRate = 0; // Default discount rate
        switch (choice) {
            case 1:
                discountRate = 0.10f; // 10%
                break;
            case 2:
                discountRate = 0.15f; // 15%
                break;
            case 3:
                discountRate = 0.25f; // 25%
                break;
            case 4:
                discountRate = 0.30f; // 30%
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        return discountRate;
    }
}

