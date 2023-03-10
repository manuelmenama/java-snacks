package org.lessons.java;

public class Snack2 {
    public static void main(String[] args) {
        String[] listOfName = {"Leone", "Palmiro", "Giuseppe", "Vladimiro", "Nilde", "Rosa"};
        String[] listOfSurname = {"Rossi", "Verdi", "Bianchi", "Neri", "Brazof"};

        /* definisco i min, max e range che servono per generare i numeri random */

        int min = 1;
        int max = listOfSurname.length - 1;
        int range = max - min + 1;

        System.out.println("*****");
        System.out.println("Invitati alla festa del signor Grande Gatsby: ");

        /* ciclo l'array della lista dei nomi e associo un cognome pescato random */
        for (String s : listOfName) {
            String nameAndSurname;
            int randomNumber = (int) (Math.random() * range) + min;
            nameAndSurname = s + " " + listOfSurname[randomNumber];
            System.out.println(nameAndSurname);
        }
    }
}
