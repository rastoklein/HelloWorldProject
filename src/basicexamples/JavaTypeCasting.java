package basicexamples;

public class JavaTypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // String str = myInt; // Is not possible
        // System.out.println(str);

        float myFloat = 1.234f;

        double myDouble2 = 9.48d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.48
        System.out.println(myInt2);      // Outputs 9

        double x = 5;
        double x2 = 5d;

        System.out.printf("%f%n",x);
        System.out.printf("%f",x2);


    }
}
