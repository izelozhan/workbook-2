package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        //enter a team and score info Home:Visitor|21:9 Winner => home

        //split the user input multiple times
        //one split will be on the pipe
        //one split will be on the colon

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a game score: ");
        String input = myScanner.nextLine();
//        //hint ex
//        String input = "Dallas|Ft. Worth|Austin";
//        String[] cities = input.split("\\|");
        String[] pipes = input.split("\\|");
//        String one = pipes[0];
//        String two = pipes[1];
//        System.out.println(one); //home:visitor
//        System.out.println(two); //21:9

        String[] homes = pipes[0].split(":");
        String[] scores = pipes[1].split(":");

        String home1 = homes[0];
        String home2 = homes[1];
        String score1 = scores[0];
        String score2 = scores[1];

        int intScore1 = Integer.parseInt(score1);
        int intScore2 = Integer.parseInt(score2);

        if(intScore1 > intScore2){
            System.out.println("Winner: " + home1);
        } else if (intScore2 > intScore1) {
            System.out.println("Winner: " + home2);
        } else {
            System.out.println("It's a draw");
        }
    }
}
