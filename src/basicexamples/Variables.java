package basicexamples;

import java.math.MathContext;
import java.text.DecimalFormat;

public class Variables {
    public static void main(String[] args) {
      //definovanie premennych na zaciatku kodu, az potom vypis kodu v podobe sout
        int myNum;
        myNum = 15;
        String name = "John";
        final double conversionRate = 30.126;  //konstantu definujeme klucovym slovom final
        float myFloatNum = 5.99f;
        char myLetter = 'D';  //AltGr + P napise jednoduche uvodzovky
        boolean myBool = true;


        System.out.println(myNum);
        System.out.println(name);
        System.out.println("Kurz EUR/SK je : " + conversionRate + " ku dnu 22.1.2022");
        System.out.println("Vypisujem desatinne cislo: " + myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);

        String firstName = "Janko ";
        String lastName = "Novotny";
        String fullName = firstName + lastName; //spoji obsah 2 premennych
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println( "Vysledok suctu: " + (x + y));

        int a = 5, b = 6;              //iny zapis s tym istym vystupom
        System.out.println( "Vysledok suctu: " + (a + b));

        //vypis text Vysledok scitania 2 premennych (o, p) je: a k tomu vysledok dvoch premennych
        int o = 10, p = 20;              //iny zapis s tym istym vystupom
        System.out.println( "Vysledok scitania 2 premennych o= " + o + ", p= " + p + " je: " + (o + p));

        String cas = "17.00 hod ";
        String ucebna = "1A";
        System.out.println("Dnes o " + cas + "zacne kurz v " + ucebna + "\n");  // \n je prikaz na riadkovanie, musi byt v uvodzovkach ako string


        /*Vytvorte jednoduchý program, ktorého cieľom bude výpočet 4 základných matematických operácií a to na sčítanie, odčítanie, násobenie a delenie.
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. number1 a number2.
                Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítanie hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.
                Bonusová úloha: Vedeli by ste v prípade desatinných miest nahradiť desatinnú bodku za čiarku?*/

        //riesenie ulohy:
        double number1 = 2, number2 = 3;
        System.out.println("Výsledkom sčítania hodnôt " + number1 + " a " + number2 + " je " + (number1 + number2));
        System.out.println("Výsledkom odčítania hodnôt " + number1 + " a " + number2 + " je " + (number1 - number2));
        System.out.println("Výsledkom násobenia hodnôt " + number1 + " a " + number2 + " je " + (number1 * number2));
        System.out.println("Výsledkom delenia hodnôt " + number1 + " a " + number2 + " je " + Math.round(number1 / number2) + "\n");



        System.out.printf("Výsledkom sčítania hodnôt %.1f a %.1f je %.1f %n", number1, number2, (number1 + number2));
        System.out.printf("Výsledkom odčítania hodnôt %.1f a %.1f je %.1f %n", number1, number2, (number1 - number2));
        System.out.printf("Výsledkom násobenia hodnôt %.1f a %.1f je %.1f %n", number1, number2, (number1 * number2));
        System.out.printf("Výsledkom delenia hodnôt %.1f a %.1f je %.6f %n", number1, number2, (number1 / number2));

       /* alternativny zapis:
       int myNum = 15;
       System.out.println(myNum);*/

    }
}
