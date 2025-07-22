package com.principiante.java.clase16;
import java.util.Scanner;
public class CadenaDeCaracteres {
    public static void main(String args[]){

        String nombre_uno = "", nombre_dos = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingresa el primer nombre: ");
        nombre_uno = entrada.nextLine();

        System.out.println("Por favor dame el segundo nombre: ");
        nombre_dos = entrada.nextLine();

        if (nombre_uno.equals(nombre_dos)){
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres son diferentes");
        }

        // Para que no tome en cuenta mayusculas podemos utilizar el metodo IgnireCase

        String nombre_tres = "", nombre_cuatro = "";

        Scanner entradados = new Scanner(System.in);

        System.out.println("Por favor ingresa el primer nombre: ");
        nombre_tres = entradados.nextLine();

        System.out.println("Por favor dame el segundo nombre: ");
        nombre_cuatro = entradados.nextLine();

        if (nombre_tres.equalsIgnoreCase(nombre_cuatro)){
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres son diferentes");
        }

    }
}
