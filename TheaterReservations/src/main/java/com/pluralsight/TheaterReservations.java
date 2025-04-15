package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Please enter your fullname: ");
        String inputName = scanner.nextLine();
        String[] name = inputName.split(" ");

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String userInputDate = scanner.nextLine();
        LocalDate reservationDate = LocalDate.parse(userInputDate, formatter);

        System.out.println("How many tickets would you like? ");
        int ticketNumber = scanner.nextInt();

        if(ticketNumber > 1){
            System.out.println(ticketNumber + " tickets reserved for " + reservationDate + " under " + name[1] + ", " + name[0] );
        } else {
            System.out.println(ticketNumber + " ticket reserved for " + reservationDate + " under " + name[1] + ", " + name[0] );

        }


    }
}
