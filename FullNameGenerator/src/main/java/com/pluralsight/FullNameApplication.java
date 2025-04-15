package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //will prompt the user to enter the parts of their name
        //create a new string that holds the user's full name

        //will always have first and last name
        //they may also have a middle name and a suffix

        //if user has suffix, the full name should include a comma before the suffix

        System.out.println("Please enter your name: ");
        String name = myScanner.nextLine();

        System.out.println("Middle name");
        String middleName = myScanner.nextLine();

        System.out.println("Last name: ");
        String lastName = myScanner.nextLine();

        System.out.println("Suffix");
        String suffix = myScanner.nextLine();

        String userName = name.trim();
        String userMiddleName = middleName.trim();
        String userLastName = lastName.trim();
        String userSuffix =  suffix.trim();

        String userFullName;

        if(userMiddleName.length() > 0 && userSuffix.length() > 0){
            userFullName = userName + " " + userMiddleName + " " +userLastName + ", " + userSuffix;
            System.out.println(userFullName);
        } else if (userMiddleName.length() > 0){
            userFullName = userName + " " + userMiddleName + " " + userLastName;
            System.out.println(userFullName);
        } else if(userSuffix.length() > 0){
            userFullName = userName + " " + userLastName + ", " + userSuffix;
            System.out.println(userFullName);
        } else {
            userFullName = userName + " " + userLastName;
            System.out.println(userFullName);
        }
    }
}
