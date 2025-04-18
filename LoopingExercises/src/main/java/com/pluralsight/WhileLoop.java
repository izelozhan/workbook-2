package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {
     whileLoop();
    }

    public static void whileLoop(){
        String text = "I love while loop";
        int i = 0;
        int sum = 0;

        while (i < 5){
            sum += i;
            i++;
            System.out.println(text);
        }
    }
}
