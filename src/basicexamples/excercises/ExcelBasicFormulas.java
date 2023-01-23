package basicexample.excercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelBasicFormulas {

    //METODA SUM
    public static double getSum(double[] array) {
        //musi tu byt vypocet
        double sum = 0;
        for (int i = 0; i < array.length; i++) {//cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 4
            sum = sum + array[i];  //4 cykly, zacina sa hodnotou 0, 0 + nulte pole, vysledok + prve pole, ....
            // V 1. iteracii bude sum obsahovat hodnotu 10, pretoze 0 + 10
// V 2. iteracii bude sum obsahovat hodnotu 30, pretoze 10 + 20
// V 3. iteracii bude sum obsahovat hodnotu 60, pretoze 30 + 30
// V 4. iteracii bude sum obsahovat hodnotu 100, pretoze 60 + 40
        }

        return sum;
    }

    //METODA AVERAGE ktora vyuziva predchadzajucu METODU Sum
    public static double getAverage(double[] array) {
        double count = array.length;
        double sum = getSum(array);
        double average = sum / count;

        return average;
    }

    //METODA AVERAGE ktora ma v sebe aj vypocet Sum
    public static double getAveragefromSum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];   }
        int count = array.length;
        double average = sum/count;
        return average;
    }
    //METODA COUNT
    public static double getCount(double[] array) {
        double count = array.length;
        return count;
        //alternativny Zapis predoslych dvoch riadkov: return.array.length;
    }

    //METODA Double
    public static double getMax(double[] array) {
        Arrays.sort(array);   //zoradi pole od najmensieho po najvacsi
        double max = (array[array.length - 1]);
        return max;
    }

    //METODA Min
    public static double getMin(double[] array) {
        Arrays.sort(array);  //zoradi pole od najmensieho po najvacsi
        double min = (array[0]);
        return min;
    }

    public static void main(String[] args) {

        //zadanie POLA cez hranate zatvorky
        double[] values = {10, 20, 30, 40};//hodnoty v poli, zacinaju sa od Pole0,Pole1,Pole2,Pole3. Hranata zatvorka Altgr+F
        //i++ je identicke z (i = i + 1)

        //Sucet
        double sum = getSum(values);
        System.out.println("Sucet je: " + sum);

        //priemer
        double average = getAveragefromSum(values);
        System.out.println("Average je: " + average);

        //pocet
        double count = getCount(values);
        System.out.println("Count je: " + count);

        //Max
        double max = getMax(values);
        System.out.println("max je: " + max);

        //Min
        double min = getMin(values);
        System.out.println("min je: " + min);


    }
    @Test
    public void testGetSum(){   //bez slovicka static
        double[] values = {10, 20, 30, 40};
        assertEquals(100, getSum(values));
    }

}
