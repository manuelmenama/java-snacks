package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        int inputNumber;

        Scanner scan = new Scanner(System.in);
        System.out.println("**** Benvenuto in Paridisparator ****");
        System.out.print("Inserisci un numero: ");
        inputNumber = Integer.parseInt(scan.nextLine());

        System.out.println("******");

        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " è un numero pari!");
        } else {
            System.out.println(inputNumber + " è un numero dipari!");
        }
    }
}
