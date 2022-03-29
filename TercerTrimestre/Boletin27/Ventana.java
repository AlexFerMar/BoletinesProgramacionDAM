package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana {

    private JFrame frame;

    private JPanel panelSuperior;
    private JButton escribir;
    private JButton borrar;
    private JTextField name;
    private JPasswordField password;
    private JLabel nameL;
    private JLabel  passwordL;

    private JPanel panelInferior;
    private JList list;
    private JButton boton;
    private JTextArea textArea;



    public void construir(){

        //Creamos el frame
        frame=new JFrame("Boletin 26");
        frame.setSize( 530, 700);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.DARK_GRAY);

        //region Panel Superior
        panelSuperior =new JPanel(null);
        panelSuperior.setBounds(30,30,450,290);
        panelSuperior.setBackground(Color.cyan);

        //Nombre y contraseña
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

        //botones
        borrar=new JButton("Borrar");
        borrar.setBounds(270,220,100,40);
        borrar.setVisible(true);

        escribir =new JButton("Escribir");
        escribir.setBounds(80,220,100,40);
        escribir.setVisible(true);


        panelSuperior.add(password);
        panelSuperior.add(passwordL);
        panelSuperior.add(name);
        panelSuperior.add(nameL);
        panelSuperior.add(borrar);
        panelSuperior.add(escribir);
        panelSuperior.setVisible(true);
        //endregion

        //region Panel Inferior

        panelInferior =new JPanel(null);
        panelInferior.setBounds(30,350,450,280);
        panelInferior.setBackground(Color.cyan);

        //Lista
        list=new JList<>(new String []{"ElementoLista1","ElementoLista2","ElementoLista3"});
        list.setBounds(20,30,160,170);
        list.setVisible(true);

        //Boton
        boton=new JButton("Boton");
        boton.setBounds(220,90,70,40);
        boton.setVisible(true);

        //Area de texto
        textArea=new JTextArea("AREA DE TEXTO");
        textArea.setBounds(340,60,100,130);
        textArea.setVisible(true);


        panelInferior.add(list);
        panelInferior.add(boton);
        panelInferior.add(textArea);
        panelInferior.setVisible(true);
        //endregion


        frame.add(panelSuperior);
        frame.add(panelInferior);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}