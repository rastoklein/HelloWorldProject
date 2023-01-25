package basicexample.excercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZadavanieKnihDynamicArray {
    public static void main(String[] args) {

          /*Nova Uloha:
        Zadajte názvy kníh cez konzolu, kým používateľ nenapíše slovo koniec. Následne zoznam kníh vypíšeme.
        Používanie aplikácie: Použivateľ spustí program s názvom ZadavanieKnih (InputBooks), ktorý používateľa
        vyzve na zadanie názvov kníh. Zároveň mu vypíše inštrukciu, že po zadaní slova koniec program zadavánie
        ukončí a následne vypíše zoznamu všetkých zadaných kníh.*/


        Scanner scn = new Scanner(System.in);
        ArrayList<String> kniznica = new ArrayList<String>();  //vytvara dynamicke pole, ktore je na zaciatku prazdne

        System.out.println("Zadaj nazvy knih. Potvrd nazov klavesom ENTER. Prikaz -koniec - ukonci zadavanie");
        //cyklus zacina tu
        while (true) {
            String kniha = scn.nextLine();
            // System.out.println("Zadany zoznam knih: " + kniha);
            if (kniha.toLowerCase().equals("koniec")) break;    //ukonci cyklus ked premenna bude obsahovat slovo ..koniec..

            kniznica.add(kniha);
        }
        //premenna kniznica tu uz nie je dostupna, pretoze je dostupna len v Cykle vyssie
        //cyklus konci
        //vypis vsetkych knih
        Collections.sort(kniznica);
        for (String vystup : kniznica) {
            System.out.println(vystup);
        }

    }
}
