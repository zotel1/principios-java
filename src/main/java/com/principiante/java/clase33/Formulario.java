package com.principiante.java.clase33;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    private JTextField textField1, textField2;
    private JLabel label1, label2, label3;
    private JButton boton1;

    public Formulario(){
        setLayout(null);
        label1 = new JLabel("Valor 1: ");
        label1.setBounds(50, 5, 100, 30);
        add(label1);

        label2 = new JLabel("Valor 2: ");
        label2.setBounds(50, 35, 100, 30);
        add(label2);

        label3 = new JLabel("Resultado: ");
        label3.setBounds(120, 80, 100, 30);
        add(label3);

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
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            int valor1 = 0, valor2 = 0, resultado = 0;

            valor1 = Integer.parseInt(textField1.getText());
            valor2 = Integer.parseInt(textField2.getText());

            resultado = valor1 + valor2;

            label3.setText("Resultado: " + resultado);
        }
    }

    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0, 300, 150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);

    }

}
