package basicexamples.excercises;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("zadaj percento testu: ");
        int percent = scn.nextInt();   //input value for percent is int

        if (percent >90){
            System.out.println("známka A");
        } else if (percent >75) {
            System.out.println("známka B");
        } else if (percent >65) {
            System.out.println("známka C");
        } else {                             //zvyskova podmienka (iba else)
            System.out.println("známka D. Nespravil si test.");
        }
    }
}
