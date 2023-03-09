package org.lessons.java;

import java.util.Arrays;

public class Snack4 {
    public static void main(String[] args) {
        int[] longerArray = new int[20];
        int[] shorterArray = new int[15];

        int min = 0;
        int max = 100;
        int range = max - min + 1;




        for (int i = 0; i < longerArray.length; i++) {
            int randomNumber = (int)(Math.random() * range) + min;
            longerArray[i] = randomNumber;
        }
        for (int i = 0; i < shorterArray.length; i++) {
            int randomNumber = (int)(Math.random() * range) + min;
            shorterArray[i] = randomNumber;
        }



        System.out.println("Longer array:  " + Arrays.toString(longerArray));
        System.out.print("Shorter array: " + Arrays.toString(shorterArray));


        int difference = longerArray.length - shorterArray.length;
        for (int i = 0; i < difference; i++) {
            int randomNumber = (int)(Math.random() * range) + min;

            System.out.print(" " + randomNumber);
        }


    }
}
