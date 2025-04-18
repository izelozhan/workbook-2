package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        //new array with 10 score
        int[] testScores = new int[10];

        for (int i = 0; i < testScores.length; i++) {
            double randomScore = Math.random() * 100 + 1;
            testScores[i] = (int) randomScore;
            //take every item by index and assign it to a random number
        }
        //printed out test scores after assign it
        System.out.println("Test scores; ");
        System.out.println(Arrays.toString(testScores));
        //sorted array to min to max
        Arrays.sort(testScores);
        //finding lowest and highest, I already sorted so first and last is showing the right values
        int lowestScore = testScores[0];
        int highestScore = testScores[testScores.length - 1];

        //score sum calculating
        double sum = 0;
        //for loop for adding all scores
        for(int score: testScores){
            sum = sum + score;
        }
        double average = sum / testScores.length;

        System.out.println("Average: " + average);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Highest Score: " + highestScore);



    }
}
