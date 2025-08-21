package com.principiante.java.proyecto;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
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
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215,5, 200, 30);
        label1.setForeground(new Color(0,0,0));

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setFont(new Font("Andale Mono", 0, 9));
        textArea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE CRISTIAN." +
                "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                "\n            C.  CRISTIAN NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                "\n          (CRISTIAN), NO SE RESPONSABILIZA DEL USO QUE USTED" +
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                "\n          https://cristian-sigel-web-development.vercel.app/");
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10, 40, 575, 200);
        add(scrollPane1);

        check1 = new JCheckBox("Yo Acepto");
        check1.setBounds(10, 250, 300, 30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120, 290,100, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/images/coca-cola.png"));
        label2 = new JLabel(imagen);
        label2.setBounds(315, 135, 300,300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e){

    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        Licencia licencia = new Licencia();
        licencia.setBounds(0,0, 600, 400);
        licencia.setVisible(true);
        licencia.setResizable(false);
        licencia.setLocationRelativeTo(null);
    }
}
