package basicexample.excercises.model;

public class Zamestnanec {

    private String meno;
    private String priezvisko;
    private char pohlavie;
    private int rokNarodenia;

   //konstruktor
    public Zamestnanec(String meno, String priezvisko, char pohlavie, int rokNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pohlavie = pohlavie;
        this.rokNarodenia = rokNarodenia;
    }
    //prazdny konstruktor
    public Zamestnanec() {
    }

    public String getMeno() {
        return meno;
    }
    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public char getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(char pohlavie) {
        this.pohlavie = pohlavie;
    }

    public int getRokNarodenia() {
        return rokNarodenia;
    }

    public void setRokNarodenia(int rokNarodenia) {
        this.rokNarodenia = rokNarodenia;
    }

  /*  @Override
    public String toString() {
        return "Zamestnanec{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", pohlavie=" + pohlavie +
                ", rokNarodenia=" + rokNarodenia +
                '}';*/
    //upravene toString aby to bolo pod sebou a s dvojbodkou
        @Override
        public String toString() {
            return "\nmeno: " + meno
                    + "\npriezvisko: " + priezvisko
                    + "\npohlavie: " + pohlavie
                    + "\nrokNarodenia: " + rokNarodenia;
    }
}
