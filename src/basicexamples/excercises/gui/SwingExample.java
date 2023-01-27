package basicexample.excercises.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class SwingExample {
    public static void main(String[] args) {

        //lepsi vizual do Windowsu
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception ignored) {

        }


        JFrame frame = new JFrame("Hello World JSwing");  //vytvorenie Objektu - okna
        frame.setMinimumSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //ked kliknem na X na okne okno sa zatvori

        //jFrame by mal obsahovat JPanel = Kontajner
        JPanel panel = new JPanel();
        panel.setLayout(null);  //layout pre panel bude null, cize prazdny
        frame.setContentPane(panel);  //dany panel pridame do frame

        //TextField
        JTextField textField = new JTextField();
        textField.setBounds(100,20,200,30);  //x,y, sirka vyska
        textField.setHorizontalAlignment(JTextField.RIGHT);  //kurzor zacne pisat zprava do lava
        panel.add(textField);

        //popisok
        JLabel labelText = new JLabel("textovy popisok");
        labelText.setBounds(100,50,100,20);
        panel.add(labelText);

        //Tlacidlo
        JButton btn0k = new JButton("Stlac ma, vypis ma");
        btn0k.setBounds(100,100,100,20);

     /*   btn0k.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Stlačil si ok!");
                labelText.setText("Stlačil si ok!");
            }
                                });*/

        //vypiseme zadany text do Konzoly a do Frame
        btn0k.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
                labelText.setText(textField.getText());
            }
        });
            panel.add(btn0k);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(210, 100, 100, 20);

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        panel.add(btnCancel);


        frame.pack();
        frame.setVisible(true);



    }
}
