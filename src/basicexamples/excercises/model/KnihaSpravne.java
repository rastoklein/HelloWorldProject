package basicexample.excercises.model;

public class KnihaSpravne {
    //vytvorime OBJEKTY
    private String obsah;
    private String zaner;
    private String nazov;
    private String autor;
    private int pocetStran;
    private double cena;
    private int rok;

    //nasledne z Objektov vytvorime getters, setters (cez prave tlacitko, GENERATE )

    public String getZaner() {
        return zaner;
    }

    public void setZaner(String zaner) {
        this.zaner = zaner;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getObsah() {         //metoda(ktora vracia) cez ..get.. + ..nazov premenej...+ return
        return obsah;
    }

    public void setObsah(String obsah) {        //metoda cez VOID, odovzdavame obsah
        this.obsah = obsah;
    }
}
