package hellogui;

import javax.swing.*;
import java.awt.event.*;

public class MyInputForm extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton multiplyButton;
    private JButton addButton;
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        createMultiplyButton();
        createAddButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil Kali: ");
        dLabel = new JLabel("Hasil Tambah: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createMultiplyButton() {
        multiplyButton = new JButton("x");
        class MultiplyListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil Kali: " + String.valueOf(c));
            }
        }
        ActionListener listener = new MultiplyListener();
        multiplyButton.addActionListener(listener);
    }

    private void createAddButton() {
        addButton = new JButton("+");
        class AddListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int d = a + b;
                dLabel.setText("Hasil Tambah: " + String.valueOf(d));
            }
        }
        ActionListener listener = new AddListener();
        addButton.addActionListener(listener);
    }

    private void createPanel() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(multiplyButton);
        panel.add(cLabel);
        panel.add(addButton);
        panel.add(dLabel);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
