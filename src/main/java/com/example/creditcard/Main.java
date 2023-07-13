package com.example.creditcard;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Credit Card Limit: ");
        double limit = read.nextDouble();
        CreditCard Card = new CreditCard(limit);

        int exit = 1;
        while(exit != 0) {
            System.out.println("Enter the description of your purchase:");
            String description = read.next();

            System.out.println("Enter the price of your purchase:");
            double price = read.nextDouble();

            Purchase purchase = new Purchase(description, price);
            boolean purchaseDone = Card.doIHaveMoney(purchase);

            if(purchaseDone) {
                System.out.println("Purchase Successful!");
                System.out.println("Enter 0 to exit or 1 to continue");
                exit = read.nextInt();
            } else {
                System.out.println("Insufficient balance");
                exit = 0;

            }

        }

        System.out.println("******************");
        System.out.println("Purchase successful: \n");
        Collections.sort(Card.getPurchase());

        for (Purchase c : Card.getPurchase()) {
            System.out.println(c.getDescription() + " - " + c.getPrice());
        }
        System.out.println("\n Card Balance: " +Card.getBalance());
    }

}
