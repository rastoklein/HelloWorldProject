package basicexample.excercises;


import java.util.Scanner;

public class MyTests {
    public static void main(String[] args) {

        System.out.println("Moje TESTOVACIE prostredie:\n");

        Scanner scn = new Scanner(System.in);

        System.out.println("SCANNER tu napis A: ");
        double premennaA = scn.nextDouble();

        System.out.println("SCANNER tu napis B: ");
        double premennaB = scn.nextDouble();

        System.out.println(premennaA);
        System.out.println(premennaB);
        System.out.println("....................");
        if(premennaA > premennaB){
            System.out.println("vacsie cislo je " + premennaA );
        } else if (premennaB > premennaA) {
            System.out.println("vacsie cislo je " + premennaB);
        } else System.out.println("zle");

        System.out.println();

        if (premennaA < premennaB) {
                System.out.println("mensie cislo je " + premennaA);
        }
                 else if (premennaB < premennaA) {
                    System.out.println("mensie cislo je " + premennaB);
        } else System.out.println("zle");


    }
}
