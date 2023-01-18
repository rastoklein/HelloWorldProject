package basicexample;

public class ArrayExamples {
    public static void main(String[] args) {

        int []values = {8, 10, 12, 99};   //pozicie, zacinaju od 0-tej a konci poctom prvkov minus 1
        System.out.println(values[3]);    //vypise v poradi 4-tu pozicii, t.j. cislo 99

        System.out.println("");

        for (int i = 0; i < 4; i++) {
            System.out.println(values[i]);   //vypiseme obsah pola prostrednictvom pozicii
        }

    }
}
