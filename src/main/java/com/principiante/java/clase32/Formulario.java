package com.principiante.java.clase32;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextArea textArea1;
    private JScrollPane scrollPane1;
    private JButton boton1;

    String texto = "";

    public Formulario(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10, 10, 200, 30);
        add(textField1);

        boton1 = new JButton("Agregar");
        boton1.setBounds(250, 10, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        textArea1 = new JTextArea();
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10, 50, 400, 300);
        add(scrollPane1);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            texto += textField1.getText() + "\n";
            textArea1.setText(texto);
            textField1.setText("");
        }
    }

    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setLayout(null);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
        formulario1.setBounds(0,0, 540, 400);
    }
}
