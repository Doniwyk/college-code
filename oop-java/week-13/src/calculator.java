import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame implements ActionListener {
    static JFrame f;
    static JTextField l;
    String s0, s1, s2;

    Calculator() {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[]) {
        f = new JFrame("Calculator");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Calculator c = new Calculator();

        l = new JTextField(16);
        l.setEditable(false);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plus, minus, divide, multiply, dot, equals, clear;

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        equals = new JButton("=");

        plus = new JButton("+");
        minus = new JButton("-");
        divide = new JButton("/");
        multiply = new JButton("*");

        dot = new JButton(".");

        clear = new JButton("C");

        Dimension buttonSize = new Dimension(40, 40);
        b0.setPreferredSize(buttonSize);
        b1.setPreferredSize(buttonSize);
        b2.setPreferredSize(buttonSize);
        b3.setPreferredSize(buttonSize);
        b4.setPreferredSize(buttonSize);
        b5.setPreferredSize(buttonSize);
        b6.setPreferredSize(buttonSize);
        b7.setPreferredSize(buttonSize);
        b8.setPreferredSize(buttonSize);
        b9.setPreferredSize(buttonSize);
        plus.setPreferredSize(buttonSize);
        minus.setPreferredSize(buttonSize);
        divide.setPreferredSize(buttonSize);
        multiply.setPreferredSize(buttonSize);
        dot.setPreferredSize(buttonSize);
        equals.setPreferredSize(buttonSize);
        clear.setPreferredSize(buttonSize);

        JPanel p = new JPanel(new GridLayout(4, 4, 5, 5));

        plus.addActionListener(c);
        minus.addActionListener(c);
        multiply.addActionListener(c);
        divide.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        dot.addActionListener(c);
        equals.addActionListener(c);
        clear.addActionListener(c);

        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(divide);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(multiply);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(minus);
        p.add(b0);
        p.add(dot);
        p.add(plus);
        p.add(equals);

        f.add(l, BorderLayout.NORTH);
        f.add(p, BorderLayout.CENTER);

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;

            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            s0 = s1 = s2 = "";
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {
            double te;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            l.setText(s0 + s1 + s2 + "=" + te);
            s0 = Double.toString(te);
            s1 = s2 = "";
        }
        else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double te;
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                s0 = Double.toString(te);
                s1 = s;
                s2 = "";
            }
            l.setText(s0 + s1 + s2);
        }
    }
}
