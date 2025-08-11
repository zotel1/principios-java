package com.principiante.java.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Bienvenida extends JFrame implements ActionListener {

    private JTextField textField1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;

    public Bienvenida(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 0, 0));

    }
}
