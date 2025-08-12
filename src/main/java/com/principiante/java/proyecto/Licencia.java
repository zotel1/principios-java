package com.principiante.java.proyecto;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class Licencia extends JFrame implements ChangeListener, ActionListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;

    public Licencia(){
        setLayout(null);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215,5, 200, 30);
        label1.setForeground(new Color(0,0,0));

        textArea1 = new JTextArea();
        textArea1.setFont(new Font("Andale Mono", 0, 9));
        textArea1.setText("Términos y condiciones");
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10, 40, 575, 200);
        add(scrollPane1);
    }
}
