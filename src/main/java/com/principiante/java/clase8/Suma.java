package com.principiante.java.clase8;
import java.util.Scanner;

public class Suma {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        String nombre = "";

        int numUno = 0, numDos = 0, resultado = 0;

        System.out.println("¿Cual es tu nombre?");
        // el metodo nextLine sirve cuando queremos agregar un string de caso contrario si
        // quisieramos agregar un entero deberiamos poner nextInt
        nombre = in.nextLine();
        System.out.println("Dame el primer valor para tu suma:");
        numUno = in.nextInt();
        System.out.println("Dame el segundo valor para tu suma:");

        numDos = in.nextInt();

        resultado = numUno + numDos;

        System.out.println("Hola " + nombre + " el resultado de tu suma es: " + resultado);
    }
}
