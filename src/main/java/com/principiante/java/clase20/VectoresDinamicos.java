package com.principiante.java.clase20;
import java.util.Scanner;

public class VectoresDinamicos {

    public static void main(String[] args) {
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuantos numeros desea ingresar?: ");
        longitud = entrada.nextInt();

        int numeros[] = new int[longitud];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Por favor dame el valor #" + (i + 1));
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.print("[" + numeros[i] + "]");
        }
    }
}
