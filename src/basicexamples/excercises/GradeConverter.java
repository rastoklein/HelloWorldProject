package basicexample.excercises;

import java.text.Normalizer;
import java.util.Scanner;

public class GradeConverter {

    //vyvolanie metody pre zbavenie sa diakritiky
    public static String stripAccents(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
    public static void main(String[] args) {
        /*   Úloha č.2
     Vytvorte program, ktorý na základe textového zadania známky, napr. výborný, chválitebný, dobrý,
                dostatočný, nedostatočný vypíše zodpovedajúcu známku.Hint: Porovnanie textov sa cez IF robí ináč
        ako porovnanie s číslom. Nemôžeme použiť ==Hint č. 2: Namiesto IF môžeme použiť SWITCH, CASE.
                Bonusová úloha: Program pôjde do “nekonečna”, kým nezadáme príkaz: koniecBonusová úloha č. 2:
        Skúsme “ošetriť” používateľský vstup tak, aby reagoval na vstup text bez ohľadu na diakritiku.*/

        //štart cyklu
        String vystupnaZnamka = "";

        Scanner scn = new Scanner(System.in);

        while (!vystupnaZnamka.equals("koniec")) {

            System.out.println("zadaj znamku: ");

            vystupnaZnamka = scn.nextLine();

            System.out.println();

           vystupnaZnamka = stripAccents(vystupnaZnamka); //metoda stripAccents nam zbavi diakritiku

            System.out.print("napísal si známku: " );

            if (vystupnaZnamka.equals("vyborny")) {
                System.out.println("1");
            } else if (vystupnaZnamka.equals("chvalitebny")) {
                System.out.println("2");
            } else if (vystupnaZnamka.equals("dobry")) {
                System.out.println("3");
            } else if (vystupnaZnamka.equals("dostatocny")) {
                System.out.println("4");
            } else if (vystupnaZnamka.equals("nedostatocny")) {
                System.out.println("5");
            } else {
                System.out.println("Nezadal si slovnú známku správne");
            }
        }
        //koniec cyklu
    }
}
