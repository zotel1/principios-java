package com.principiante.java.clase7;

public class EstructurasCondicionalesAnidadad {

    public static void main(String[] args) {

        int operacion = 1;
        int num_uno = 8;
        int num_dos = 4;
        int resultado = 0;


        if(operacion == 1 ) {
            resultado = num_uno + num_dos;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operacion == 2) {
            resultado = num_uno - num_dos;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (operacion == 3) {
            resultado = num_uno * num_dos;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (operacion == 4) {
            resultado = num_uno / num_dos;
            System.out.println("El resultado de la divición es: " + resultado);
        } else
            System.out.println("El resultado de la operación que elegiste no existe.");
    }
}
