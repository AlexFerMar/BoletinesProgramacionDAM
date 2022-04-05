package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    //region GUI
    private JPanel background;
    private JLabel buttonBackground;

    private JLabel screen;


    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton dot;
    private JButton equal;
    private JButton plus;
    private JButton minus;
    private JButton multi;
    private JButton divi;
    private JButton ac;
    private JButton off;
    //endregion

    private boolean turnedOff = true;
    private String operation = "";

    public Calculadora() {

        super("Calculadora");

        this.setSize(500, 730);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        background = new JPanel(null);
        background.setBounds(0, 0, 500, 730);
        background.setBackground(new Color(204, 204, 255));

        screen = new JLabel();
        screen.setBounds(40, 40, 420, 100);
        screen.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        screen.setBackground(Color.white);
        screen.setOpaque(true);
        screen.setVisible(true);

        buttonBackground = new JLabel();
        buttonBackground.setBounds(40, 210, 420, 440);
        buttonBackground.setBackground(Color.white);
        buttonBackground.setOpaque(true);
        buttonBackground.setVisible(true);

        one = new JButton("1");
        one.setBounds(60, 450, 80, 80);
        one.setVisible(true);

        two = new JButton("2");
        two.setBounds(160, 450, 80, 80);
        two.setVisible(true);

        three = new JButton("3");
        three.setBounds(260, 450, 80, 80);
        three.setVisible(true);

        four = new JButton("4");
        four.setBounds(60, 350, 80, 80);
        four.setVisible(true);

        five = new JButton("5");
        five.setBounds(160, 350, 80, 80);
        five.setVisible(true);

        six = new JButton("6");
        six.setBounds(260, 350, 80, 80);
        six.setVisible(true);

        seven = new JButton("7");
        seven.setBounds(60, 250, 80, 80);
        seven.setVisible(true);

        eight = new JButton("8");
        eight.setBounds(160, 250, 80, 80);
        eight.setVisible(true);

        nine = new JButton("9");
        nine.setBounds(260, 250, 80, 80);
        nine.setVisible(true);

        zero = new JButton("0");
        zero.setBounds(60, 550, 80, 80);
        zero.setVisible(true);

        dot = new JButton(".");
        dot.setBounds(160, 550, 80, 80);
        dot.setVisible(true);

        equal = new JButton("=");
        equal.setBounds(260, 550, 80, 80);
        equal.setVisible(true);

        plus = new JButton("+");
        plus.setBounds(360, 550, 80, 80);
        plus.setVisible(true);

        minus = new JButton("-");
        minus.setBounds(360, 450, 80, 80);
        minus.setVisible(true);

        multi = new JButton("*");
        multi.setBounds(360, 350, 80, 80);
        multi.setVisible(true);

        divi = new JButton("/");
        divi.setBounds(360, 250, 80, 80);
        divi.setVisible(true);

        ac = new JButton("AC");
        ac.addActionListener(this);
        ac.setBounds(140, 190, 100, 40);
        ac.setVisible(true);

        off = new JButton("OFF");
        off.addActionListener(this);
        off.setBounds(260, 190, 100, 40);
        off.setVisible(true);


        background.add(one);
        background.add(two);
        background.add(three);
        background.add(four);
        background.add(five);
        background.add(six);
        background.add(seven);
        background.add(eight);
        background.add(nine);
        background.add(zero);
        background.add(dot);
        background.add(equal);
        background.add(plus);
        background.add(minus);
        background.add(multi);
        background.add(divi);
        background.add(ac);
        background.add(off);
        background.add(screen);
        background.add(buttonBackground);
        background.setVisible(true);

        this.add(background);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void onOffButtons(boolean on) {

        if (on) {
            divi.addActionListener(this);
            multi.addActionListener(this);
            minus.addActionListener(this);
            plus.addActionListener(this);
            equal.addActionListener(this);
            dot.addActionListener(this);
            zero.addActionListener(this);
            nine.addActionListener(this);
            eight.addActionListener(this);
            seven.addActionListener(this);
            one.addActionListener(this);
            two.addActionListener(this);
            three.addActionListener(this);
            four.addActionListener(this);
            five.addActionListener(this);
            six.addActionListener(this);
        } else {
            divi.removeActionListener(this);
            multi.removeActionListener(this);
            minus.removeActionListener(this);
            plus.removeActionListener(this);
            equal.removeActionListener(this);
            dot.removeActionListener(this);
            zero.removeActionListener(this);
            nine.removeActionListener(this);
            eight.removeActionListener(this);
            seven.removeActionListener(this);
            one.removeActionListener(this);
            two.removeActionListener(this);
            three.removeActionListener(this);
            four.removeActionListener(this);
            five.removeActionListener(this);
            six.removeActionListener(this);

        }


    }

    public void calculate() {


        String[] components=operation.split(" ");

        if (components[0].equals("")) components[0]=Double.toString(0);

        if (components[1].equals("+")) operation= Double.toString(Double.parseDouble(components[0])+Double.parseDouble(components[2]));
        else if (components[1].equals("-")) operation= Double.toString(Double.parseDouble(components[0])-Double.parseDouble(components[2]));
        else if (components[1].equals("*")) operation= Double.toString(Double.parseDouble(components[0])*Double.parseDouble(components[2]));
        else if (components[1].equals("/")) operation= Double.toString(Double.parseDouble(components[0])/Double.parseDouble(components[2]));

    }

    private boolean hasOperator() {

        return operation.contains("+")||operation.contains("-")||operation.contains("*")||operation.contains("/");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ac) {

            if (turnedOff) {
                turnedOff = false;
                screen.setText("HELLO");
                onOffButtons(true);
            } else {
                operation = "";
                screen.setText(operation);
            }

        }
        if (e.getSource() == off) {

            turnedOff = true;
            screen.setText("");
            operation = "";
            onOffButtons(false);
        }
        if (e.getSource() == one) {
            operation += 1;
            screen.setText(operation);
        }
        if (e.getSource() == two) {
            operation += 2;
            screen.setText(operation);
        }
        if (e.getSource() == three) {
            operation += 3;
            screen.setText(operation);
        }
        if (e.getSource() == four) {
            operation += 4;
            screen.setText(operation);
        }
        if (e.getSource() == five) {
            operation += 5;
            screen.setText(operation);
        }
        if (e.getSource() == six) {
            operation += 6;
            screen.setText(operation);
        }
        if (e.getSource() == seven) {
            operation += 7;
            screen.setText(operation);
        }
        if (e.getSource() == eight) {
            operation += 8;
            screen.setText(operation);
        }
        if (e.getSource() == nine) {
            operation += 9;
            screen.setText(operation);
        }
        if (e.getSource() == zero) {
            operation += 0;
            screen.setText(operation);
        }
        if (e.getSource() == dot) {
            operation += ".";
            screen.setText(operation);
        }
        if (e.getSource() == equal) {

            calculate();

            screen.setText(operation);
            operation="";

        }
        if (e.getSource() == plus) {

            if (hasOperator()) calculate();
             operation += " + ";
            screen.setText(operation);
        }
        if (e.getSource() == minus) {

            if (hasOperator()) calculate();
             operation += " - ";
            screen.setText(operation);
        }
        if (e.getSource() == multi) {

            if (hasOperator()) calculate();
             operation += " * ";
            screen.setText(operation);
        }
        if (e.getSource() == divi) {

            if (hasOperator()) calculate();
             operation += " / ";
            screen.setText(operation);
        }


    }


}
