package basicexample;

import java.util.ArrayList;
import java.util.Collections;

//pridavanie lubovolneho poctu knih a ich vypis
public class DynamicArrayListExamples {
    public static void main(String[] args) {

        ArrayList<String>poleKnih = new ArrayList<String>();   //vytvorili sme dynamicke Pole s nazvom poleKnih
        String kniha1 = "Hobbit";
        String kniha2 = "Portret Doriana";
        String kniha3 = "Motyl";

        poleKnih.add(kniha1);
        poleKnih.add(kniha2);
        poleKnih.add(kniha3);

        Collections.sort(poleKnih);  //roztriedenie podla Abecedy
        /*poleKnih.remove(1);   //odstranenie poleKnih s indexom 1 (Portred Doriana)
        System.out.println("....................");*/
        //poleKnih.set(3, "Nova kniha");  //pridanie noveho prvku, t.j. novej knihy do Pola

        System.out.println(poleKnih.get(1));  //vypiseme knihu v poradi druhu, s indexom 1
        System.out.println("....................");

        //prechadzame vsetkymi prvkami dynamickeho pola poleKnih
        for (int i = 0; i < poleKnih.size(); i++) {
            System.out.println(poleKnih.get(i) + ".");  //pridal som bodku
        }
        System.out.println("....................");

        //prechadzame vsetkymi prvkami dynamickeho pola poleKnih, SjPOSOB c.2
        for (String vystup:poleKnih){
            System.out.println(vystup);
        }

        System.out.println("....................");

        // NOVY PRIKLAD ...Cisla noh
        ArrayList<Integer> poleCiselnoh = new ArrayList<Integer>();
        Integer cisloNohy1 = 40;
        Integer cisloNohy2 = 41;
        Integer cisloNohy3 = 42;

        poleCiselnoh.add(cisloNohy1);
        poleCiselnoh.add(cisloNohy2);
        poleCiselnoh.add(cisloNohy3);

        //vypiseme vsetky cisla
        for (int i = 0; i < poleCiselnoh.size() ; i++) {
            System.out.println("Zadane cislo nohy: " + poleCiselnoh.get(i));
        }
        //vypiseme vsetky cisla Alternativa 2:
        for (Integer vystup:poleCiselnoh){
            System.out.println("Zadane cislo nohy, sposob c.2: " + vystup);
        }


        /*Nova Uloha:
        Zadajte názvy kníh cez konzolu, kým používateľ nenapíše slovo koniec. Následne zoznam kníh vypíšeme.
        Používanie aplikácie: Použivateľ spustí program s názvom ZadavanieKnih (InputBooks), ktorý používateľa
        vyzve na zadanie názvov kníh. Zároveň mu vypíše inštrukciu, že po zadaní slova koniec program zadavánie
        ukončí a následne vypíše zoznamu všetkých zadaných kníh.*/


























    }
}
