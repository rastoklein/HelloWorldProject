package basicexample.excercises;


import java.util.Scanner;

public class MyTests {

    public static double getDatas (double a) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj hodnotu: ");
        a = scn.nextDouble();
        return a;

    }


    public static void main(String[] args) {

        System.out.println("Moje TESTOVACIE prostredie:\n");

      double a = 1;
      getDatas(a);

    }
}
