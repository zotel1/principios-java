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

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));
        miMorado.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setForeground(new Color(255, 0,0));
        menuColorFondo.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale mono", 1, 14));
        miSalir.setForeground(new Color(255, 0, 0));
        menuColorFondo.addActionListener(this);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/images/logo-coca.png"));
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 250, 100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido");
        labelBienvenido.setBounds(280, 30, 300, 50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new Color(255, 255, 255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre completo:");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255, 255, 255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 213, 150, 25);
        txtNombreTrabajador.setBackground(new Color(224, 224, 224));
        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtNombreTrabajador);

        labelAPaterno = new JLabel("Apellido Paterno");
        labelAPaterno.setBounds(25, 248, 180, 25);
        labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAPaterno.setForeground(new Color(255, 255, 255));
        add(labelAPaterno);

        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25, 273, 150, 25);
        txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAPaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtAPaternoTrabajador);

        labelAMaterno = new JLabel("Apellido Materno");
        labelAMaterno.setBounds(25, 308, 180, 25);
        labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(new Color(255, 255, 255));
        add(labelAMaterno);

        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25, 334, 150, 25);
        txtAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAMaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtAMaternoTrabajador);

        labelDepartamento = new JLabel("Selecciona el Departamento:");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new Color(255, 255, 255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new Color(224, 224, 224));
        comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new Color(255, 0, 0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atencion al Cliente");
        comboDepartamento.addItem("Departamento de Logística");
        comboDepartamento.addItem("Departamento de Gerencia");

        labelAntiguedad = new JLabel("Selecciona la Antiguedad:");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255, 255, 255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new Color(224, 224, 224));
        comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(new Color(255, 0, 0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 años o más de servicio");

        labelResultado = new JLabel("Resultado del Cálculo");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new Color(255, 0, 0));
        add(labelResultado);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(224, 224, 224));
        textArea1.setFont(new Font("Andale Mono", 1, 11));
        textArea1.setForeground(new Color(255, 0, 0));
        textArea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(220, 333, 385, 90);
        add(scrollPane1);

        labelFooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
        labelFooter.setBounds(135, 445, 500, 30);
        labelFooter.setFont(new Font("Andale Mono", 1, 12));
        labelFooter.setForeground(new Color(255, 255, 255));
        add(labelFooter);
    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setBounds(0, 0, 700, 800);
        principal.setVisible(true);
        principal.setResizable(false);
        principal.setLocationRelativeTo(null);
    }
}
