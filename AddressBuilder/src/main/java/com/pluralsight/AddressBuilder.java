package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        //prompt the user for their billing and shipping address
        //use stringbuilder
        Scanner scanner = new Scanner(System.in);
        StringBuilder addressBuilder = new StringBuilder();

        System.out.println("Please provide the following information");

        System.out.println("Full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Billing street: ");
        String billingStreet = scanner.nextLine();

        System.out.println("Billing city: ");
        String billingCity = scanner.nextLine();

        System.out.println("Billing state: ");
        String billingState = scanner.nextLine();

        System.out.println("Billing zip: ");
        int billingZip = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Shipping street: ");
        String shippingStreet = scanner.nextLine();

        System.out.println("Shipping city: ");
        String shippingCity = scanner.nextLine();

        System.out.println("Shipping state: ");
        String shippingState = scanner.nextLine();

        System.out.println("Shipping zip: ");
        int shippingZip = scanner.nextInt();


        addressBuilder
                .append(fullName)
                .append("\n")
                .append("Billing Address:\n")
                .append(billingStreet)
                .append("\n")
                .append(billingCity).append(", ")
                .append(billingState)
                .append(" ")
                .append(billingZip)
                .append("\n")
                .append("Shipping Address:\n")
                .append(shippingStreet)
                .append("\n")
                .append(shippingCity).append(", ")
                .append(shippingState).append(" ")
                .append(shippingZip)
                .append("\n");


        String myAddress = addressBuilder.toString();
        System.out.println(myAddress);
    }
}
