package basicexample.excercises;

import java.util.Scanner;

public class CicleandMethods {
    //vytvorena vlastna METODA na vypocet obsahu kruhu
    public static double getareaOfCircle (double r){
       double areaOfCircle = Math.PI * Math.pow(r, 2);
        return areaOfCircle;
            }
    //vytvorena vlastna METODA na vypocet obvodu kruhu
    public static double getcircumference (double r){
        double circumference = 2 * Math.PI * r;
        return circumference;
    }
    //vytvorena vlastna METODA na formot bloku Stringu
    public static void printText(String str) {
        System.out.println(str);
        System.out.println();
    }

    public static void main(String[] args) {

      /*  Popis programu
        Program Circle bude od používateľa vyžadovať vstupnú hodnotu a to polomer kruhu, ktorý bude v centimetroch.
        Výsledkom bude obsah a obvod kruhu, ktorý vypíše používateľovi do “konzoly”. Program pôjde dovtedy, kým
         nezadáme zaporne cisla.
                Hint:
        Vzorec na výpočet obsahu kruhu je nasledujúci:
        S = π.r²
        Vzorec na výpočet obvodu kruhu je:
        o = 2.p.r
        Bonusová úloha: vytvorte metódy z daných vzorcoch.*/


        double r, circumference, areaOfCircle; //polomer, obvod, obsah
        Scanner scn = new Scanner(System.in);
        //start cyklu
        while (true) {
        System.out.println("Zadaj polomer r: ");
        r = scn.nextDouble();

        if (r<=0) {
            printText("koniec");
            break;//podmienky pri cislach: ==, !=, >, <, <=, >=
        }
        areaOfCircle = getareaOfCircle(r);//vypocet obsahu kruhu cez metodu
        circumference = getcircumference(r); //vypocet obvodu kruhu cez metodu

        System.out.println("Polomer je: " + r);
        System.out.println("Obsah kruhu je: " + areaOfCircle);
        System.out.println("Obvod kruhu je: " + circumference);




        }
    }
}
