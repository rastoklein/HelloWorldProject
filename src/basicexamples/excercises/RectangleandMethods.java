package basicexample.excercises;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Vytvorte triedu Rectangle, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (getPerimeter),
 druhá na výpočet jeho obsahu (getArea).
 Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom.
 Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí.
 Úloha pre lektora: Vytvorte jUnit testy s niekoľkými vstupnými scenármi.*/

public class RectangleandMethods {
    //metoda na obvod obdlznika
    public static double getPerimeter(double a, double b) {
        double Perimeter = 2 * (a + b);
        return Perimeter;
    }
    //metoda na obsah obdlznika
    public static double getArea(double a, double b) {
        double Area = a * b;
        return Area;
    }

    public static void main(String[] args) {

        double a, b;

        Scanner scn = new Scanner(System.in);
        System.out.print("Zadaj stranu a: ");
        a = scn.nextDouble();
        System.out.print("Zadaj stranu b: ");
        b = scn.nextDouble();

        double Perimeter = getPerimeter(a, b);  //vyvolanie metody do premennej Perimeter(musi byt tiez dat.typ premennej)
        double Area = getArea(a, b);            //vyvolanie metody

        System.out.println("Obvod obdlznika je " + Perimeter);
        System.out.println("Obsah obdlznika je " + Area);


    }
    @Test
    public void testGetPerimeter() {
    assertEquals(6,getArea(2, 3));
    }

}
