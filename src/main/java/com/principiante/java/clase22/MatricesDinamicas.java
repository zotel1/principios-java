package com.principiante.java.clase22;
import java.util.Scanner;

public class MatricesDinamicas {
    public static void main(String[] args) {

        int filas = 0;
        int columnas = 0;
        int contador = 1;



        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas filas quiere que contenga el programa?: ");
        filas = entrada.nextInt();

        System.out.println("Cuantas columnas quieres que tenga el programa?: ");
        columnas = entrada.nextInt();

        int numeros[][] = new int[filas][columnas];

        for(int j  = 0; j < filas; j++){
            for (int i = 0; i < columnas; i++){
                numeros[j][i] = contador;
                contador++;
                System.out.print("[" + numeros[j][i] + "]");
            }
            System.out.println("");
        }

    }
}
