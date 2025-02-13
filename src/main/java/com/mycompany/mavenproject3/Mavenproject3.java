package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {

        System.out.println("Discount Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of Items:");
        int n = input.nextInt();
        String[][] items = new String[n][3];

// Filling up the Array
        for (int i = 0; i < n; i++) {
            // Storing name  
            System.out.println("\nEnter details for Item " + (i + 1) + ":");
            System.out.print("Name: ");

            if (i == 0) {
                input.nextLine();
            }

            items[i][0] = input.nextLine();

            // Storing price  
            System.out.print("Price: ");
            items[i][1] = input.nextLine();

            // Storing quantity  
            System.out.print("Quantity: ");
            items[i][2] = input.nextLine();
        }

//        Typecasting price and quantity
        double totalPrice = 0;
        for (int i = 0; i < n; i++) {
            double price = Double.valueOf(items[i][1]);
            int quantity = Integer.valueOf(items[i][2]);
            totalPrice += price * quantity;
        }

//        Applying discount
        System.out.println("\nAre you from Bahria University? (yes/no): ");
        String isFromBahria = input.next();

        double discount = 0;

        if (isFromBahria.equalsIgnoreCase("yes")) {
            discount = 0.30;
        } else if (totalPrice >= 50000 && totalPrice <= 100000) {
            discount = 0.20;
        } else if (totalPrice > 100000) {
            discount = 0.30;
        }
//        Calculating final amount
        double discountedAmount = totalPrice * discount;
        double finalAmount = totalPrice - discountedAmount;

//        Ouput
        System.out.println("Total Price:" + totalPrice);
        System.out.println("Discount Applied:" + discount * 100 + "%");
        System.out.println("Discounted Amount:" + discountedAmount);
        System.out.println("Final Price after Discount:" + finalAmount);

    }
}
