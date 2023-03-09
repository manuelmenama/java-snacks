package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        int inputNumber;


        Scanner scan = new Scanner(System.in);
        System.out.println("**** Benvenuto in Paridisparator ****");
        System.out.print("Inserisci un numero: ");
        /*inserire da input un numero intero*/
        inputNumber = Integer.parseInt(scan.nextLine());

        System.out.println("******");

        if (inputNumber % 2 == 0) {
            /* se inputNumber diviso due da resto 0 il numero è pari */
            System.out.println(inputNumber + " è un numero pari!");
        } else {
            /* altrimenti inputNumber è disparo */

            System.out.println(inputNumber + " è un numero dipari!");
        }

        scan.close();
    }
}
