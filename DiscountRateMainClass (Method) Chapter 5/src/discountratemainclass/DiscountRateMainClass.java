/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountratemainclass;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class DiscountRateMainClass {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Get item details
        System.out.print("Enter the item name: ");
        String itemName = reader.nextLine();

        System.out.print("Enter the price of the item (RM): ");
        float price = reader.nextFloat();

        System.out.print("Enter the quantity of the item: ");
        int quantity = reader.nextInt();

        reader.nextLine(); // Clear buffer

        // Get discount choice
        System.out.println("Discount Color Code:");
        System.out.println("1. Red (10%)");
        System.out.println("2. Green (15%)");
        System.out.println("3. Blue (25%)");
        System.out.println("4. Yellow (30%)");
        System.out.print("Enter Your Color Code (1, 2, 3, 4): ");
        int choice = reader.nextInt();

        // Get discount rate
        DiscountCalculator discountCalculator = new DiscountCalculator();
        float discountRate = discountCalculator.getDiscountRate(choice);

        // Calculate total price, discount, and final price
        PriceCalculator priceCalculator = new PriceCalculator();
        float totalPrice = priceCalculator.calculateTotalPrice(price, quantity);
        float discountAmount = priceCalculator.calculateDiscount(totalPrice, discountRate);
        float finalPrice = priceCalculator.calculateFinalPrice(totalPrice, discountAmount);

        // Display the results
        System.out.println("\n########Item Information########");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: RM " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM " + totalPrice);
        System.out.println("Discount Rate %: " + (int) (discountRate * 100));
        System.out.printf("Price After Discount: RM %.2f%n", finalPrice);

        reader.close();
    }
}

