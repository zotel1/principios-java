package com.principiante.java.clase24;
import javax.swing.*;

public class Formulario extends JFrame {
    private JLabel label1;

    // Constructor
    public Formulario() {
    setLayout(null);
    label1 =new
    JLabel("Arrancamos a practicar con interfaces graficas!");
    label1.setBounds(10,20,200,300);
    add(label1);
    }

    public static void main(String args[]){
        Formulario formulario1 = new Formulario();
        //arrancamos en el medio por eso tiene 0,0 Ancho 400 px y alto 300 px
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        // Con esto decimos quie nuestra pantalla aparezca al centro de la pantalla
        formulario1.setLocationRelativeTo(null);
    }

}
