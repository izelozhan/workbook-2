package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cellphone myPhone = new Cellphone();
        Cellphone myPhone2 = new Cellphone();
        //myPhone is instance and object

        //scanner method
        fillCellPhoneFromScanner(scanner, myPhone, 1);
        fillCellPhoneFromScanner(scanner, myPhone2, 2);

        //display phone info
        display(myPhone);
        display(myPhone2);

        //call dial method
        myPhone.dial(myPhone2.getPhoneNumber());
        myPhone2.dial(myPhone.getPhoneNumber());

    }

    public static void fillCellPhoneFromScanner(Scanner scanner, Cellphone phone, int index) {
        System.out.println("Details for phone #" + index);

        System.out.println("What is the serial number?");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What model is the phone?");
        phone.setModel(scanner.nextLine());

        System.out.println("Who is the carrier?");
        phone.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number?");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        phone.setOwner(scanner.nextLine());
    }

    public static void display (Cellphone phone){
        System.out.println("Phone details;\n");
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Phone model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("/n");
    }
}
