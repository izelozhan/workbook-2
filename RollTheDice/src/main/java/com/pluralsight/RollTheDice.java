package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum + "\n");

            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }

        System.out.println("Results: \n");
        System.out.println("Two counter: " + twoCounter);
        System.out.println("Four counter: " + twoCounter);
        System.out.println("Six counter: " + twoCounter);
        System.out.println("Seven counter: " + twoCounter);


    }
}
