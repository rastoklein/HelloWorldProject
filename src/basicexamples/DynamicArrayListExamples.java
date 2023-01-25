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
        System.out.println(poleKnih.get(poleKnih.size()-1));  //vypisanie posledneho prvku v dynamickom poli, lastIndex

        //Vypis vsetkych prvkov (indexov) dynamickeho pola poleKnih
        for (int i = 0; i < poleKnih.size(); i++) {
            System.out.println(poleKnih.get(i) + ".");  //pridal som bodku
        }
        System.out.println("....................");

        //Vypis vsetkymi prvkami dynamickeho pola poleKnih, SPOSOB resp. ALTERNATIVA c.2
        for (String vystup:poleKnih){
            System.out.println(vystup);
        }

        System.out.println("....................");

        // NOVY PRIKLAD ...POLE: Cisla noh
        ArrayList<Integer> poleCiselnoh = new ArrayList<Integer>();
        Integer cisloNohy1 = 40;
        Integer cisloNohy2 = 41;
        Integer cisloNohy3 = 42;

        poleCiselnoh.add(cisloNohy1);
        poleCiselnoh.add(cisloNohy2);
        poleCiselnoh.add(cisloNohy3);

        //vypiseme vsetky cisla Alternativa c.1:
        for (int i = 0; i < poleCiselnoh.size() ; i++) {
            System.out.println("Zadane cislo nohy: " + poleCiselnoh.get(i));
        }
        //vypiseme vsetky cisla Alternativa c. 2:
        for (Integer vystup:poleCiselnoh){
            System.out.println("Zadane cislo nohy, sposob c.2: " + vystup);
        }





























    }
}
