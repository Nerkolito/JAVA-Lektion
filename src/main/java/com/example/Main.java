package com.example;

public class Main {
    public static void main(String[] args) {
        // 1. Addition
        int sum = add(5, 3);
        System.out.println("Summa: " + sum);

        // 2. Hälsning
        printGreeting("Nermin");

        // 3. True eller false
        System.out.println("Är 20 jämnt? " + isEven(20));
        System.out.println("Är 7 jämnt? " + isEven(7));

        // 4. Arrays
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 2;
            System.out.println(numbers[i]);
        }

        // 5. Beräkna summan av array
        int[] values = {5, 10, 15, 20, 25};
        int arraySum = 0;
        for (int value : values) {
            arraySum += value;
        }
        System.out.println("Summan av arrayen: " + arraySum);

        // 6. Hitta största värdet i array
        int[] randomNumbers = {12, 45, 3, 27, 33};
        int max = randomNumbers[0];
        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }
        System.out.println("Största värdet i arrayen är: " + max);

        // 7. Vartannat element i en String-array
        String[] fruits = {"Äpple", "Banan", "Mango", "Apelsin", "Grapefrukt"};
        System.out.println("Vartannat element i arrayen:");
        for (int i = 0; i < fruits.length; i += 2) {
            System.out.println(fruits[i]);
        }

        // 8. PrintArray
        int[] exArray = {9, 8, 7, 6, 5};
        System.out.println("Innehåll i arrayen:");
        printArray(exArray);

        //9.calculateAverage
        int[] myArray = {10, 20, 30, 40, 50};
        float average = calculateAverage(myArray);
        System.out.println("Medelvärdet är: " + average);

        //10.searchArray
        int[] sampleArray = {10, 20, 30, 40, 50};
        int targetValue = 30;

        if (searchArray(sampleArray, targetValue)) {
            System.out.println("Värdet " + targetValue + " finns i arrayen.");
        } else {
            System.out.println("Värdet " + targetValue + " finns INTE i arrayen.");
        }
    }


    //=== Metod för att räkna ut medelvärde i arrayen
    public static float calculateAverage(int [] array){
        int sum =0;
        for (int value:array){
            sum+=value;
        }
        return (float) sum/array.length;
    }


    //=== Metod för searchArray
    public  static boolean searchArray (int [] array,int target){
        for(int value:array) {
            if (value== target){
                return true;
            }
        }
        return false;
    }

    // === Metod för printArray ===
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    // === Metod för Addition ===
    public static int add(int a, int b) {
        return a + b;
    }

    // === Metod för Hälsning ===
    public static void printGreeting(String name) {
        System.out.println("Hej " + name + "! Välkommen!");
    }

    // === Metod för att kontrollera jämnt taal ===
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
