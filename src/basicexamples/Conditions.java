package basicexample;

import javax.swing.*;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        //zadanie hodnoty a jej VYGENEROVANIE
        System.out.println("zadaj hodnotu premennej: ");
        int vystupnaHodnota = 0;
        Scanner vstupnecislo = new Scanner(System.in);
        vystupnaHodnota = vstupnecislo.nextInt();

       // VYGENEROVANIE nahodnej hodnoty
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int randomNum = (int) (Math.random() * range + min);
        //nizsie alternativny zapis:
       /* Random randomObject = new Random();
        int randomValue = randomObject.nextInt(10); */
        System.out.println(" Nahodne cislo vygenerovane systemom je: " + randomNum);


    }
}
