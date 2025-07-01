package com.principiante.java.clase10;

import java.util.Scanner;

public class SistemaControlVacacional {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        String nombre = "";

        int clave = 0, antiguedad = 0;

        System.out.println("*********************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
        System.out.println("*********************************************");
        System.out.println("");
        System.out.println("");

        System.out.println("¿Cual es el nombre del trabajador?: ");
        nombre = entrada.nextLine();
        System.out.println("");

        System.out.println("¿Cuanto tiempo de servicio tiene el trabajador?: ");
        antiguedad = entrada.nextInt();
        System.out.println("");

        System.out.println("¿Cuel es la clave del trabajador?: ");
        clave = entrada.nextInt();
        System.out.println("");

    }
}
