package com.principiante.java.clase37;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Formulario extends JFrame implements ActionListener {

    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem menuItem1, menuItem2, menuItem3;

    public Formulario(){
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);

        menu2 =new JMenu("Tamaño de la ventana");
        menu1.add(menu2);

        menu3 = new JMenu("Color de fondo");
        menu1.add(menu3);

        menuItem1 = new JMenuItem("300*200");

    }
}
