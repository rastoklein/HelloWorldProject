package basicexample.excercises;

import java.util.Scanner;

public class RandomAndScannerGenerator {
    public static void main(String[] args) {

       /* Úloha č.1
        Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10. Používateľ musí uhádnuť číslo.
        Ak uhádne menšie, tak mu Java vypíše Neuhádol si, moje číslo je menšie,
        analogicky Neuhádol si, moje číslo je väčšie a pri úspešnom uhádnutí BINGO! Uhádol si!
        Bonusová úloha:
        Ak si trúfate, doplňte algoritmus hádania dovtedy, kým neuhádne.*/

        int min = 1;
        int max = 10;
        int range = max - min + 1;
        int randomNum = (int) (Math.random() * range + min);
        //nizsie alternativny zapis:
       /* Random randomObject = new Random();
        int randomValue = randomObject.nextInt(10); */

        System.out.println("Cislo vygenerovane systemom, t.j. tajne cislo je: " + randomNum);


        //Start cyklus s podmienkou WHILE
        int vstupneCislo = 0;
        while (vstupneCislo != randomNum) {
            System.out.println("Zadaj cislo");
            Scanner objectScanner = new Scanner(System.in);  //uzivatelsky vstup z konzoly
            vstupneCislo = objectScanner.nextInt();

            if (vstupneCislo > randomNum) {
                System.out.println("Neuhadol si. Moje cislo je mensie.");
            } else if (vstupneCislo < randomNum) {
                System.out.println("Neuhadol si. Moje cislo je vacsie.");
            } else {
                System.out.println("Bingo Uhadol si.");
            }
        }
    }
}
