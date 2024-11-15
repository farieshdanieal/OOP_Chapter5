/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discountratemainclass;

/**
 *
 * @author User
 */
public class PriceCalculator {

    public float calculateTotalPrice(float price, int quantity) {
        return price * quantity;
    }

    public float calculateDiscount(float totalPrice, float discountRate) {
        return totalPrice * discountRate;
    }

    public float calculateFinalPrice(float totalPrice, float discountAmount) {
        return totalPrice - discountAmount;
    }
}

