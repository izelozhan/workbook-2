package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        doWhileLoop();
    }
    public static void doWhileLoop(){
        String text = "I love do-while loop";
        int i = 0;
        int sum = 0;

        do {
            sum += i;
            i++;
            System.out.println(text);
        } while (i < 5);
    }
}
