package com.principiante.java.clase33;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    private JTextField textField1, textField2;
    private JLabel label1, label2;
    private JButton boton1;

    public Formulario(){
        setLayout(null);
        label1 = new JLabel("Valor 1: ");
        label1.setBounds(50, 5, 100, 30);
        add(label1);

        label2 = new JLabel("Valor 2: ");
        label2.setBounds(50, 35, 100, 30);
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(120, 10, 150, 20);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(120, 40, 150, 20);
        add(textField2);

        boton1 = new JButton("Sumar");
        boton1.setBounds(10,80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }

}
