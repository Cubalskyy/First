package javaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Quiz {

    private JFrame frame;
    private JTextField imieTextField;
    private JTextField nazwiskoTextField;
    private Integer licznik = 0;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Quiz window = new Quiz();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Quiz() {
        initialize();
    }


    private void initialize() {

        frame = new JFrame();
        frame.setBounds(100, 100, 691, 588);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JRadioButton Windows2 = new JRadioButton("Windows ");
        JRadioButton Windows = new JRadioButton("Windows ");
        JRadioButton Compact = new JRadioButton("Compact Disc");
        JRadioButton obliczenia = new JRadioButton("Do obliczeń");
        JRadioButton zapis = new JRadioButton("Zapisu Danych");
        JRadioButton tysiac = new JRadioButton("1024");
        JRadioButton Central = new JRadioButton("Central Disc");

        JLabel licznikPunktow = new JLabel("");
        licznikPunktow.setText("0");

        Central.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Central.isSelected()) {
                    Compact.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik -= 1));

                }

            }
        });
        JRadioButton Apple = new JRadioButton("Apple");
        Apple.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Apple.isSelected()) {
                    Windows.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik -= 1));
                }

            }
        });
        JRadioButton Apple2 = new JRadioButton("Apple ");
        Apple2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Apple2.isSelected()) {
                    Windows2.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik -= 1));
                }

            }
        });


        JLabel lblNewLabel = new JLabel("Imię");
        lblNewLabel.setBounds(36, 23, 48, 14);
        frame.getContentPane().add(lblNewLabel);


        obliczenia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(obliczenia.isSelected()) {
                    zapis.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik -= 1));
                }

            }
        });
        JRadioButton dziesiec = new JRadioButton("108");
        dziesiec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(dziesiec.isSelected()) {
                    tysiac.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik -= 1));
                }

            }
        });


        JLabel lblNewLabel_1 = new JLabel("Nazwisko");
        lblNewLabel_1.setBounds(36, 59, 85, 14);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Numer indeksu");
        lblNewLabel_2.setBounds(36, 105, 105, 14);
        frame.getContentPane().add(lblNewLabel_2);

        imieTextField = new JTextField();
        imieTextField.setBounds(151, 20, 96, 20);
        frame.getContentPane().add(imieTextField);
        imieTextField.setColumns(10);

        nazwiskoTextField = new JTextField();
        nazwiskoTextField.setBounds(151, 56, 96, 20);
        frame.getContentPane().add(nazwiskoTextField);
        nazwiskoTextField.setColumns(10);

        JTextField indeksTextField = new JTextField();
        indeksTextField.setBounds(151, 102, 96, 20);
        frame.getContentPane().add(indeksTextField);
        indeksTextField.setColumns(10);

        JLabel imieNazwiskoIndeks = new JLabel("");
        imieNazwiskoIndeks.setFont(new Font("Tahoma", Font.PLAIN, 15));
        imieNazwiskoIndeks.setBounds(381, 14, 229, 62);
        frame.getContentPane().add(imieNazwiskoIndeks);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 144, 936, 26);
        frame.getContentPane().add(separator);

        JLabel lblNewLabel_3 = new JLabel("Quiz - O komputerach");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(36, 158, 366, 26);
        frame.getContentPane().add(lblNewLabel_3);

        tysiac.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if(tysiac.isSelected()) {
                    dziesiec.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik += 1));
                }

            }
        });
        tysiac.setBounds(94, 227, 109, 23);
        frame.getContentPane().add(tysiac);

        dziesiec.setBounds(305, 227, 109, 23);
        frame.getContentPane().add(dziesiec);

        JLabel lblNewLabel_4 = new JLabel("1. Ile megabajtów jest w gigabajcie?");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_4.setBounds(51, 195, 470, 25);
        frame.getContentPane().add(lblNewLabel_4);

        JLabel lblNewLabel_4_1 = new JLabel("2. Do czego jest używany twardy dysk?");
        lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_4_1.setBounds(51, 265, 470, 25);
        frame.getContentPane().add(lblNewLabel_4_1);

        zapis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(zapis.isSelected()) {
                    obliczenia.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik += 1));
                }
            }
        });

        zapis.setBounds(94, 308, 109, 23);
        frame.getContentPane().add(zapis);

        obliczenia.setBounds(305, 308, 171, 23);
        frame.getContentPane().add(obliczenia);

        JLabel lblNewLabel_4_1_1 = new JLabel("3. Od czego skrótem jest \"CD\"?");
        lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_4_1_1.setBounds(51, 348, 470, 25);
        frame.getContentPane().add(lblNewLabel_4_1_1);

        Compact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Compact.isSelected()) {
                    Central.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik += 1));
                }

            }
        });
        Compact.setBounds(94, 380, 109, 23);
        frame.getContentPane().add(Compact);

        Central.setBounds(305, 380, 109, 23);
        frame.getContentPane().add(Central);

        JLabel lblNewLabel_4_1_1_1 = new JLabel("4. Jaki jest najpopularniejszy system operacyjny?");
        lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_4_1_1_1.setBounds(51, 410, 470, 25);
        frame.getContentPane().add(lblNewLabel_4_1_1_1);

        Windows.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Windows.isSelected()) {
                    Apple.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik += 1));
                }

            }
        });
        Windows.setBounds(94, 441, 109, 23);
        frame.getContentPane().add(Windows);

        Apple.setBounds(305, 441, 109, 23);
        frame.getContentPane().add(Apple);

        JLabel lblNewLabel_4_1_1_1_1 = new JLabel("5. Jaka firma stworzyła \"Internet Explorer\"?");
        lblNewLabel_4_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_4_1_1_1_1.setBounds(51, 471, 470, 25);
        frame.getContentPane().add(lblNewLabel_4_1_1_1_1);

        Windows2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Windows2.isSelected()) {
                    Apple2.setSelected(false);
                    licznikPunktow.setText(String.valueOf(licznik += 1));
                }

            }
        });
        Windows2.setBounds(94, 502, 109, 23);
        frame.getContentPane().add(Windows2);

        Apple2.setBounds(305, 503, 109, 23);
        frame.getContentPane().add(Apple2);

        JLabel lblNewLabel_5 = new JLabel("Ilość punktów");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_5.setBounds(508, 166, 140, 33);
        frame.getContentPane().add(lblNewLabel_5);

        licznikPunktow.setFont(new Font("Tahoma", Font.PLAIN, 13));
        licznikPunktow.setBounds(508, 231, 140, 43);
        frame.getContentPane().add(licznikPunktow);

        JButton start = new JButton("Zacznij");
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                imieNazwiskoIndeks.setText(String.format("%s %s %s",
                        imieTextField.getText(),
                        nazwiskoTextField.getText(),
                        indeksTextField.getText()));

            }
        });
        start.setBounds(280, 101, 89, 23);
        frame.getContentPane().add(start);
    }
}
