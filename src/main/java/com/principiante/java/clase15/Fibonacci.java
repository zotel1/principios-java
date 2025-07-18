package com.principiante.java.clase15;
// Realizar un programa que imprima en pantalla la sucesion fiboinacci
// utilizando las estructuras repetitivas: for, while y do-while

public class Fibonacci {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34


    public static void main(String args[]){

        int i = 0, a = 0, b = 1, c = 0;

        System.out.println("serie con for: ");
        for(i = 0; i < 10; i++){
            if (i < 9) {
                System.out.println(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.println(a);
            }
        }
         i = 0;
         a = 0;
         b = 1;
         c = 0;

        System.out.println("Ciclo while");

        while (i < 10){
            if (i < 9) {
                System.out.println(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.println(a);
            }
            i++;
        }
    }
}
