package com.principiante.java.clase6;

public class EstructurasCondicionales {

    public static void main(String args[]) {
        int matematicas = 3;
        int biologia = 8;
        int quimica = 5;
        int promedio = 0;

        promedio = (matematicas + biologia + quimica) / 3;

        if (promedio >=6) {
            System.out.println("El alumno aprobo con: " + promedio);
        } else {
            System.out.println("El alumno reprobo con: " + promedio);
        }
    }
}
