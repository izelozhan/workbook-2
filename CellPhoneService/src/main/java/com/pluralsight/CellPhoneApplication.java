package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cellphone myPhone = new Cellphone();

        System.out.println("What is the serial number?");
        myPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What model is the phone?");
        myPhone.setModel(scanner.nextLine());

        System.out.println("Who is the carrier?");
        myPhone.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number?");
        myPhone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        myPhone.setOwner(scanner.nextLine());

        System.out.println("Serial number: " + myPhone.getSerialNumber());
        System.out.println("Phone model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());



    }
}
