package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack3ClassRandom {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[10];

        /* definisco i min, max e range che servono per generare i numeri random */
        /*int min = 0;
        int max = 100;
        int range = max - min + 1;*/

        Random random = new Random();

        /* definisco un intero come contenitore delle somme */
        int sum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int randomNumber = random.nextInt(10);
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
