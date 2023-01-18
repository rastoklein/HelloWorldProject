package basicexample.excercises;

import org.w3c.dom.ls.LSOutput;

public class ExcelBasicFormulas {
    public static void main(String[] args) {

        //zadanie POLA cez hranate zatvorky
        int []values = {10,20,30,40};//hranata zatvorka Altgr+F
        //i++ je identicke z (i = i + 1)

        int sum = 0;
        for (int i=0; i<values.length; i++){//cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 4
            sum = sum + values[i];  //4 cykly, zacina sa hodnotou 0, 0 + nulte pole, vysledok + prve pole, ....
            // V 1. iteracii bude sum obsahovat hodnotu 10, pretoze 0 + 10
// V 2. iteracii bude sum obsahovat hodnotu 30, pretoze 10 + 20
// V 3. iteracii bude sum obsahovat hodnotu 60, pretoze 30 + 30
// V 4. iteracii bude sum obsahovat hodnotu 100, pretoze 60 + 40
        }
        System.out.println(sum);

        //priemer
        double average = sum/ values.length;
        System.out.println(average);

    }
}
