package basicexample.excercises;
/*Vytvorte dynamicke pole (prostredníctvom ArrayList), ktorý od používateľa bude žiadať zadanie číselných hodnôt,
        ktoré budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
        Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
        Dodatočná úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.
    */

import java.util.ArrayList;
import java.util.Scanner;

public class InputValuesIntoDynamicArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj akekolvek kladne cislo: ");

        int hodnota = 0;
        ArrayList zadaneHodnoty = new ArrayList();  //vytvorime dynamicke pole, ktore je na zaciatku prazdne

        //aby apka od pouzvatela ziadala zadanie nekonecneho moznstva hdonot
        while (hodnota >= 0) {
            hodnota = scn.nextInt();
            zadaneHodnoty.add(hodnota);  //a tu hodnotu vlozime do dynamickeho Pola
        }
        //Uloha1 v tomto mieste chcem vypisat vsetky zadane kladne cisla
        for (int i = 0; i < zadaneHodnoty.size()-1; i++) {   //size sa pouziva s Objektom,
            System.out.println(zadaneHodnoty.get(i));
        }
        // Uloha2 chcem scitat vsetky kladne cisla a vypisat vysledok
        int sum = 0;
        for (int i = 0; i < zadaneHodnoty.size()-1; i++) {
            sum = sum + (int)zadaneHodnoty.get(i);
                    }
        System.out.println("Sumar vsetkych hodnot je " + sum);

        //alternativny zapis je tiez:
       /* while (true){
            int hodnota = scn.nextInt();
            if (hodnota < 0) break;
        }*/


    }
}
