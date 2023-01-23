package basicexample;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] values = {8, 10, 12, 99};   //pozicie, zacinaju od 0-tej a konci poctom prvkov minus 1
        System.out.println(values[3]);    //vypise v poradi 4-tu pozicii, t.j. cislo 99

        System.out.println("");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");   //vypiseme obsah pola
        }
        System.out.println("\n............................");

        int[] array = new int[10];
        array[0] = ((int) (Math.random() * 100 + 1));
        array[1] = ((int) (Math.random() * 100 + 1));
        array[2] = ((int) (Math.random() * 100 + 1));
        array[3] = ((int) (Math.random() * 100 + 1));
        array[4] = ((int) (Math.random() * 100 + 1));
        array[5] = ((int) (Math.random() * 100 + 1));
        array[6] = ((int) (Math.random() * 100 + 1));
        array[7] = ((int) (Math.random() * 100 + 1));
        array[8] = ((int) (Math.random() * 100 + 1));
        array[9] = ((int) (Math.random() * 100 + 1));

        //vypise kazdy prvok z pola
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //zoradi pole od najmensieho po najvacsi
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
        }
        System.out.println("\n............................");
        System.out.println("najvacsie cislo je: " + array[array.length - 1]);
        System.out.println("najmensie cislo je: " + array[0]);

        System.out.println();
        String cars[] = {"Honda", "Audi", "Hyundai", "Opel"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\ndalsi sposob vypisovania z pola: ");
        for (String car:cars){   //naplname premennu car kazdym prvkom pola
            System.out.println(car);
    }
        //dvojrozmerne POLE:
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7, prva hodnota odkazuje na stlpec a druha na riadok



}
}
