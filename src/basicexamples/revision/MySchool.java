package basicexample.revision;

import java.util.Scanner;

public class MySchool {

    public static void main(String[] args) {

        //POLIA - ARRAY
        int[] values = {8, 10, 12, 99};   //pozicie, zacinaju od 0-tej a konci poctom prvkov minus 1
        System.out.println(values[3]);    //vypise v poradi 4-tu pozicii, t.j. cislo 99
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");   //vypiseme obsah celeho pola
        }
        System.out.println("\n..................................");


        //SCANNER - vstup
        System.out.print("SCANNER tu napis: ");
        Scanner input = new Scanner(System.in);
        String premenna = input.nextLine();
        System.out.println(premenna);
       /* double premenna2 = input.nextDouble();
        System.out.printf("%.2f", premenna2);  //zaokruhlenie cisel na presne zadefinovane desatinne miesta*/

        System.out.println("..................................");


        //SCANNER - s podmienkami vystupnymi cez IF
        Scanner scn = new Scanner(System.in);
        System.out.println("SCANNER tu napis A: ");
        double premennaA = scn.nextDouble();

        System.out.println("SCANNER tu napis B: ");
        double premennaB = scn.nextDouble();

        System.out.println("hodnota A je " + premennaA);
        System.out.println("hodnota B je " + premennaB);

        if (premennaA > premennaB) {
            System.out.println("vacsie cislo je " + premennaA);
        } else if (premennaB > premennaA) {
            System.out.println("vacsie cislo je " + premennaB);
        } else System.out.println("zle");


        if (premennaA < premennaB) {
            System.out.println("mensie cislo je " + premennaA);
        } else if (premennaB < premennaA) {
            System.out.println("mensie cislo je " + premennaB);
        } else System.out.println("zle");

        System.out.println("....................");


    }
}
