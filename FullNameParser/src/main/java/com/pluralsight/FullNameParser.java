package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //prompts the user to enter a name in one of the two formats
        // first-last or first-middle-last
        //make sure trim
        //parse the name and process it so that you can display
        // individual pieces

        System.out.println("Please enter your name (first-last or first-middle-last format): ");
        String userInput = myScanner.nextLine();

        userInput = userInput.trim();

        String[] parts = userInput.split(" ");

        if (parts.length == 2) {
            System.out.println("First name: " + parts[0]);
            System.out.println("Last name: " + parts[1]);
        } else if (parts.length == 3) {
            System.out.println("First name: " + parts[0]);
            System.out.println("Middle name: " + parts[1]);
            System.out.println("Last name: " + parts[2]);
        }
    }
}
