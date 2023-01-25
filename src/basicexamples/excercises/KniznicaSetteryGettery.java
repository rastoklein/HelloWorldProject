package basicexample.excercises;

import basicexample.excercises.model.Kniha;
import basicexample.excercises.model.KnihaSpravne;

import java.util.ArrayList;

public class KniznicaSetteryGettery {
    public static void main(String[] args) {
        Kniha kniha1 = new Kniha();   //vytvorili sme premennu kniha1(objekt alebo inštancia) pomocou tredy Kniha
        Kniha kniha2 = new Kniha();

        //toto je nspravny pristup k premennym
     /*   kniha1.nazov = "Ja robot";
        kniha1.autor = "Isaac Asimov";
        kniha1.rok = 1965;
        kniha1.cena = 12.50;
        kniha1.obsah = "Kniha ohladom 3 zakonov robotiky";
        kniha1.pocetStran = 230;
        kniha1.zaner = "Sci-fi";

        System.out.println("nazov knihy: " + kniha1.nazov);
        System.out.println("autor: " + kniha1.autor);
        System.out.println("rok: " + kniha1.rok);
        System.out.println("cena: " + kniha1.cena);
        System.out.println("obsah: " + kniha1.obsah);
        System.out.println("pocet stran: " + kniha1.pocetStran);
        System.out.println("zaner: " + kniha1.zaner);

        kniha2.nazov = "Duna";
        kniha2.autor = "Frank";

        System.out.println("\nnazov knihy: " + kniha2.nazov);
        System.out.println("autor: " + kniha2.autor);*/

        KnihaSpravne knihaSpravne1 = new KnihaSpravne();
        knihaSpravne1.setNazov("Motyl");
        knihaSpravne1.setAutor("Anna Schonn");

        System.out.println("spravne vypisanie knihy:");
        System.out.println("Nazov knihy: " + knihaSpravne1.getNazov());
        System.out.println("autor knihy: " + knihaSpravne1.getAutor());

        KnihaSpravne knihaSpravne2 = new KnihaSpravne();
        knihaSpravne2.setNazov("Ako spravne zit");
        knihaSpravne2.setAutor("James");

        //vytvorenie zoznamu knih cez Dynamicke Pole
        ArrayList<KnihaSpravne> zoznamKnihSpravne = new ArrayList<KnihaSpravne>();  //vytvorenie Pola zoznamKnihSpravne
        zoznamKnihSpravne.add(knihaSpravne1);  //naplnenie premennej zoznamKnihSpravne prvou knihou
        zoznamKnihSpravne.add(knihaSpravne2);

        //vypisanie niekolkych udajov z Pola
        System.out.println("\nvypis knih z dynamicekho pola: ");
        for(KnihaSpravne vystup:zoznamKnihSpravne) {
            System.out.println("Nazov knihy je: " + vystup.getNazov());
            System.out.println("Autor knihy je: " + vystup.getAutor());

        }


    }
}
