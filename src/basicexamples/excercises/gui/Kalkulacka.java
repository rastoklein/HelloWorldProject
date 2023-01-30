package basicexample.excercises.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

//TODO Doplnit tlacidla s jednotlivymi cislami a matematickymi operatormi + - * / a =
//TODO Kalkulacka bude pocitac 2 cisla po zatlaceni rovna sa (=). Samozrejme medzi cislami zadame spravny operator
public class Kalkulacka {
    private static  String operacia;
    private static double cislo1;
    private static boolean jeVysledok = false;

    public static void main(String[] args) {

        /*
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception ignored) {

         */

        JFrame okno = new JFrame("Hello World Swing"); // vytvorime okno
        okno.setMinimumSize(new Dimension(400, 300));
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo okno) tak sa zatvori standardne

        // JFrame resp. okno by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny, tzn. ze pre kazdy vlozeny vizualny prvok
        okno.setContentPane(panel); // my dany panel pridame do okno


        // JText
        JTextField textovePoleDisplejKalkulacky = new JTextField();
        textovePoleDisplejKalkulacky.setBounds(100, 20, 200, 30); // x, y, sirka, vyska
        textovePoleDisplejKalkulacky.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textovePoleDisplejKalkulacky);

        JButton tlacidloC = new JButton("C"); // tlacidlo
        tlacidloC.setBounds(100, 100, 100, 20); // x, y, sirka, vyska

        tlacidloC.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                textovePoleDisplejKalkulacky.setText("0");  //po stlaceni klavesy C zobrazi nulu a vymaze displej
            }
        });
        panel.add(tlacidloC);


        JButton tlacidlo1 = new JButton("1"); // tlacidlo
        tlacidlo1.setBounds(70, 150, 60, 20); // x, y, sirka, vyska

        tlacidlo1.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                // do pola displeja kalkulacky vpiseme hodnotu 1, ale predtym musime k nej pridat (scitat) aktualnu hodnotu,
            // ktora je zobrazena na displeji, cize textovePoleDisplejKalkulacky.getText()

                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "1");
            }
        });
        panel.add(tlacidlo1);


        JButton tlacidlo2 = new JButton("2"); // tlacidlo
        tlacidlo2.setBounds(130, 150, 60, 20); // x, y, sirka, vyska

        tlacidlo2.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "2");
            }
        });
        panel.add(tlacidlo2);

        JButton tlacidlo3 = new JButton("3"); // tlacidlo
        tlacidlo3.setBounds(180, 150, 60, 20); // x, y, sirka, vyska

        tlacidlo3.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "3");
            }
        });
        panel.add(tlacidlo3);


        JButton tlacidlo4 = new JButton("4"); // tlacidlo
        tlacidlo4.setBounds(70, 180, 60, 20); // x, y, sirka, vyska

        tlacidlo4.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                // do pola displeja kalkulacky vpiseme hodnotu 1, ale predtym musime k nej pridat (scitat) aktualnu hodnotu,
                // ktora je zobrazena na displeji, cize textovePoleDisplejKalkulacky.getText()
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "4");
            }
        });
        panel.add(tlacidlo4);


        JButton tlacidlo5 = new JButton("5"); // tlacidlo
        tlacidlo5.setBounds(130, 180, 60, 20); // x, y, sirka, vyska

        tlacidlo5.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "5");
            }
        });
        panel.add(tlacidlo5);

        JButton tlacidlo6 = new JButton("6"); // tlacidlo
        tlacidlo6.setBounds(180, 180, 60, 20); // x, y, sirka, vyska

        tlacidlo6.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "6");
            }
        });
        panel.add(tlacidlo6);

        JButton tlacidlo = new JButton("7"); // tlacidlo
        tlacidlo.setBounds(70, 210, 60, 20); // x, y, sirka, vyska

        tlacidlo.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                // do pola displeja kalkulacky vpiseme hodnotu 1, ale predtym musime k nej pridat (scitat) aktualnu hodnotu,
                // ktora je zobrazena na displeji, cize textovePoleDisplejKalkulacky.getText()
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "7");
            }
        });
        panel.add(tlacidlo);


        JButton tlacidlo8 = new JButton("8"); // tlacidlo
        tlacidlo8.setBounds(130, 210, 60, 20); // x, y, sirka, vyska

        tlacidlo8.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "8");
            }
        });
        panel.add(tlacidlo8);

        JButton tlacidlo9 = new JButton("9"); // tlacidlo
        tlacidlo9.setBounds(180, 210, 60, 20); // x, y, sirka, vyska

        tlacidlo9.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "9");
            }
        });
        panel.add(tlacidlo9);

        JButton tlacidlo0 = new JButton("0"); // tlacidlo
        tlacidlo0.setBounds(130, 240, 60, 20); // x, y, sirka, vyska

        tlacidlo0.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "0");
            }
        });
        panel.add(tlacidlo0);




        JButton tlacidloPlus = new JButton("+"); // tlacidlo
        tlacidloPlus.setBounds(260, 150, 60, 20); // x, y, sirka, vyska

        tlacidloPlus.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "+");



            }
        });
        panel.add(tlacidloPlus);

        JButton tlacidloMinus = new JButton("-"); // tlacidlo
        tlacidloMinus.setBounds(260, 180, 60, 20); // x, y, sirka, vyska

        tlacidloMinus.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "-");



            }
        });
        panel.add(tlacidloMinus);

        JButton tlacidloRovnasa = new JButton("="); // tlacidlo
        tlacidloRovnasa.setBounds(260, 210, 60, 20); // x, y, sirka, vyska

        tlacidloRovnasa.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                String obsahDisplejaKalkulacky = textovePoleDisplejKalkulacky.getText();
                //obsah displeja kalkulacky rozdelime na dve casti, pred pluskom a za pluskom
                String [] castiStringu = obsahDisplejaKalkulacky.split("\\+");
                double cislo1 = Double.parseDouble(castiStringu[0]);
                double cislo2 = Double.parseDouble(castiStringu[1]);
                double vysledok = cislo1 + cislo2;
                jeVysledok = true;

                textovePoleDisplejKalkulacky.setText(String.valueOf(vysledok));


                System.out.println(obsahDisplejaKalkulacky);
                System.out.println(cislo1);
                System.out.println(cislo2);

            }
        });
        panel.add(tlacidloRovnasa);

        



        // display it
        okno.pack();
        okno.setVisible(true);

    }
}
