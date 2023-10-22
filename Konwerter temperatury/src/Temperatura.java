import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperatura extends JFrame {
    private JButton konwertujButton;
    private JTextField dane;
    private JPanel Konwersja;
    private JTextField wynik;

    public Temperatura() {

        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Cel=dane.getText();
                Double x=Double.parseDouble(Cel);
                Double F=x*1.8+32;
                String Far=String.valueOf(F);
                wynik.setText(Far);

            }
        });
    }

    public static void main(String[] args) {
        Temperatura Kon = new Temperatura();
        Kon.setContentPane(Kon.Konwersja);
        Kon.setTitle("Konwersja temperatur");
        Kon.setSize(300,300);
        Kon.setVisible(true);
        Kon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    };
}

