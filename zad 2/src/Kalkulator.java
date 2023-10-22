import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class Kalkulator extends JFrame {

    private JPanel Kalkulator;
    private JTextField Y;
    private JButton dodawanieButton;
    private JButton mnożenieButton;
    private JButton odejmowanieButton;
    private JButton dzielenieButton;
    private JTextField wynik;
    private JTextField X;
    Double a, b, wyn;
    public Kalkulator() {

        dodawanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               a = Double.valueOf(X.getText());
               b = Double.valueOf(Y.getText());
                wyn = a+b;
                wynik.setText(String.valueOf(wyn));
            }
        });
        odejmowanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.valueOf(X.getText());
                b = Double.valueOf(Y.getText());
                wyn = a-b;
                wynik.setText(String.valueOf(wyn));
            }
        });
        mnożenieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.valueOf(X.getText());
                b = Double.valueOf(Y.getText());
                wyn = a*b;
                wynik.setText(String.valueOf(wyn));
            }
        });
        dzielenieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 a = Double.valueOf(X.getText());
                 b = Double.valueOf(Y.getText());
                if(b==0) {
                    JOptionPane.showMessageDialog(null,"Nie dziel przez zero", "Błąd", JOptionPane.ERROR_MESSAGE );
                }
                else
                 wyn = a / b;
                wynik.setText(String.valueOf(wyn));
            }
        });
    }
    public static void main(String[] args) {
        Kalkulator Kal = new Kalkulator();
        Kal.setContentPane(Kal.Kalkulator);
        Kal.setTitle("Kalkulator");
        Kal.setSize(500,500);
        Kal.setVisible(true);
        Kal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    ;
}
