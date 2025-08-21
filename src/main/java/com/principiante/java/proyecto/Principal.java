package com.principiante.java.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno, labelDepartamento,labelAntiguedad, labelResultado, labelFooter;
    private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;

    // Constructor
    public Principal(){
        setLayout(null);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        mb = new JMenuBar();
        mb.setBackground(new Color(255, 0, 0));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255, 0, 0));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255, 0, 0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255, 0, 0));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(255, 0,0 ));
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(new Color(255, 0, 0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setBounds(0, 0, 400, 500);
        principal.setVisible(true);
        principal.setResizable(false);
        principal.setLocationRelativeTo(null);
    }
}
