package basicexamples.revision;

import java.time.LocalDate;
import java.util.Scanner;

public class VariablesExampleUserinput {
    public static void main(String[] args) {
    /*
    Zadanie: Trieda vypíše nasledujúci text do konzoly, pričom hodnoty ako dátum, známka, rok a aktuálny dátum môže používateľ meniť cez premenné.
    Text bude nasledovný:
    Študent Jozef Mrkvička sa narodil 3.4.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
    V Bratislave dňa 18.06.2022
     */
        String text1 = "Študent Jozef Mrkvička sa narodil ";
        String date = "";
        String text2 = ",z maturitnej skúšky má známku ";
        Float grade = 1.5f;  //TODO Print grade with comma
        String text3 = " a od septembra ";
        int year = 0;
        String text4= " nastúpi do nového zamestania ako Java programátor\n ";
        String text5 = "\t V Bratislave dňa ";

        Scanner scn = new Scanner (System.in);   //zadanie vstupnych udajov zo strany uzivatela

        System.out.println("zadaj dátum: ");
        date = scn.nextLine();

        System.out.println("zadaj znamku: ");
        grade = scn.nextFloat();
        String gradeWithComma = String.format("%.1f",grade);

        System.out.println("Zadaj rok: ");
        year = scn.nextInt();


        String currentDate = String.valueOf(LocalDate.now());  //get current date, but wiht problem format, firstly year


        String wholeText = text1 + date + text2 + gradeWithComma + text3 + year+ text4 + text5 + currentDate;

        System.out.println(wholeText);

        System.out.println();
        //TODO Ak má známku do 1,5 vrátane, tak vypíše JE PRIJATY
        //TODO Ak má známku od 1,5 do 3 vrátane, ta vypíšem MOZNO BUDE PRIJATY
        //TODO Ak má horšiu známku od 3 tak vypíše NIE JE PRIJATY
        if (grade <= 1.5f) {
            System.out.println("JE PRIJATY");
            System.out.println("Super");
        } else if (grade >1.5f && grade <=3.0f ) {
            System.out.println("MOZNO BUDE PRIJATY");
            
        } else {
            System.out.println("NIE JE PRIJATY");
            System.out.println("To je skoda");
        }

    }

}
