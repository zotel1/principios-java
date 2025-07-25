package com.principiante.java.clase21;

/*Crear un programa que muestre en pantalla una matriz de 2 filas y 2 columnas
con un numero dentro de cada posicion tal y como se muestra a continuación:
[5] [2]
[2] [5]*/

public class Matrices {
    public static void main(String[] args) {
        // En este caso tenemos dos filas y dos columnas
        int numeros[][] = new int[2][2];

        numeros [0][0] = 5;
        numeros [0][1] = 2;
        numeros [1][0] = 2;
        numeros [1][1] = 5;

        System.out.print("[" + numeros[0][0] + "]");
        System.out.println("[" + numeros[0][1] + "]");
        System.out.print("[" + numeros[1][0] + "]");
        System.out.print("[" + numeros[1][1] + "]");

    }
}
