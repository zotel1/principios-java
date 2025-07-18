package com.principiante.java.clase15;
// Realizar un programa que imprima en pantalla la sucesion fiboinacci
// utilizando las estructuras repetitivas: for, while y do-while

public class Fibonacci {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34


    public static void main(String args[]){

        int a = 0, b = 1, c = 0;

        for(int i = 0; i < 10; i++){
            System.out.println(a + ",");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
