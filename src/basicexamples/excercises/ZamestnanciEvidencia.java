package basicexample.excercises;

import basicexample.excercises.model.Zamestnanec;

public class ZamestnanciEvidencia {
    public static void main(String[] args) {

        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.setMeno("Ján");
        zamestnanec1.setPriezvisko("Ziatniak");
        zamestnanec1.setPohlavie('M');   //Altgr + P
        zamestnanec1.setRokNarodenia(2000);
        System.out.println("Meno 1. zamestnanca je, klasicky vypis: " + zamestnanec1.getMeno());


        //Alternativa c.2 cez Konstruktor:
        Zamestnanec zamestnanec2 = new Zamestnanec("Ivan", "Mrkvicka", 'M', 2005);  //vytvorenie Objektu priamym naplnenim, cez Konstruktor

        System.out.println("\nVsetky udaje 2.zamestnanca cez toString()");
        System.out.println(zamestnanec2);




    }
}
