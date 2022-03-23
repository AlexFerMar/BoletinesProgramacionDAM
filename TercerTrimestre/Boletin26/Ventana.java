package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana {

    private JFrame frame;
    private JPanel panel;
    private JButton click;
    private JButton borrar;
    private JTextField name;
    private JPasswordField password;
    private JTextArea textArea;
    private JLabel nameL;
    private JLabel  passwordL;

    public void construir(){

        frame=new JFrame("Boletin 26");
        frame.setSize( 550, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.DARK_GRAY);

        panel=new JPanel(null);
        panel.setBounds(50,30,450,400);
        panel.setBackground(Color.cyan);

        name=new JTextField();
        name.setBounds(200,50,200,40);
        name.setVisible(true);

        password=new JPasswordField();
        password.setBounds(200,110,200,40);
        password.setVisible(true);

        nameL=new JLabel("Nombre");
        nameL.setBounds(50,50,100,40);
        nameL.setVisible(true);

        passwordL=new JLabel("Contraseña");
        passwordL.setBounds(50,110,100,40);
        passwordL.setVisible(true);

        textArea =new JTextArea("Area de texto.");
        textArea.setBounds(50,200,350,100);
        textArea.setVisible(true);


        borrar=new JButton("Borrar");
        borrar.setBounds(270,330,100,40);
        borrar.setVisible(true);

        click=new JButton("Click");
        click.setBounds(80,330,100,40);
        click.setVisible(true);



        panel.add(password);
        panel.add(passwordL);
        panel.add(name);
        panel.add(nameL);
        panel.add(textArea);
        panel.add(borrar);
        panel.add(click);
        panel.setVisible(true);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }



}
