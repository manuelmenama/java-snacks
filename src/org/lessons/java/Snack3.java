package org.lessons.java;

import java.util.Arrays;

public class Snack3 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[20];

        /* definisco i min, max e range che servono per generare i numeri random */
        int min = 0;
        int max = 100;
        int range = max - min + 1;

        /* definisco un intero come contenitore delle somme */
        int sum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int randomNumber = (int) (Math.random() * range) + min;
            arrayOfNumbers[i] = randomNumber;
            /* se l'indice dell'array è dispari lo aggiungo nella somme */
            if (i%2 != 0){
                sum += randomNumber;
            }
        }

        System.out.println(Arrays.toString(arrayOfNumbers));
        System.out.println("Somma dei numeri in posizione dispari: " + sum);
    }
}
