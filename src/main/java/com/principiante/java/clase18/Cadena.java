package com.principiante.java.clase18;
import java.util.Scanner;

/*Realizar un programa que solicite desde teclado una cadena de caracteres,
* posteriormente el programa debe indicar a través de un mensaje en pantalla,m la cantidad de caracteres que pose dicha cadenqa.
* Finalmente el programa debe preguntar al usuario,
* ¿ que parte de la cadena desea obtener? tal y como se vio en el ejemplo pasado.*/

public class Cadena {

    public static void main(String[] args) {
        String cadena_original = "", cadena_substraccion = "";

        int num_caracteres = 0, desde = 0, hasta = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres: ");

        cadena_original = in.nextLine();

        num_caracteres = cadena_original.length();

        System.out.println("La cadena de caracteres " + cadena_original + " pose " + num_caracteres + " caracteres.");

        System.out.println("¿Desde que caracter deseas obtener la nueva cadena?: ");
        desde = in.nextInt();
        System.out.println("¿Hasta que caracter deseas obtener la nueva cadena?: ");
        hasta = in.nextInt();

        cadena_substraccion = cadena_original.substring(desde, hasta);
        System.out.println("La nueva cadena es: " + cadena_substraccion);
    }
}
