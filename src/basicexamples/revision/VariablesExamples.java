package basicexamples.revision;

public class VariablesExamples {
    public static void main(String[] args) {
    /*
    Zadanie: Trieda vypíše nasledujúci text do konzoly, pričom hodnoty ako dátum, známka, rok a aktuálny dátum môže používateľ meniť cez premenné.
    Text bude nasledovný:
    Študent Jozef Mrkvička sa narodil 3.4.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
    V Bratislave dňa 18.06.2022
     */
    String text1 = "Študent Jozef Mrkvička sa narodil ";
    String date = "03.04.2000";
    String text2 = ",z maturitnej skúšky má známku ";
    Float grade = 1.5f;  //TODO Print grade with comma
       grade +=0.5f;  //alternativny zapis:  grade = grade + 0.5;
    String gradeWithComma = String.format("%.1f", grade);
    String text3 = " a od septembra ";
    int year = 2022;
    String text4= " nastúpi do nového zamestania ako Java programátor\n ";
    String text5 = "\t V Bratislave dňa ";
    String currentDate = String.valueOf(java.time.LocalDate.now());  //get current date, but wiht problem format, firstly year


    String wholeText = text1 + date + text2 + gradeWithComma + text3 + year + text4 + text5 + currentDate;

        System.out.println(wholeText);
    }

}
