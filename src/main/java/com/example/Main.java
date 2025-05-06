package com.example;

public class Main {
    public static void main(String[] args) {
        // 1. ADD Method
        int sum = add(5, 8);
        System.out.println("Sum is: " + sum);

        // 2. printGreeting Method
        printGreeting("Nermin");

        // 3. isEven Method
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Is 7 even? " + isEven(7));

        // 4. Array Example
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 2;
        }


        System.out.println("Innehåll i arrayen:");
        for (int num : numbers) {
            System.out.println(num);
        }

        int[] values = {5, 10, 15, 20, 25};
        int arraySum = 0; // Starta från 0

        for (int val : values) {
            arraySum += val;  // Addera till arraySum, inte sum!
        }

        System.out.println("Summan är: " + arraySum);
    }

    // Method for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method for greeting
    public static void printGreeting(String name) {
        System.out.println("Hej " + name + "! Välkommen!");
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
